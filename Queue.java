public class CircularQueue {
    private int size;
    private int front, rear;
    private int[] queue;

    public CircularQueue(int size) {
        this.size = size;
        queue = new int[size];
        front = -1;
        rear = -1;
    }

    // Enqueue operation
    public void enqueue(int data) {
        if ((rear + 1) % size == front) {
            System.out.println("Queue is Full (Overflow)");
            return;
        }
        if (front == -1) front = 0;
        rear = (rear + 1) % size;
        queue[rear] = data;
        System.out.println("Inserted: " + data);
    }

    // Dequeue operation
    public int dequeue() {
        if (front == -1) {
            System.out.println("Queue is Empty (Underflow)");
            return -1;
        }

        int data = queue[front];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % size;
        }
        System.out.println("Removed: " + data);
        return data;
    }

    // Display the queue
    public void display() {
        if (front == -1) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.print("Queue Elements: ");
        int i = front;
        while (true) {
            System.out.print(queue[i] + " ");
            if (i == rear) break;
            i = (i + 1) % size;
        }
        System.out.println();
    }

    public boolean isFull() {
        return (rear + 1) % size == front;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(5);  

        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);
        cq.enqueue(50);  

        cq.display();

        cq.dequeue();
        cq.dequeue();

        cq.display();

        cq.enqueue(60);
        cq.enqueue(70);  
        cq.display();
    }
}
