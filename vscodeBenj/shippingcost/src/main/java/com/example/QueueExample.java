import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Create a queue
        Queue<String> queue = new LinkedList<>();

        // Add elements to the queue (enqueue)
        queue.add("First");
        queue.add("Second");
        queue.add("Third");

        // Display the queue
        System.out.println("Queue: " + queue);

        // Remove an element from the queue (dequeue)
        String removed = queue.poll();
        System.out.println("Removed: " + removed);

        // Display the queue after removal
        System.out.println("Queue after removal: " + queue);

        // Peek at the head of the queue without removing it
        String head = queue.peek();
        System.out.println("Head of the queue: " + head);

        // Check if the queue is empty
        boolean isEmpty = queue.isEmpty();
        System.out.println("Is the queue empty? " + isEmpty);
    }
}