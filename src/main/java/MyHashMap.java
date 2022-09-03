import dto.HashNode;

import javax.xml.bind.ValidationException;

public class MyHashMap<K, V> {
    private HashNode<K, V> head;
    private HashNode<K, V> tail;
    private int size;

    public MyHashMap() {
        head = null;
        tail = null;
        size = 0;
    }

    public void add(K key, V value) {
        HashNode<K, V> nodeToAdd = new HashNode<K, V>(key, value);

        if (tail == null) {
            tail = nodeToAdd;
            head = tail;
        } else {
            tail.setNext(nodeToAdd);
            tail = nodeToAdd;
        }
        size++;
    }

    public void put(K key, V value) throws ValidationException {
        validateKey(key);
        validateValue(value);

        HashNode<K, V> foundNode = getNode(key);
        if (foundNode == null) {
            insertNode(new HashNode<>(key, value));
            size++;
        } else {
            foundNode.setValue(value);
        }

    }

    private void insertNode(HashNode<K, V> nodeToInsert) {
        if (head == null) {
            //the list is empty
            head = nodeToInsert;
            tail = head;
        } else if (head.getHashCode() > nodeToInsert.getHashCode()) {
            //insert before head
            nodeToInsert.setNext(head);
            head = nodeToInsert;
        } else {
            //find node with bigger hashCode and insert before it.
            //if such note not found new node will be inserted in the end.
            HashNode<K, V> currentNode = head;
            while (currentNode.hasNext() && currentNode.getNext().getHashCode() < nodeToInsert.getHashCode()) {
                currentNode = currentNode.getNext();
            }
            nodeToInsert.setNext(currentNode.getNext());
            currentNode.setNext(nodeToInsert);
        }
    }

    public HashNode<K, V> getHead() {
        return head;
    }

    public HashNode<K, V> getTail() {
        return tail;
    }

    public int size() {
        return size;
    }

    public V get(K key) throws ValidationException {
        HashNode<K, V> hashNode = getNode(key);
        return hashNode.getValue();
    }

    public HashNode<K, V> getNode(K key) throws ValidationException {
        validateKey(key);
        int hashCode = key.hashCode();
        return getNodeByHash(hashCode);
    }

    public void remove(K key) throws ValidationException{
        validateKey(key);
        HashNode<K, V> nodeToRemove = getNode(key);
        HashNode<K, V> currentNode = head;

        if (currentNode.getKey() == key) {
            currentNode.setNext(null);
        }

        if (currentNode.getNext().equals(nodeToRemove)) {
            currentNode.setNext(nodeToRemove.getNext());
        } else {
            currentNode = currentNode.getNext();
        }
        size--;
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    private void validateKey(K key) throws ValidationException {
        if (key == null) {
            throw new ValidationException("Key can't be null");
        }
    }

    private void validateValue(V value) throws ValidationException {
        if (value == null) {
            throw new ValidationException("Value can't be null");
        }
    }

    private HashNode<K, V> getNodeByHash(int hashCode) {
        HashNode<K, V> currentNode = head;
        HashNode<K, V> foundNode = null;
        while (currentNode != null && foundNode == null) {
            if (hashCode == currentNode.getHashCode()) {
                foundNode = currentNode;
            } else {
                currentNode = currentNode.getNext();
            }
        }
        return foundNode;
    }

    public String toString(String className) {
        StringBuilder stringBuilder = new StringBuilder(className + ": [" + size + "] [");
        HashNode currentNode = head;
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
        System.out.println(this.toString("MyHashLinkedList"));
    }
}
