package recursion.Lesson3Task2;

public class BinarySearchTree {
    private Node root;

    public void add(long value) {
        add(this.root, value);
    }

    private void add(Node currentNode, long value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
        }
        else {
//            Node parent = currentNode;
            while (currentNode != null) {
                if (currentNode.isLessThan(value) && currentNode.right != null) {
                    currentNode = currentNode.right;
                }
                else if (currentNode.isLessThan(value) && currentNode.right == null) {
                    currentNode.right = newNode;
                    return;
                }
                else if (!currentNode.isLessThan(value) && currentNode.left != null) {
                    currentNode = currentNode.left;
                }
                else {
                    currentNode.left = newNode;
                    return;
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
            }
            else {
                return get(currentNode.left, value);
            }
        }
    }

    static class Node {
        final long data;
        Node left;
        Node right;

//        Node parent;

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