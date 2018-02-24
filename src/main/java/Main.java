import tree.BinarySearchTree;

public class Main {

    public static void main(String[] args) {
        BinarySearchTree<Integer,Integer> binarySearchTree = new BinarySearchTree<>();
        binarySearchTree.insert(50,1);
        binarySearchTree.insert(19,1);
        binarySearchTree.insert(55,2);
        binarySearchTree.insert(20,3);
        binarySearchTree.insert(23,3);
        binarySearchTree.insert(21,3);
        binarySearchTree.delete(19);
        binarySearchTree.print();
    }
}
