package linked_list;

public class LinkedList<T extends Number> {

    private Node head;

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
            if(current.getData() == data)
                break;
            current = current.next;
        }
        return current.next==null ? null:current;
    }
}
