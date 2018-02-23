package tree;

 class Node<Key extends Comparable<Key>,Value> {
    private Value value;
    private Key key;
    public Node<Key,Value> left;
    public Node<Key,Value> right;
    public Node<Key,Value> parent;
}
