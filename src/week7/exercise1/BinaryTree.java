package week7.exercise1;

import java.util.ArrayList;

public class BinaryTree {
    public Node root;

    public BinaryTree(Node root) {
        this.root = root;
    }

    public BinaryTree() {
        this((String) null);
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

    public void createTree(Node node, ArrayList<String> preorder, ArrayList<String> inorder) {
        if (preorder.isEmpty() || inorder.isEmpty()) return;

        String valueRoot = preorder.get(0);
        int index = inorder.indexOf(valueRoot);

        if (node == null) node = new Node(valueRoot);
        else node.data = valueRoot;

        if (preorder.size() == 1 && inorder.size() == 1) return;
        ArrayList<String> newPreorderLeft = new ArrayList<>(preorder.subList(1, index + 1));
        ArrayList<String> newPreorderRight = new ArrayList<>(preorder.subList(index + 1, preorder.size()));
        ArrayList<String> newInorderLeft = new ArrayList<>(inorder.subList(0, index));
        ArrayList<String> newInorderRight = new ArrayList<>(inorder.subList(index + 1, inorder.size()));

        node.left = new Node();
        node.right = new Node();
        createTree(node.left, newPreorderLeft, newInorderLeft);
        createTree(node.right, newPreorderRight, newInorderRight);
    }

    public void loadTree(ArrayList<String> preorder, ArrayList<String> inorder) {
        createTree(root, preorder, inorder);
    }


}
