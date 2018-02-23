import linked_list.LinkedList;
import linked_list.*;
import stack.Stack;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.push(2);
        linkedList.push(1);
        linkedList.push(1);
        linkedList.push(2);
        System.out.println(linkedList.isPalindrome());
    }
}
