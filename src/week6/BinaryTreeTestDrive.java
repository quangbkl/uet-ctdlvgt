package week6;

public class BinaryTreeTestDrive {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.root = new Node("a");
        binaryTree.root.left = new Node("b");
        binaryTree.root.right = new Node("e");
        binaryTree.root.left.left = new Node("c");
        binaryTree.root.left.right = new Node("d");
        binaryTree.root.left.right.left = new Node("f");
        binaryTree.root.left.right.right = new Node("g");

        System.out.println("Preorder:");
        binaryTree.preorder();
        System.out.println("Postorder:");
        binaryTree.postorder();
        System.out.println("Inorder:");
        binaryTree.inorder();
    }
}
