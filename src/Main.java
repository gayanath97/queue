public class Main {
    public static void main(String[] args) throws Exception {
        QueueArray queue = new QueueArray(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.display();

        queue.dequeue();
        queue.dequeue();
        queue.display();
        System.out.println("Peek: " + queue.peek());

    }
}