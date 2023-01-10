package Recursion.Lesson3Task2;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree(5);
        tree.add(10);
        tree.add(5);
        tree.add(15);
        tree.add(13);
        tree.add(7);
        System.out.println(tree.get(5));
        System.out.println(tree.get(13));
        System.out.println(tree.get(7));
    }
}
