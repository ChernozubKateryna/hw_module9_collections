package dto;

public class HashNode<K, V> {
    private HashNode next;
    private K key;
    private V value;
    private int hashCode;

    public HashNode(K key, V value) {
        this.key = key;
        this.value = value;
        hashCode = key.hashCode();
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
        this.hashCode = key.hashCode();
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public int getHashCode() {
        return hashCode;
    }

    public HashNode getNext() {
        return next;
    }

    public void setNext(HashNode next) {
        this.next = next;
    }

    public boolean hasNext() {
        return this.next != null;
    }

    public String toString() {
        return String.format("{Node: key='%s'; hashCode='%d', value='%s'.}", key, hashCode, value);
    }
}
