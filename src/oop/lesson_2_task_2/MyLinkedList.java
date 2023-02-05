package oop.lesson_2_task_2;

public class MyLinkedList<Type> {
    private Element<Type> firstElement;
    private Element<Type> lastElement;
    private int size = 0;

    public void insertLast(Type element) {
        if (size == 0) {
            firstElement = new Element<>(element);
            lastElement = firstElement;
        } else {
            lastElement.next = new Element<>(element, lastElement, null);
            lastElement = lastElement.next;
        }
        size++;
    }

    public void insertFirst(Type element) {
        if (size == 0) {
            firstElement = new Element<>(element);
            lastElement = firstElement;
        } else {
            firstElement.previous = new Element<>(element, null, firstElement);
            firstElement = firstElement.previous;
        }
        size++;
    }

    public Element<Type> get(Type element) {
        Element<Type> currentElement = firstElement;
        while (currentElement != null) {
            if (currentElement.element.equals(element)) {
                return currentElement;
            } else {
                currentElement = currentElement.next;
            }
        }
        throw new RuntimeException("Not found");
    }

    public void removeFirst() {
        firstElement.next.previous = null;
        firstElement = firstElement.next;
    }

    public void removeLast() {
        lastElement.previous.next = null;
        lastElement = lastElement.previous;
    }

    private static class Element<Type> {
        Type element;
        Element<Type> next;
        Element<Type> previous;

        Element(Type element) {
            this(element, null, null);
        }

        Element(Type element, Element<Type> previous, Element<Type> next) {
            this.element = element;
            this.previous = previous;
            this.next = next;
        }

        @Override
        public String toString() {
            return element.toString();
        }
    }
}
