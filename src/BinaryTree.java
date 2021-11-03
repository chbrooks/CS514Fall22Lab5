import java.util.Scanner;

public class BinaryTree {
    protected Node root;

    public BinaryTree() {
        root = null;
    }

    public BinaryTree(Node root) {
        this.root = root;
    }


    public String decode(Scanner messageScanner) {
        if (root == null) {
            return "";
        } else {
            return root.decode(messageScanner);
        }
    }


}
