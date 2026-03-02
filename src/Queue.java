public class Queue {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int size) {
        this.maxSize = size;
        this.queueArray = new int[maxSize];
        this.front = 0;
        this.rear = -1;
        this.nItems = 0;
    }

    public void enqueue(int item) {
        if (!isFull()) {
            if (rear == maxSize - 1) { 
                rear = -1; 
            }
            queueArray[++rear] = item;
            nItems++;
        } else {
            System.out.println("Queue is full!");
        }
    }

    public int dequeue() {
        if (!isEmpty()) {
            int temp = queueArray[front++];
            if (front == maxSize) { 
                front = 0; 
            }
            nItems--;
            return temp;
        } else {
            System.out.println("Queue is empty!");
            return -1;
        }
    }

    public int front() {
        if (!isEmpty()) {
            return queueArray[front];
        } else {
            System.out.println("Queue is empty!");
            return -1;
        }
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }
}