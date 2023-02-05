package recursion.Lesson3Task2;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.add(50);
        binarySearchTree.add(25);
        binarySearchTree.add(75);
        binarySearchTree.add(80);
        binarySearchTree.add(70);
        System.out.println(binarySearchTree.get(50));
        System.out.println(binarySearchTree.get(70));
    }
}
