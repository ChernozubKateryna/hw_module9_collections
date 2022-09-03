package util;

public class CollectionsUtil {
    public static void validateIndex(int index, int size) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(String.format("Index '%d' is incorrect for array: %s", index, size));
        }
    }
}
