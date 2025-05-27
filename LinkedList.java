class Main{

    // static Node convertArrayToLinkedList(int[] arr){
    //     if(arr.length == 0) return null;
    //     Node head = new Node(arr[0]);
    //     Node current = head;
    //     for(int i = 1; i < arr.length; i++){
    //         current.next = new Node(arr[i]);
    //         current = current.next;
    //     }
    //     return head;
    // }

    static void printLinkedList(Node head){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println();
    }

    // Delete a node from LinkedList
    static Node deleteNodeAtBegining(Node head){
        if (head == null) return null;
        head = head.next;
        return head;
    }

    static Node deleteNodeAtEnd(Node head){
        if (head == null) return null;
        if (head.next == null) return null; 
        Node current = head;
        while(current.next.next != null){
            current = current.next;
        }
        current.next = null;
        return head;
    }

    static Node deleteNodeAtPosition(Node head, int position){
        if (head == null) return null;
        if (position == 0) return deleteNodeAtBegining(head);
        Node current = head;
        int count = 0;
        while(current != null && count < position - 1){
            current = current.next;
            count++;
        }
        if (current == null || current.next == null) return head;
        current.next = current.next.next; 
        return head;
    }

    static Node deleteNodeWithValue(Node head, int value){
        if (head == null) return null;
        if (head.data == value) return deleteNodeAtBegining(head);
        Node current = head;
        while(current.next != null && current.next.data != value){
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
        }
        return head;
    }

    // Insert a node in LinkedList
    static Node insertNodeAtBegining(Node head, int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return head;
    }

    static Node insertAtEnd(Node head, int data){
        Node newNode = new Node(data);
        if (head == null) return newNode;
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
        return head;
    }

    static Node insertAtPosition(Node head, int data, int position){
        Node newNode = new Node(data);
        if (position == 0) return insertNodeAtBegining(head, data);
        Node current = head;
        int count = 0;
        while(current != null && count < position - 1){
            current = current.next;
            count++;
        }
        if (current == null) return head;
        newNode.next = current.next;
        current.next = newNode;
        return head;
    }

    static Node insertAfterValue(Node head, int data, int value){
        Node newNode = new Node(data);
        if (head == null) return newNode;
        Node current = head;
        while(current != null && current.data != value){
            current = current.next;
        }
        if (current == null) return head; 
        newNode.next = current.next;
        current.next = newNode;
        return head;
    }

    public static void main(String[] args) {
        // int[] arr = {1, 2, 3, 4, 5};
        // Node linkedList = convertArrayToLinkedList(arr);
        Node linkedList = null;
        linkedList = insertAtEnd(linkedList, 1);
        linkedList = insertAtEnd(linkedList, 2);
        linkedList = insertAtEnd(linkedList, 3);
        linkedList = insertAtEnd(linkedList, 4);
        linkedList = insertAtEnd(linkedList, 5);
        System.out.println("Original Linked List:");
        printLinkedList(linkedList);


    }
}

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }

    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
}