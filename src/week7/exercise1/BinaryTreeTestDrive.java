package week7.exercise1;

import java.util.ArrayList;
import java.util.Arrays;

public class BinaryTreeTestDrive {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        ArrayList<String> preorder = new ArrayList<>();
        ArrayList<String> inorder = new ArrayList<>();
        preorder.addAll(Arrays.asList(new String[]{"a", "b", "c", "d", "f", "g", "e"}));
        inorder.addAll(Arrays.asList(new String[]{"c", "b", "f", "d", "g", "a", "e"}));
        binaryTree.loadTree(preorder, inorder);

        System.out.print("Preorder: ");
        binaryTree.preorder();
        System.out.print("Inorder: ");
        binaryTree.inorder();
        System.out.print("Postorder: ");
        binaryTree.postorder();
    }
}
