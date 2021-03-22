import java.util.*;


public class collectionsInJava<T> {
	
	public static void tryStack() {
		Stack<Integer> stack = new Stack<>();
		
		stack.add(56);
		stack.add(34);
		stack.add(42);
		stack.add(12);
		
		stack.pop();
		stack.add(12);
		stack.pop();
		stack.pop();
		
		System.out.println(stack);
	}
	
	public static void inputStack() {
		Stack<String> input = new Stack<>();
		
		System.out.println("ADD TEXT TO STACK:");
		
		Scanner scan = new Scanner(System.in);
		String line= scan.nextLine();
		
		while(!line.isEmpty()) {
			input.add(line);
			line=scan.nextLine();
			
		}
		
		for(int i = input.size() - 1; i >= 0; i--) {
			System.out.println(input.get(i));
		}
	}
	
	public static void main(String[] args) {
		inputStack();
	}

}
