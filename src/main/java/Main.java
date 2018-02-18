import linked_list.LinkedList;
import linked_list.*;
import stack.Stack;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.push(2);
        linkedList.push(1);
        linkedList.push(5);
        linkedList.push(8);
        linkedList.printReverse();
    }
}
