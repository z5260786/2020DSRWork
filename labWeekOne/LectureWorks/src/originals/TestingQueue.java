import java.util.Queue;
import java.util.LinkedList;

/**
 * This class shows how to use Queue, which typically, but do not necessarily,
 * order elements in a FIFO (first-in-first-out) manner.
 *
 * @author Saber Elsayed
 * @see Queue
 */
public class TestingQueue {

    public static void main(String[] args) {
        /**
         * queue can be implemented as a linkedList another way to define it as
         * PriorityQueue (i.e., new PriorityQueue<String>()), but it does not
         * follow FIFO manner
         */
        // instantiate a queue object
        Queue<String> queue = new LinkedList<>();

        /* insert items into a queue*/
        queue.add("A1");
        queue.offer("A2");
        queue.add("A3");
        // show a string represntation of queue
        System.out.println("queue = " + queue);

        // show number of objects in queue
        System.out.println("size of the queue is " + queue.size());

        // return the top elements: does not remove it 
        System.out.println("Peek - top element is: " + queue.peek());
        System.out.println("queue = " + queue);
        /* removing items from a queue*/
        queue.remove(); //throws NoSuchElementException, if  queue is empty
        queue.poll(); // doesn't throw NoSuchElementException,if queue is empty
        // show all objects in queue
        System.out.println("queue after removing 2 elements= " + queue);
    }
}
