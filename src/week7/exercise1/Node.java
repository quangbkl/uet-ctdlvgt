package week7.exercise1;

public class Node {
    String data;
    Node left, right;

    public Node(String data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public Node(String data) {
        this(data, null, null);
    }

    public Node() {
        this("");
    }
}
