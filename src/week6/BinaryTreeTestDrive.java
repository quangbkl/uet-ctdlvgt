package week6;

public class BinaryTreeTestDrive {
    public static void main(String[] args) {
        // a, b, c, d, e, f, g -> 1, 2, 3, 4, 5, 6, 7
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.root = new Node(1);
        binaryTree.root.left = new Node(2);
        binaryTree.root.right = new Node(5);
        binaryTree.root.left.left = new Node(3);
        binaryTree.root.left.right = new Node(4);
        binaryTree.root.left.right.left = new Node(6);
        binaryTree.root.left.right.right = new Node(7);

        System.out.println("Preorder:");
        binaryTree.preorder();
        System.out.println("Postorder:");
        binaryTree.postorder();
        System.out.println("Inorder:");
        binaryTree.inorder();
    }
}
