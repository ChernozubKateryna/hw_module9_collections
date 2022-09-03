public class Ex_02_LinkedList {
    public static void execute(){
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.println();
        myLinkedList.add("Monday");
        myLinkedList.println();
        myLinkedList.add("Tuesday");
        myLinkedList.println();
        myLinkedList.add("Wednesday");
        myLinkedList.println();
        myLinkedList.add("Thursday");
        myLinkedList.println();
        myLinkedList.add("Friday");
        myLinkedList.println();
        myLinkedList.add("Saturday");
        myLinkedList.println();
        myLinkedList.add("Sunday");
        myLinkedList.println();

        for (int i = 0; i < myLinkedList.getSize(); i++) {
            System.out.println(myLinkedList.get(i));
        }

        while (myLinkedList.getSize() > 0) {
            myLinkedList.remove(0);
            myLinkedList.println();
        }
    }
}
