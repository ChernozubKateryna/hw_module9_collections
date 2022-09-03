import javax.xml.bind.ValidationException;

public class Ex_05_HashMap {
    public static void execute() {
        try {
            MyHashMap<String, String> myHashMap = new MyHashMap<>();
            myHashMap.println();
            myHashMap.put("one", "the one");
            myHashMap.println();
            myHashMap.put("one", "the one one");
            myHashMap.println();
            myHashMap.put("two", "the two");
            myHashMap.println();
            myHashMap.put("three", "the three");
            myHashMap.println();

            System.out.println("size: " + myHashMap.size());
            System.out.println(myHashMap.get("two"));
            myHashMap.remove("two");
            myHashMap.println();
            myHashMap.clear();
            System.out.println(myHashMap.size());

        } catch (ValidationException e) {
            System.out.println(e.getMessage());
        }
    }
}
