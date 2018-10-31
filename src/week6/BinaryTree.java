package week6;

public class BinaryTree {
    Node root;

    public BinaryTree(Node root) {
        this.root = root;
    }

    public BinaryTree() {
        this.root = new Node();
    }

    public BinaryTree(String rootValue) {
        this.root = new Node(rootValue);
    }

    private void printPreorder(Node node) {
        if (node == null) return;

        System.out.print(node.data + " ");
        printPreorder(node.left);
        printPreorder(node.right);
    }

    private void printPostorder(Node node) {
        if (node == null) return;

        printPostorder(node.left);
        printPostorder(node.right);
        System.out.print(node.data + " ");
    }

    private void printInorder(Node node) {
        if (node == null) return;

        printInorder(node.left);
        System.out.print(node.data + " ");
        printInorder(node.right);
    }

    public void preorder() {
        this.printPreorder(this.root);
        System.out.println();
    }

    public void postorder() {
        this.printPostorder(this.root);
        System.out.println();
    }

    public void inorder() {
        this.printInorder(this.root);
        System.out.println();
    }
}
