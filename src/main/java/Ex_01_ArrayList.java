public class Ex_01_ArrayList {
    public static void execute() {
        MyArrayList<String> myArrayList = new MyArrayList<>();
        print(myArrayList);
        myArrayList.add("one");
        myArrayList.add("two");
        myArrayList.add("three");
        myArrayList.add("four");
        myArrayList.add("five");
        myArrayList.add("six");

        for (int i = 0; i < myArrayList.getSize(); i++) {
            System.out.println(String.format("Element [%d]: %s", i, myArrayList.get(i)));
        }

        print(myArrayList);
        myArrayList.remove(4);
        print(myArrayList);
        myArrayList.clear();
        print(myArrayList);
    }

    private static void print(MyArrayList<String> myArrayList) {
        System.out.println("Array: " + myArrayList.toString());
    }
}
