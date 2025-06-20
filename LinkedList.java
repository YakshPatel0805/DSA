class Main{

    static Node convertArrayToLinkedList(int[] arr){
        if(arr.length == 0) return null;
        Node head = new Node(arr[0]);
        Node current = head;
        for(int i = 1; i < arr.length; i++){
            current.next = new Node(arr[i]);
            current = current.next;
        }
        return head;
    }

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


    // finding loop in LinkedList
    static boolean hasLoop(Node head){
        if (head == null) return false;
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }


    // staarting point of loop in LinkedList
    static Node findLoopStart(Node head){
        if (head == null) return null;
        Node slow = head;
        Node fast = head;

        // Detect loop
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) break;
        }

        if (fast == null || fast.next == null) return null;

        // Find the start of the loop
        slow = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }


    // count nodes in a loop in LinkedList
    static int countNodesInLoop(Node head){
        if (head == null) return 0;
        Node slow = head;
        Node fast = head;

        // Detect loop
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) break;
        }

        if (fast == null || fast.next == null) return 0;

        // Count nodes in the loop
        int count = 1;
        Node current = slow.next;
        while(current != slow){
            count++;
            current = current.next;
        }
        return count;
    }


    // Finding middle element in LinkedList
    static Node findMiddle(Node head){
        if (head == null) return null;
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // delete loop in LinkedList
    static Node deleteLoop(Node head){
        if (head == null) return null;
        Node slow = head;
        Node fast = head;
        boolean loopExists = false;

        // Detect loop
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                loopExists = true;
                break;
            }
        }

        if (!loopExists) return head; 

        // Find the start of the loop
        slow = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }

        // Find the last node in the loop and break it
        Node loopStart = slow;
        while(fast.next != loopStart){
            fast = fast.next;
        }
        fast.next = null;
        return head;
    }

    // check if LinkedList is palindrome
    static boolean isPalindrome(Node head){
        if (head == null || head.next == null) return true;

        // Find the middle of the LinkedList
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse the second half of the LinkedList
        Node prev = null;
        Node current = slow;
        while(current != null){
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        // Compare the first half and the reversed second half
        Node firstHalf = head;
        Node secondHalf = prev; // Reversed second half
        while(secondHalf != null){
            if(firstHalf.data != secondHalf.data) return false;
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return true;
    }

    // check if LinkedList is Sorted or not
    static boolean isSorted(Node head){
        if (head == null || head.next == null) return true;

        Node current = head;
        while(current.next != null){
            if(current.data > current.next.data) return false;
            current = current.next;
        }
        return true;
    }

    // add two numbers in linkedlist
    static Node addTwoNumbers(Node l1, Node l2) {
        Node dummyHead = new Node(0);
        Node p = l1, q = l2, current = dummyHead;
        int carry = 0;

        while (p != null || q != null || carry > 0) {
            int x = (p != null) ? p.data : 0;
            int y = (q != null) ? q.data : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            current.next = new Node(sum % 10);
            current = current.next;

            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        return dummyHead.next;
    }

    // merge two sorted linked lists
    static Node mergeTwoSortedLinkedLists(Node l1, Node l2) {
        Node dummyHead = new Node(0);
        Node current = dummyHead;

        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        if (l1 != null) current.next = l1;
        if (l2 != null) current.next = l2;

        return dummyHead.next;
    }
    

    // find length of LinkedList
    static int get_length(Node head){
        int length = 0;
        Node current = head;
        while(current != null){
            length++;
            current = current.next;
        }
        return length;
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