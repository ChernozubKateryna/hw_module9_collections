import dto.Node;
import util.CollectionsUtil;

public class MyLinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    public void add(E value) {
        Node<E> element = new Node<>(value);
        if (isEmptyList()) {
            tail = element;
            head = element;
        } else {
            addToEnd(element);
        }
        size++;
    }

    private void addToEnd(Node<E> element) {
        element.setPrevious(tail);
        tail.setNext(element);
        tail = element;
    }

    public void remove(int index) {
        Node<E> elementToRemove = getElementByIndex(index);
        if (elementToRemove.hasPrevious()) {
            elementToRemove.getPrevious().setNext(elementToRemove.getNext());
        } else {
            head = elementToRemove.getNext();
        }
        if (elementToRemove.hasNext()) {
            elementToRemove.getNext().setPrevious(elementToRemove.getPrevious());
        } else {
            tail = elementToRemove.getPrevious();
        }
        size--;
    }

    public int getSize() {
        return size;
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    public E get(int index) {
        Node<E> element = getElementByIndex(index);
        return element.getValue();
    }

    private Node<E> getElementByIndex(int index) {
        CollectionsUtil.validateIndex(index, this.size);
        Node<E> currentElement = head;
        for (int i = 0; i < index; i++) {
            currentElement = currentElement.getNext();
        }
        return currentElement;
    }

    private boolean isEmptyList() {
        return head == null && tail == null;
    }

    public String toString(String className) {
        StringBuilder stringBuilder = new StringBuilder(className + ": [" + size + "] [");
        Node<E> currentNode = head;

        while (currentNode != null) {
            stringBuilder.append(currentNode.toString());
            currentNode = currentNode.getNext();
            if (currentNode != null) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public void println() {
        System.out.println(this.toString("MyLinkedList"));
    }

    public void removeLast() {
        if(!isEmptyList()) {
            tail = tail.getPrevious();
            if (tail == null) {
                head = tail;
            } else {
                tail.setNext(null);
            }
            size--;
        }
    }

    public E getTail() {
        return tail == null ? null : tail.getValue();
    }
}
