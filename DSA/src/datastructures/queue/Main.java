package datastructures.queue;

public class Main {
    public static void main(String[] args) {
        /*
        Queue queue = new Queue(7);

        queue.getFirst();
        queue.getLast();
        queue.getLength();

        queue.printQueue();
         */

        /*
        Queue queue = new Queue(1);
        queue.enqueue(2);
        queue.printQueue();
         */

        Queue queue = new Queue(2);
        queue.enqueue(1);
        queue.printQueue();

        System.out.println("(2) items - Return 2 --> " + queue.dequeue().value);
        System.out.println("(1) item - Return 1 --> " + queue.dequeue().value);
        System.out.println("(0) items - Return null --> " + queue.dequeue());

    }
}
