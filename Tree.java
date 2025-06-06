// creation of a tree based on user.
import java.util.*;

class BinaryTree {
    static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    public BinaryTree() {
    }

    private Node root;

    public void populate(Scanner in) {
        System.out.println("Enter the root value:- ");
        int value = in.nextInt();
        root = new Node(value);
        populate(in, root);
    }

    public void populate(Scanner in, Node node) {
        System.out.println("Do you want to Enter the left of root value (y/n):- " + node.value);
        String inp = in.next();
        char left = inp.charAt(0);
        if (left == 'y' || left == 'Y') {
            System.out.println("Enter the left value of " + node.value);
            int value = in.nextInt();
            node.left = new Node(value);
            populate(in, node.left);
        }

        System.out.println("Do you want to Enter the right of root value (y/n):- " + node.value);
        char right = inp.charAt(0);
        if (right == 'y' || right == 'Y') {
            System.out.println("Enter the right value of " + node.value);
            int value = in.nextInt();
            node.right = new Node(value);
            populate(in, node.right);
        }
    }

    public void display() {
        display(root, "");
    }

    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }


    public void preOrder() {
        System.out.print("Pre-order: ");
        preOrder(root);
        System.out.println();
    }

    private void preOrder(Node node) {
        if (node == null) return;
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder() {
        System.out.print("In-order: ");
        inOrder(root);
        System.out.println();
    }

    private void inOrder(Node node) {
        if (node == null) return;
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    public void postOrder() {
        System.out.print("Post-order: ");
        postOrder(root);
        System.out.println();
    }

    private void postOrder(Node node) {
        if (node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(in);
        tree.display();

        tree.preOrder();
        tree.inOrder();
        tree.postOrder();
    }
}
