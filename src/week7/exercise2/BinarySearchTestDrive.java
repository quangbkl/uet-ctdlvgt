package week7.exercise2;

public class BinarySearchTestDrive {
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();

        binarySearchTree.insert(5);
        binarySearchTree.insert(4);
        binarySearchTree.insert(-7);
        binarySearchTree.insert(1);
        binarySearchTree.insert(-6);
        binarySearchTree.insert(0);
        binarySearchTree.insert(22);
        binarySearchTree.insert(3);
        binarySearchTree.insert(8);

        binarySearchTree.remove(22);

        binarySearchTree.inorder();

        System.out.println(binarySearchTree.isExist(-7));
    }
}
