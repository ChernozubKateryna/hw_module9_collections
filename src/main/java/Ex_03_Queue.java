public class Ex_03_Queue {
    public static void execute() {
        MyQueue<String> myQueue = new MyQueue<>();
        myQueue.println();
        myQueue.add("first");
        myQueue.println();
        myQueue.add("second");
        myQueue.println();
        myQueue.add("third");
        myQueue.println();
        myQueue.add("third");
        myQueue.println();
        myQueue.add("fourth");
        myQueue.println();

        System.out.println(myQueue.size());
        myQueue.remove(3);
        System.out.println(myQueue.peek());
        myQueue.println();
        myQueue.poll();
        myQueue.clear();
        System.out.println(myQueue.size());
    }
}
