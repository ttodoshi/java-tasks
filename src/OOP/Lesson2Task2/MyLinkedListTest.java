package OOP.Lesson2Task2;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.add("zero");
        myLinkedList.add("first");
        myLinkedList.add("second");
        System.out.println(myLinkedList.get(2));
        myLinkedList.add("third");
        System.out.println(myLinkedList.get(3));
    }
}
