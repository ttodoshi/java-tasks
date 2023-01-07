package OOP.Lesson2Task2;

public class MyLinkedList<E> {
    private Element<E> header;
    private int size;
    public MyLinkedList(){
        size = 0;
    }
    public void add(E obj){
        if (size == 0){
            header = new Element<>(obj);
        }
        else{
            Element<E> temp = header;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Element<>(obj, temp, null);
        }
        size++;
    }
    public E get(int getId){
        int counter = 0;
        if (getId <= size - 1) {
            Element<E> temp = header;
            while (temp != null) {
                if (counter == getId) {
                    return temp.element;
                }
                temp = temp.next;
                counter++;
            }
        }
        return null;
    }
    private static class Element<E>
    {
        E element;
        Element<E> next;
        Element<E> previous;

        Element(E element)
        {
            this(element, null, null);
        }
        Element(E element, Element<E> previous, Element<E> next)
        {
            this.element = element;
            this.previous = null;
            this.next = null;
        }
    }
}
