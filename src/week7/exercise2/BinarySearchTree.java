package week7.exercise2;

public class BinarySearchTree {
    private Node root;

    public BinarySearchTree(Node root) {
        this.root = root;
    }

    public BinarySearchTree() {
        this.root = null;
    }

    public Node insertNode(Node node, int value) {
        if (node == null) {
            node = new Node(value);
            return node;
        }

        if (node.data < value) {
            node.right = insertNode(node.right, value);
        }

        if (node.data > value) {
            node.left = insertNode(node.left, value);
        }

        return node;    // Lệnh này chạy khi trong cây đã có phần tử.
    }

    public void insert(int value) {
        root = insertNode(root, value);
    }

    private void printInorder(Node node) {
        if (node == null) return;

        printInorder(node.left);
        System.out.print(node.data + " ");
        printInorder(node.right);
    }

    public void inorder() {
        this.printInorder(this.root);
        System.out.println();
    }

    public Node binarySearch(Node node, int value) {
        if (node == null) return null;
        if (node.data == value) return node;
        if (value < node.data) return binarySearch(node.left, value);
        return binarySearch(node.right, value);
    }

    public Node search(int value) {
        return binarySearch(root, value);
    }

    public boolean isExist(int value) {
        Node node = search(value);  // Tìm kiếm node có giá trị là value.
        if (node == null) return false; // Nếu không tìm thấy thì value không tồn tại.
        return true;
    }

    public Node findMinNode(Node node) {
        if (node.left == null) return node;
        return findMinNode(node.left);
    }

    public Node removeNode(Node node, int value) {
        if (node == null) return null;
        if (value > node.data) {
            node.right = removeNode(node.right, value);
        } else if (value < node.data) {
            node.left = removeNode(node.left, value);
        } else {
            if (node.right == null) return node.left;
            else if (node.left == null) return node.right;

            Node newNode = findMinNode(node.right);
            node.data = newNode.data;
            node.right = removeNode(node.right, node.data);
            return node;
        }
        return node;
    }

    public void remove(int value) {
        root = removeNode(root, value);
    }
}
