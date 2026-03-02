public class App {
    public static void main(String[] args) {
        
        System.out.println("=== Stack Test ===");
        Stack myStack = new Stack(5);
        
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        
        System.out.println("Top element (Peek): " + myStack.peek());
        
        System.out.println("Popped: " + myStack.pop());
        System.out.println("Popped: " + myStack.pop());
        
        System.out.println("-------------------------");

        System.out.println("=== Queue Test ===");
        Queue myQueue = new Queue(5);
        
        myQueue.enqueue(100);
        myQueue.enqueue(200);
        myQueue.enqueue(300);
        
        System.out.println("First element (Front): " + myQueue.front());
        
        System.out.println("Dequeued: " + myQueue.dequeue());
        System.out.println("Dequeued: " + myQueue.dequeue());
    }
}