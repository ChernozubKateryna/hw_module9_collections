import util.CollectionsUtil;

public class MyStack<E> {
    private MyLinkedList<E> myLinkedList = new MyLinkedList<>();

    public void push(E value) {
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

    //returns the first element in the stack
    public E peek() {
        return myLinkedList.getTail();
    }

    //returns the first element on the stack and removes it from the collection
    public E pop() {
        E tailValue = myLinkedList.getTail();
        myLinkedList.removeLast();
        return tailValue;
    }

    public void println() {
        System.out.println(myLinkedList.toString("MyStack"));
    }

    /*
    private Object[] elementsArray;
    private int size = 0;
    private int topElement;

    public  MyStack() {
    }

    public MyStack(int size) {
        elementsArray = new Object[size];
        this.size = size;
        topElement = -1;
    }

    public void push(E value) {
        if (isFull()) {
            System.out.println("Stack overflow");
        }
        System.out.println("Inserting " + value);
        elementsArray[++topElement] = value;
    }

    private boolean isFull() {
        return topElement == size - 1;
    }

    public void remove(int index) {
        CollectionsUtil.validateIndex(index, size);
        Object[] resultArray = new Object[size];
        int j = 0;
        for (int i = 0; i < topElement; i++) {
            if (i != index) {
                resultArray[j] = this.elementsArray[i];
                j++;
            }
        }
        System.out.println("Remove element by index " + index + ": " + elementsArray[index]);
        this.elementsArray = resultArray;
    }

    public void clear() {
        this.size = 0;
        this.topElement = -1;
        this.elementsArray = new Object[0];
    }

    public int size() {
        return topElement + 1;
    }

    //працює не коректно
    public E peek() {
        //CollectionsUtil.validateIndex(0, this.stackSize);
        return (E) elementsArray[topElement];
    }


    public E pop() {
        if (isEmpty()) {
            System.out.println("Stack empty");
        }
        E firstElement = (E) elementsArray[topElement];
        topElement--;
        return firstElement;
    }

    private boolean isEmpty() {
        return topElement == -1;
    }

    public void printStack() {
        for (int i = 0; i <= topElement; i++) {
            System.out.print(elementsArray[i] + ", ");
        }
    }
     */
}
