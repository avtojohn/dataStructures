import linked_list.LinkedList;
import linked_list.*;
import stack.Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.push(2);
        linkedList.push(1);
        linkedList.push(5);
        linkedList.push(8);
        linkedList.printReverse();

        Set<Integer> set = new TreeSet<>();

        List<Integer> list = new ArrayList<>(set);
    }
}
