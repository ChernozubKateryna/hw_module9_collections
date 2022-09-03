public class Ex_04_Stack {
    public static void execute() {
        MyStack<String> myStack = new MyStack<>();

        myStack.println();
        myStack.push("Mykola");
        myStack.println();
        myStack.push("Stepan");
        myStack.println();
        myStack.push("Taras");
        myStack.println();
        myStack.push("Olga");
        myStack.println();

        System.out.println("size: " + myStack.size());
        myStack.remove(2);
        myStack.println();
        System.out.println(myStack.peek());
        myStack.println();
        System.out.println(myStack.pop());
        myStack.println();
        myStack.size();
        myStack.clear();
        myStack.println();
        myStack.size();
    }
}
