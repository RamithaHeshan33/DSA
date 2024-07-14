public class DSA {
    private int maxSize;
    private int[] stackarr;
    private int top;

    public DSA(int s) {
        maxSize = s;
        stackarr = new int[maxSize];
        top = -1;
    }

    public void push(int j) {
        if(top == maxSize - 1) {
            System.out.println("Stack is Full!");
        }

        else {
            stackarr[++top] = j;
        }
    }


    public int pop() {
        if(top == -1){
            System.out.println("Stack is Empty!");
            return -99;
        }

        else {
            return stackarr[top--];
        }
    }

    public int peek() {
        if(top == -1) {
            System.out.println("Stack is Empty!");
            return -99;
        }

        else {
            return stackarr[top];
        }
    }

    public static void main(String[] args) {
        DSA obj = new DSA(5);

        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        obj.push(50);
        obj.push(60); // Stack is full!

        System.out.println("Poped element: " + obj.pop()); // 50

        System.out.println("The top element: " + obj.peek()); // 40
    }
}
