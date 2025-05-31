class Main{
    public static void main(String[] args) {
        int stack[] = new int[5];
        int top = -1;
        top = push(stack, 10, top);
        top = push(stack, 20, top);
        top = push(stack, 30, top);
        // System.out.print(isEmpty(top));
        display(stack, top);
    }

    // push
    static int push(int stack[], int value, int top) {
        if (top == stack.length - 1) {
            System.out.println("Stack is Full");
        } else {
            top++;
            stack[top] = value;
            System.out.println("Pushed " + value + " to stack");
        }
        return top;
    }

    // pop
    static int pop(int stack[], int top) {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return -1;
        } else {
            int value = stack[top];
            top--;
            System.out.println("Popped " + value + " from stack");
            return value;
        }
    }

    // peek
    static int peek(int stack[], int top) {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return stack[top];
        }
    }

    // isEmpty and isFull
    static boolean isEmpty(int top) {
        return top == -1;
    }

    static boolean isFull(int stack[]) {
        return stack.length == 0; 
    }

    // display
    static void display(int stack[], int top) {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }
}