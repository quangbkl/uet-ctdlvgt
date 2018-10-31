package week7.exercise2;

public class Node {
    int data;
    Node left, right;

    public Node(int data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public Node(int data) {
        this(data, null, null);
    }

    public Node() {
        this(0);
    }
}
