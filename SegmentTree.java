class SegmentTree{
    class Node {
        int start, end, data, sum;
        Node left, right;

        Node(int data, int start, int end) {
             this.data = data;
            this.start = start;
            this.end = end;
            this.sum = 0;
            this.left = null;
            this.right = null;
        }
    }

    private Node root;
    public SegmentTree(int[] arr) {
        root = buildTree(arr, 0, arr.length - 1);
    }

    private Node buildTree(int[] arr, int start, int end) {
        if (start > end) return null;
        Node node = new Node(arr[start], start, end);
        if (start == end) {
            node.sum = arr[start];
            return node;
        }
        int mid = (start + end) / 2;
        node.left = buildTree(arr, start, mid);
        node.right = buildTree(arr, mid + 1, end);
        node.sum = node.left.sum + node.right.sum;
        return node;
    }

    private void print(Node root){
        if (root == null) return;
        System.out.println("Node: [" + root.start + ", " + root.end + "] Sum: " + root.sum);
        print(root.left);
        print(root.right);
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};
        SegmentTree segmentTree = new SegmentTree(arr);
        System.out.println("Segment Tree built successfully.");
        segmentTree.print(segmentTree.root);
    }

}
