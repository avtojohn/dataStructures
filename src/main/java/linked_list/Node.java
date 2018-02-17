package linked_list;

public class Node<T extends Number> {
    private T data;
    public Node next;

    public Node(){

    }

    public Node(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}
