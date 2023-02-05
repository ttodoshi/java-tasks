package recursion.Lesson3Task2;

public class BinarySearchTree {
    private Node root;

    public void add(long value) {
        Node newNode = new Node(value);
        if (root == null)
            root = newNode;
        else {
            Node currentNode = this.root;
            Node parent;
            while (currentNode != null) {
                parent = currentNode;
                if (currentNode.isLessThan(value)) {
                    currentNode = currentNode.right;
                    if (currentNode == null)
                        parent.right = newNode;
                } else {
                    currentNode = currentNode.left;
                    if (currentNode == null)
                        parent.left = newNode;
                }
            }
        }
    }

    public Node get(long value) {
        return get(this.root, value);
    }

    private Node get(Node currentNode, long value) {
        if (currentNode == null) {
            throw new RuntimeException("Not found");
        } else if (currentNode.equals(value)) {
            return currentNode;
        } else {
            if (currentNode.isLessThan(value)) {
                return get(currentNode.right, value);
            } else {
                return get(currentNode.left, value);
            }
        }
    }

    private static class Node {
        final long data;
        Node left;
        Node right;

        public Node(long data) {
            this.data = data;
        }

        private boolean isLessThan(long value) {
            return this.data < value;
        }

        public boolean equals(long value) {
            return this.data == value;
        }

        @Override
        public String toString() {
            return String.valueOf(data);
        }
    }
}