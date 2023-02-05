package oop.lesson_2_task_2;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.insertFirst("first");
        myLinkedList.insertLast("second");
        myLinkedList.insertLast("third");
        System.out.println(myLinkedList.get("first"));
        myLinkedList.removeFirst();
        System.out.println(myLinkedList.get("third"));
        myLinkedList.removeLast();

    }
}
