
import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {


        Queue<String> linkedList = new LinkedList<>();

        
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");

        
        System.out.println("LinkedList: " + linkedList);


        System.out.println("Peek: " + linkedList.peek());

        
        System.out.println("Poll: " + linkedList.poll());


        System.out.println("Updated LinkedList: " + linkedList);

        System.out.println("Size: " + linkedList.size());

        
        
    }
}



