
import java.util.ArrayDeque;
import java.util.Queue;


public class QueueDemo {
    public static void main(String[] args) {


        Queue<String> queue = new ArrayDeque<>();


        queue.offer("Harry");
        queue.offer("Frodo");
        queue.offer("Pippin");

        
        System.out.println("Queue: " + queue);

        
        System.out.println("Peek: " + queue.peek());

        
        System.out.println("Poll: " + queue.poll());

        
        System.out.println("Updated Queue: " + queue);

        System.out.println("Peek: " + queue.peek());
        
        System.out.println("Size: " + queue.size());
    }
}



