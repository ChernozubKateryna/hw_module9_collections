public class MyQueue<E> {
    private MyLinkedList<E> myLinkedList = new MyLinkedList<>();

    public void add(E value) {
        myLinkedList.add(value);
    }

    public void remove(int index) {
        myLinkedList.remove(index);
    }

    public void clear(){
        myLinkedList.clear();
    }

    public int size() {
        return myLinkedList.getSize();
    }

    //returns the first element in the queue
    public E peek() {
        return myLinkedList.get(0);
    }

    //returns the first element in the queue and removes it from the collection
    public E poll() {
        E firstElement = myLinkedList.get(0);
        myLinkedList.remove(0);
        return firstElement;
    }

    public void println() {
        System.out.println(myLinkedList.toString("MyQueue"));
    }

    /*
    private Object[] queue;
    private int maxSize;
    private int nElements; // поточна кількість елементів в черзі
    private int front;
    private int rear;


    public MyQueue(int size) {
        queue = new Object[size];
        maxSize = size;
        nElements = 0;
        front = 0;
        rear = -1;
    }

    public int getNElements() {
        return nElements;
    }

    public void add (E value) {
        if (rear == maxSize - 1) {
            rear = -1;
        }

        System.out.println("Add " + value);

        queue[++rear] = value;
        nElements++;
    }

    public void remove(int index) {
        CollectionsUtil.validateIndex(index, maxSize);
        Object[] resultArray = new Object[maxSize];
        int j = 0;
        for (int i = 0; i < nElements; i++) {
            if (i != index) {
                resultArray[j] = this.queue[i];
                j++;
            }
        }
        System.out.println("Remove element by index " + index + ": " + queue[index]);
        this.nElements--;
        this.queue = resultArray;
    }

    public void clear() {
        nElements = 0;
        front = 0;
        rear = 0;
        maxSize = 0;
    }

    public int size() {
        return maxSize;
    }

    public E peek() {
        return (E) queue[front];
    }

    public E poll() {
        Object firstElement = queue[front];
        front = (front + 1) % maxSize;
        nElements--;

        return (E) firstElement;
    }
    */
}
