package tree;

public class BinarySearchTree<Key extends Comparable<Key>,Value> {

    private Node<Key,Value> root;

    public BinarySearchTree(){
        this.root = null;
    }

    public void insert(Key key,Value value){
            this.root = insertRecursion(root, key, value);
    }

    private Node insertRecursion(Node node,Key key,Value value){
        if(node == null){
            node=new Node<>(key,value);
            return node;
        }
        if(node.getKey().compareTo(key) < 0){
             node.right = insertRecursion(node.right,key,value);
        }
        if(node.getKey().compareTo(key) > 0){
             node.left = insertRecursion(node.left,key,value);
        }
        int div = balanceValue(node.left,node.right);
        if(div > 1){
            if(height(node.left.left)>=height(node.left.right)){
                node = rightRotate(node);
            }
            else{
                node = leftRotate(node.left);
                node = rightRotate(node);
            }
        }
        if(div < -1){
            if(height(node.right.right)>=height(node.right.left)){
                node = leftRotate(node);
            }
            else{
                node = rightRotate(node.left);
                node = leftRotate(node);
            }
        }
        return node;
    }

    private int balanceValue(Node left,Node right){
        return height(left)-height(right);
    }

    public Node contains(Key key){
        return search(root,key);
    }

    private Node search(Node root,Key key){
        if(root.getKey().equals(key)){
            return root;
        }
        if(root.getKey().compareTo(key) == -1){
            return search(root.right,key);
        }
        if(root.getKey().compareTo(key) == 1){
            return search(root.left,key);
        }
        return null;
    }

    private void delete(Node root,Key key){
        if(root.getKey().equals(key)){
            Node right = this.root.right;
            Node left = this.root.left;
            this.root.left = null;
            this.root.right = null;
            this.root = right;
            min(this.root.right).left = left;
            return;
        }
        if(root.left != null) {
            if (root.left.getKey().equals(key)) {
                Node left = root.left.left;
                Node right = root.left.right;
                root.left = null;
                root.left = right;
                if(root.left != null) {
                    min(root.left).left = left;
                }
                return;
            }
        }
        if(root.right != null) {
            if (root.right.getKey().equals(key)) {
                Node left = root.right.left;
                Node right = root.right.right;
                root.right = null;
                root.right = right;
                if (root.right != null) {
                    if (left != null) {
                        min(root.right).left = left;
                    }
                } else {
                    root.right = left;
                }
                return;
            }
        }
        if(root.getKey().compareTo(key) == -1){
            delete(root.right,key);
        }
        if(root.getKey().compareTo(key) == 1){
            delete(root.left,key);
        }
    }

    public void delete(Key key){
        delete(this.root,key);
    }

    public void print(){
        inorderTraversal(this.root);
    }

    public void inorderTraversal(Node root){
        if(root != null){
            inorderTraversal(root.left);
            System.out.println(root.getKey());
            inorderTraversal(root.right);
        }
    }

    public int treeHeight(){
        return height(root);
    }

    private int height(Node root){
        if(root == null){
            return -1;
        }
        return Math.max(height(root.left),height(root.right))+1;
    }

    private Node min(Node root){
        Node cuurent = root;
        while(cuurent.left != null){
            cuurent = cuurent.left;
        }
        return cuurent;
    }

    public Node minTree(){
        return min(root);
    }

    private Node max(Node root){
        Node cuurent = root;
        while(cuurent.right != null){
            cuurent = cuurent.right;
        }
        return cuurent;
    }

    public Node maxTree(){
        return max(root);
    }

    private Node leftRotate(Node node){
        return null;
    }

    private Node rightRotate(Node node){
        Node newRoot = node.left;
        node.left = root.left.right;
        newRoot.right = node;
        newRoot.height = height(newRoot);
        return newRoot;
    }

}
