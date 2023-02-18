package abstract_classes_and_intefaces;

import java.util.Observable;
import java.util.Observer;

public class Lesson6Task2 {
    public static void main(String[] args) {
        ObservableStringBuilder observableStringBuilder = new ObservableStringBuilder("hello ");
        observableStringBuilder.append("world");
        System.out.println(observableStringBuilder);
        StringBuilderObserver stringBuilderObserver1 = new StringBuilderObserver(observableStringBuilder);
        System.out.println("Counter notifications: " + stringBuilderObserver1.getNotifyCounter());
        observableStringBuilder.append("!");
        System.out.println(observableStringBuilder);
        System.out.println("Counter notifications: " + stringBuilderObserver1.getNotifyCounter());
        observableStringBuilder.append("!!!");
        System.out.println(observableStringBuilder);
        System.out.println("Counter notifications: " + stringBuilderObserver1.getNotifyCounter());
    }
}

class StringBuilderObserver implements Observer {
    Observable observable;
    private int notifyCounter = 0;

    public StringBuilderObserver(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object o) {
        notifyCounter++;
    }

    public int getNotifyCounter() {
        return notifyCounter;
    }
}

class ObservableStringBuilder extends Observable {
    private final StringBuilder stringBuilder;

    public ObservableStringBuilder() {
        stringBuilder = new StringBuilder();
    }

    public ObservableStringBuilder(String string) {
        stringBuilder = new StringBuilder(string);
    }

    public ObservableStringBuilder(int capacity) {
        stringBuilder = new StringBuilder(capacity);
    }

    public void stringBuilderChanged() {
        setChanged();
        notifyObservers();
    }

    public void append(String string) {
        stringBuilder.append(string);
        stringBuilderChanged();
    }

    public void append(long string) {
        stringBuilder.append(string);
        stringBuilderChanged();
    }

    public void append(double string) {
        stringBuilder.append(string);
        stringBuilderChanged();
    }

    public void append(Object string) {
        stringBuilder.append(string);
        stringBuilderChanged();
    }

    public void insert(int index, String string) {
        stringBuilder.insert(index, string);
        stringBuilderChanged();
    }

    public void insert(int index, long string) {
        stringBuilder.insert(index, string);
        stringBuilderChanged();
    }

    public void insert(int index, double string) {
        stringBuilder.insert(index, string);
        stringBuilderChanged();
    }

    public void insert(int index, Object string) {
        stringBuilder.insert(index, string);
        stringBuilderChanged();
    }

    public void delete(int start, int end) {
        stringBuilder.delete(start, end);
        stringBuilderChanged();
    }

    public void deleteCharAt(int index) {
        stringBuilder.deleteCharAt(index);
        stringBuilderChanged();
    }

    public void reverse() {
        stringBuilder.reverse();
        stringBuilderChanged();
    }

    public void replace(int start, int end, String string) {
        stringBuilder.replace(start, end, string);
        stringBuilderChanged();
    }

    @Override
    public String toString() {
        return stringBuilder.toString();
    }
}
