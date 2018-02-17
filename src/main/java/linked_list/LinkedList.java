package linked_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LinkedList<T extends Number> {

    private Node head;
    private Node middle;

    public LinkedList(){
        this.head = new Node();
        this.middle = null;
    }

    public Node getHead() {
        return head;
    }

    /**
     * insert node after prevNode
     * @param prevNode
     * @param data
     */
    public void insert(Node prevNode,T data){
        if(prevNode==null)
            return;
        if(prevNode.next==null){
            prevNode.next = new Node<>(data);
            return;
        }
        Node next = prevNode.next;
        prevNode.next = new Node<>(data);
        prevNode.next.next = next;
    }

    /**
     * adds data at the end of linked list
     * @param data
     * @return void
     */
    public void push(T data){
        if(this.head==null){
            this.head = new Node<>(data);
            return;
        }
        Node current = head;
        while(current.next!=null){
            current = current.next;
        }
        current.next = new Node<>(data);
    }

    /**
     * adds data at the beginning of linked list
     * @param data
     */
    public void pushFront(T data){
        Node newHead = new Node<>(data);
        newHead.next = this.head;
        this.head = newHead;
    }

    /**
     *print elements of linked list
     */
    public void print(){
        if(head==null)
            return;
        Node current = head;
        do{
            System.out.print(current.getData()+" ");
            current = current.next;
        }while(current!=null);
        System.out.println();
    }

    /**
     *
     * @return size of linked list
     */
    public int size(){
        Node current = head;
        int s=0;
        while(current!=null){
            current = current.next;
            s++;
        }
        return s;
    }

    /**
     *delete element from linked list
     * @param data
     * @return void
     */
    public void deleteWithValue(T data){
        if(head==null){
            return;
        }
        if(head.getData()==data){
            head = head.next;
            return;
        }
        Node current = head;
        while(current.next!=null){
            if(current.next.getData()==data){
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    /**
     *
     * @param data
     * @return null if no such data or Node otherwise
     */
    public Node getNode(T data){
        Node current = head;
        while(current.next!=null){
            if(current.getData().equals(data))
                break;
            current = current.next;
        }
        return current.next==null ? null:current;
    }

    /**
     * print element in reversed order
     */
    public void PrintReverse(){
        List<Integer> list = new ArrayList<>();
        Node current = this.head;
        while(current!=null){
            list.add(Integer.valueOf(current.getData().toString()));
            current = current.next;
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }

    public boolean hasCycle() {
        if(this.head == null){
            return false;
        }
        Node slow = this.head;
        Node fast = head.next;
        while(fast!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    /**
     *reversed linked list using recursion
     */
    public void printRecursion(Node n) {
        if(n.next == null){
            System.out.println(n.getData());
            return;
        }
        printRecursion(n.next);
        System.out.println(n.getData());
    }

    private Node middle(Node node){
        int size = this.size();
        size/=2;
        Node current = node;
        while(size>0){
            current = current.next;
            size--;
        }
        return current;
    }


    public boolean isPalindrome(Node node){


    }

}
