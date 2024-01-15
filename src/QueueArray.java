public class QueueArray {
    private int maxSize;
    private int[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public QueueArray(int maxSize) {
        this.queArray = new int[maxSize];
        this.maxSize = maxSize;
        this.front = 0;
        this.rear = -1;
        this.nItems = 0;
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (this.nItems == this.maxSize);
    }

    public int size() {
        return this.nItems;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        if (rear == maxSize - 1) {
            rear = -1;
        }
        queArray[++rear] = item;
        nItems++;
        System.out.println("Enqueued " + item);
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int temp = this.queArray[front];
        if (this.front == maxSize - 1) {
            this.front = 0;
        } else {
            this.front++;
        }
        nItems--;
        System.out.println("Dequeued " + temp);
        return temp;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queArray[front];
    }

    public void display() {
        int i = this.front;
        while (i != this.rear) {
            System.out.print(this.queArray[i] + " ");
            if (i == maxSize - 1) {
                i = 0;
            } else {
                i++;
            }
        }
        System.out.println(this.queArray[this.rear]);
        System.out.println();
    }
}
