import util.CollectionsUtil;

public class MyArrayList<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private static final int INCREASE_CAPACITY = 10;
    private Object[] elementsArray;
    private int size;
    private int capacity = DEFAULT_CAPACITY;

    public MyArrayList() {
        elementsArray = new Object[capacity];
        size = 0;
    }

    public MyArrayList(int capacity) {
        this.capacity = capacity;
        elementsArray = new Object[capacity];
        size = 0;
    }

    public int getSize() {
        return this.size;
    }

    public void add(E element) {
        if (size >= capacity) {
            this.elementsArray = increaseCapacity(this.elementsArray, INCREASE_CAPACITY);
        }
        this.elementsArray[size] = element;
        size++;
    }

    public void remove(int index) {
        CollectionsUtil.validateIndex(index, this.size);
        Object[] resultArray = new Object[capacity];
        int j = 0;
        for (int i = 0; i < size; i++) {
            if (i != index) {
                resultArray[j] = this.elementsArray[i];
                j++;
            }
        }
        this.size--;
        this.elementsArray = resultArray;
    }

    public void clear() {
        Object[] resultArray = new Object[size];
        //for (int i = 0; i < size; i++) {
        //    resultArray[i] = null;
        //}
        this.size = 0;
        this.elementsArray = resultArray;
    }

    public E get(int index) {
        CollectionsUtil.validateIndex(index, this.size);
        return (E) elementsArray[index];
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            stringBuilder.append(elementsArray[i]);
            String delimiter = (i + 1 == size) ? "" : ", ";
            stringBuilder.append(delimiter);
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    private Object[] increaseCapacity(Object[] elementsArray, int increase) {
        this.capacity += increase;
        Object[] newElementsArray = new Object[capacity];
        copyElements(elementsArray, newElementsArray);
        return newElementsArray;
    }

    private void copyElements(Object[] elementsArrayToCopy, Object[] newElementsArray) {
        for (int i = 0; i < size; i++) {
            newElementsArray[i] = elementsArrayToCopy[i];
        }
    }
}
