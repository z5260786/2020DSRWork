import java.util.Stack;
/**
 * This class shows how to use Stacks, which typically order elements in a LIFO
 * (Last-in-first-out) manner.
 *
 * @author Saber Elsayed
 * @see Stack
 */
public class TestingStack {

    /**
     * main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // instantiate a Stack object
        Stack<String> stack = new Stack<>();

        /* push(insert) items onto a stack*/
        stack.push("A1");
        stack.push("A2");
        stack.push("A3");
        // show a string represntation of stack
        System.out.println("stack = " + stack);

        // show number of objects in stack
        System.out.println("size of the stack is " + stack.size());

        // return the top elements: does not remove it 
        System.out.println("Peek - top element is: " + stack.peek());
        System.out.println("stack = " + stack);
        /* poping items from  stack*/
        stack.pop();
        // show all objects in stack
        System.out.println("stack after poping the top elelemt= " + stack);
    }
}
