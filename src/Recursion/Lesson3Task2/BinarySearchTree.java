package Recursion.Lesson3Task2;

public class BinarySearchTree {
    Node head;
    Node[] nodes;

    public BinarySearchTree(int nodes) {
        this.nodes = new Node[nodes];
    }

    public void add(long value) {
        add(this.head, value);
    }

    private void add(Node head, long value) {
        if (Node.k == 0) {
            this.head = new Node(value);
            nodes[Node.k - 1] = this.head;
        } else if (head == null) {
            head = new Node(value);
            nodes[Node.k - 1] = head;
        } else {
            if (head.left == null && head.compareTo(value)) {
                head.left = new Node(value);
                nodes[Node.k - 1] = head.left;
            } else if (head.right == null && !head.compareTo(value)) {
                head.right = new Node(value);
                nodes[Node.k - 1] = head.right;
            } else if (head.compareTo(value)) {
                add(head.left, value);
            } else {
                add(head.right, value);
            }
        }
    }

    public Node get(long value) {
        return get(this.head, value);
    }

    private Node get(Node head, long value) {
        if (head == null) {
            return null;
        } else if (head.data == value) {
            return head;
        } else {
            if (head.compareTo(value)) {
                return get(head.left, value);
            } else {
                return get(head.right, value);
            }
        }
    }

    static class Node {
        private final long data;
        private Node left;
        private Node right;
        private static int k = 0;

        public Node(long data) {
            this.data = data;
            k++;
        }

        private boolean compareTo(long value) {
            return this.data >= value;
        }
    }
}