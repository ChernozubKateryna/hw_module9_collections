package dto;

public class Node<T> {
    private Node next;
    private Node previous;
    private T value;

    public Node(T value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public boolean hasNext() {
        return this.next != null;
    }

    public boolean hasPrevious() {
        return this.previous != null;
    }

    @Override
    public String toString() {
        return value == null ? null : value.toString();
    }
}
