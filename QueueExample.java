package Q04;
import java.util.LinkedList;

import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.add("First");

        queue.add("Second");

        queue.add("Third");

        System.out.println("Head of the queue: " + queue.peek());

        System.out.println("Removed: " + queue.poll());

        System.out.println("Head of the queue after removal: " + queue.peek());

    }

}