package abstract_classes_and_intefaces;

public class Lesson6Task1 {
    public static void main(String[] args) {
        // append test
        UndoStringBuilder undoStringBuilder = new UndoStringBuilder("Hello ");
        undoStringBuilder.append("world");
        System.out.println(undoStringBuilder);
        undoStringBuilder.undo();
        System.out.println(undoStringBuilder);
        System.out.println();

        // insert test
        undoStringBuilder.append("world");
        undoStringBuilder.insert(5, 123);
        System.out.println(undoStringBuilder);
        undoStringBuilder.undo();
        System.out.println(undoStringBuilder);
        System.out.println();
    }
}

interface Command {
    void undo();
}

class UndoStringBuilder {
    private StringBuilder stringBuilder;
    private Command undoCommand;
    private final Append appendCommand = new Append();
    private final Insert insertCommand = new Insert();

    public UndoStringBuilder() {
        stringBuilder = new StringBuilder();
    }

    public UndoStringBuilder(String string) {
        stringBuilder = new StringBuilder(string);
    }


    public void append(String string) {
        undoCommand = appendCommand;
        appendCommand.execute(string);
    }

    public void append(long string) {
        append(String.valueOf(string));
    }

    public void append(double string) {
        append(String.valueOf(string));
    }

    public void append(Object string) {
        append(string.toString());
    }

    public void insert(int index, String string) {
        undoCommand = insertCommand;
        insertCommand.execute(index, string);
    }

    public void insert(int index, long string) {
        insert(index, String.valueOf(string));
    }

    public void insert(int index, double string) {
        insert(index, String.valueOf(string));
    }

    public void insert(int index, Object string) {
        insert(index, string.toString());
    }

    public void undo() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        return stringBuilder.toString();
    }

    private class Append implements Command {
        StringBuilder previousBuilder;

        public void execute(String string) {
            previousBuilder = new StringBuilder(stringBuilder);
            stringBuilder.append(string);
        }

        @Override
        public void undo() {
            stringBuilder = previousBuilder;
        }
    }


    private class Insert implements Command {
        StringBuilder previousBuilder;

        public void execute(int index, String string) {
            previousBuilder = new StringBuilder(stringBuilder);
            stringBuilder.insert(index, string);
        }

        @Override
        public void undo() {
            stringBuilder = previousBuilder;
        }
    }
}