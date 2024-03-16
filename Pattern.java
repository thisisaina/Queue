public class Pattern {
    private static final int maxSize = 101;
    private static int[] a = new int[maxSize];
    private static int front = 0; // Index of the front element
    private static int rear = -1; // Index of the rear element
    private static int currentSize;
    public static int removedItem;

    private static boolean isEmpty() {
        return currentSize == 0;
    }

    private static boolean isFull() {
        return currentSize == maxSize;
    }

    private static int size() {
        return currentSize;
    }

    private static void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue.");
            return;
        }
        rear = (rear + 1) % maxSize; // Circular increment
        a[rear] = item;
        currentSize++;
    }

    private static int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1; // Return a sentinel value or throw an exception
        }
        removedItem = a[front];
        front = (front + 1) % maxSize; // Circular increment
        currentSize--;
        return removedItem;
    }

    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1){
                System.out.println(i);
            }else{
            enqueue(i);
        }
    }
        while (!isEmpty()){
            System.out.println(dequeue());
        }
    }
}
