import java.util.*;

/**
 * Testing different operations in the List collection in Java, 
 * i.e., add, remove, indexOf, sort, reverse, shuffle 
 *
 * @author Saber Elsayed
 * @see List, ArrayList, LinkedList
 */
public class TesingtList {

    public static void main(String[] args) {
        //can be  new Vector<>(); or  new ArrayList<>();
        List<String> ls = new LinkedList<>();
        ls.add("A");         ls.add("C");         ls.add("E");
        System.out.println("List = " + ls); // assert List = [A, C, E]
        // does ls contain 'A'?
        System.out.println(ls.contains("A")); // assert true

        // add B after A 
        int loc = ls.indexOf("A"); // first, get the location of A
        ls.add(loc + 1, "B"); // then, add B at loc+1
        System.out.println("List = " + ls); // assert List = [A, B, C, E]
        
        ls.add(4, "G");// insert G at the 5 position
        System.out.println("List = " + ls); // assert List = [A, B, C, E, G]

        // insert elements from another collection into ls
        Stack<String> s = new Stack<>();
        s.push("S");        s.push("Y");        s.push("W");
        ls.addAll(s); // add all elements in ls
        System.out.println("List = " + ls);//assert:List=[A, B, C,E, G, S, Y, W]

        ls.remove(ls.size() - 1); // remove the last element ('Y')
        System.out.print("List= "); // assert List = [A, B, C, E, G, S, Y]

        ls.remove(0); // remove the first element 'A'
        System.out.println("List = " + ls); // assert List = [B, C, E, G, S, Y]
       
        ls.add("A");  // add 'A' - should be added to the end
        System.out.println("List = " + ls); //assert List=[B, C, E, G, S, Y, A]
        
        Collections.sort(ls); // sort ls 
        System.out.println("List = " + ls); //assert: List=[A, B, C, E, G, S, Y] 
        
        Collections.reverse(ls);// reverse ls
        System.out.println("List = " + ls);//assert: List=[Y, S, G, E, C, B, A]
        
        Collections.shuffle(ls);// randomly shuffle ls
        System.out.println("List = " + ls);
    }
}
