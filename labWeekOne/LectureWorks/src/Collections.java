import java.util.*;


public class Collections<T> {
	
	public static void main(String[] args) {
		testDeque();
	}
	
	public static void testStack() {
		//Used to create lists/collections but reverses the order
		Stack<String> stack = new Stack<>();
		
		stack.push("A1");
		stack.push("A2");
		stack.push("A3");
		
		System.out.println("STACK - " + stack);
		
		//stack.peek() will view the top item from the stack
		//stack.size() gives stack size
		//stack.pop() pops top element off the stack
	}
	
	public static void testQueue() {
		//A queue can be used to create lists/collections but preserve the order
		Queue<String> queue = new LinkedList<>();
		
		//Inserting items to stack
		queue.add("A1");
		queue.offer("A2");
		queue.add("A3");
		//Print string of the queue
		System.out.println("QUEUE - " + queue);
		
		//queue.size() returns the size
		//queue.peek() returns the top element
		//queue.remove() removes an object but will throw NoSuchElementException if queue empty
		//queue.poll() removes an object and doesn't throw error if empty
	}
	
	public static void testDeque() {
		//Deque is essentially a double ended queue
		Deque<String> deque = new LinkedList<>();
		
		deque.add("A2");
		deque.addFirst("A1");
		System.out.println(deque.toString());
		deque.addFirst("A2");
		System.out.println(deque.toString());
	}
	
	public static void testList() {
		
		//A list can be in the form of an ArrayList, LinkedList or Vector
		List<String> list = new LinkedList<>();
		
		list.add("A");
		list.add("C");
		list.add("E");
		
		//Prints out string of LinkedList
		System.out.println("LIST - " + list);
		
		//list.contains("A") Checks if List contains "A"
		
		//Add B after A
		int loc = list.indexOf("A");
		list.add(loc + 1, "B");
		//List is now [A, B, C, E]
		
		list.add(4, "G"); //Adds "G" in the 5th position
		//List is now [A, B, C, E, G]
		
		//Insert element from another collection
		Stack<String> s = new Stack<>();
		s.push("S");
		s.push("Y");
		s.push("W");
		list.addAll(s);
		//List is now [A, B, C, E, G, S, Y, W]
		
		//list.remove(index) removes item at index
		//list.add() adds item to end
		//Collections.sort(list) sorts the list
		//Collections.reverse(list) reverses the order of list
		//Collections.shuffle(list) randomise the fuck out of the list
		
		
	}
	
	public static void testSet() {
		//A set is a collection that is implemented as a tree set
		//Will order from smallest to largest
		Set<Integer> S1 = new TreeSet<>();
		//Add shit
		S1.add(65); S1.add(36); S1.add(24); S1.add(36);
		
		//S1.remove(36) removes that integer
		//S1.contains(36) looks for that integer
		//S1.size() returns size
		//S2.addAll(S1) adds all of S1 to S2
		//S1.removeAll(S3) removes all items of S3 that are in S3
		
		//Has the same order as the elements are entered, does not order itself
		Set<Integer> S3 = new LinkedHashSet<>();
	}
}
