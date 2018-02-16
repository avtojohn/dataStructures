import linked_list.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.push(2);
        linkedList.push(4);
        linkedList.pushFront(5);
        linkedList.insert(linkedList.getNode(2),9);
        linkedList.print();
    }
}
