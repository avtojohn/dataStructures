import linked_list.LinkedList;
import linked_list.*;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.push(2);
        linkedList.push(4);
        linkedList.pushFront(5);
        linkedList.print();
        Node node = linkedList.getHead();
       // linkedList.printRecursion(node);
    }
}
