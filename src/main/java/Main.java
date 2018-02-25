import tree.BinarySearchTree;
import tree.Node;

public class Main {

    public static void main(String[] args) {
        BinarySearchTree<Integer,Integer> binarySearchTree = new BinarySearchTree<>();
        binarySearchTree.insert(50,1);
        binarySearchTree.insert(40,1);
        binarySearchTree.insert(30,1);
        binarySearchTree.insert(20,1);
    }
}
