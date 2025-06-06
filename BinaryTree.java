// creation of a binary tree with insertion, deletion, search, inorder traversal, height, width, and balance checking

import java.util.*;
class Node {
    int data;
    Node right;
    Node left;

    Node(int data) {
        this.data = data;
        this.right = null;
        this.left = null;
    }
}

public class BinaryTree {

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }

        if (root.data == data) {
            System.out.println("Data is present in a tree");
            return root;
        }

        if (root.data > data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }

        return root;
    }

    public static Node delete(Node root, int data) {
        if (root == null) {
            System.out.println("Tree is Not Present");
            return root;
        }
        if (root.data > data) {
            root.left = delete(root.left, data);
        } else if (root.data < data) {
            root.right = delete(root.right, data);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            Node minLargerNode = root.right;
            while (minLargerNode.left != null) {
                minLargerNode = minLargerNode.left;
            }
            root.data = minLargerNode.data;
            root.right = delete(root.right, minLargerNode.data);
        }
        return root;
    }

    public static void search(Node root, int data) {
        if (root == null) {
            System.out.println("Tree is Not Present");
            return;
        }

        if (root.data == data) {
            System.out.println("Data " + data + " found");
            return;
        }

        if (root.data > data) {
            search(root.left, data);
        } else {
            search(root.right, data);
        }
    }

    public static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        } else {
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }

    public static int width(Node root) {
        if (root == null) {
            return 0;
        } else {
            int leftWidth = width(root.left);
            int rightWidth = width(root.right);
            return leftWidth + rightWidth + 1;
        }
    }

    public static boolean isBalanced(Node root) {
        if (root == null) {
            return true;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        if (Math.abs(leftHeight - rightHeight) <= 1 && isBalanced(root.left) && isBalanced(root.right)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Node r = null;

        while (true) {
            System.out.print("Enter Choice: ");
            int ch = scanner.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter Data to Insert: ");
                    int dataInsert = scanner.nextInt();
                    r = insert(r, dataInsert);
                    break;

                case 2:
                    System.out.print("Enter Data to Search: ");
                    int dataSearch = scanner.nextInt();
                    search(r, dataSearch);
                    break;

                case 3:
                    System.out.print("Enter Data to Delete: ");
                    int dataDelete = scanner.nextInt();
                    r = delete(r, dataDelete);
                    break;

                case 4:
                    System.out.print("Inorder Traversal of the tree is: ");
                    inorder(r);
                    System.out.println();
                    break;

                case 5:
                    System.out.println("Height of the tree is: " + height(r));
                    break;

                case 6:
                    System.out.println("Width of the tree is: " + width(r));
                    break;

                case 7:
                    if (isBalanced(r)) {
                        System.out.println("Tree is balanced");
                    } else {
                        System.out.println("Tree is not balanced");
                    }
                    break;

                case 8:
                    scanner.close();
                    return;
            }
        }
    }
}
