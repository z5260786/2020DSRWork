import java.util.*;
/**
 * Testing different operations in the Set collection in Java
 *
 * @author Saber Elsayed
 * @see TreeSet, HashSet, LinkedHashSet
 */
public class SetExample {

    public static void main(String[] args) {
       
        // instantiate a new Stack object that accepts Integer objects
        // it is implemented as a tree
        Set<Integer> S1 = new TreeSet<>();
        // add  objects
        S1.add(65);  S1.add(36); S1.add(24); S1.add(36);
        
        // show the content and assert they are sorted and no duplications
        System.out.println("set = " + S1); 
        //remove elements
        S1.remove(36);        S1.remove(24);
        System.out.println(S1); //assert set = 65
        S1.add(15); S1.add(24); S1.add(80); // add 15, 24, 80
        System.out.println("set = " +S1); //assert set = 15, 24, 65, 80
        
        System.out.println("Does S1 contain 10?"
                + S1.contains(10)); // assert false
        System.out.println("S1 has " + S1.size() +" objects"); // assert 4

        // create another Set object implemented using HashSet
        Set<Integer> S2 = new HashSet<>();
        // add all objects in S1 to S2
        S2.addAll(S1);
        System.out.println("hashset = " +S2); //assert they may not be ordered

         // create another Set object implemented using LinkedHashSet
        Set<Integer> S3 = new LinkedHashSet<>();
        S3.add(150); // add 150
        S3.addAll(S1);// add all objects in S1 to S2
        System.out.println("LinkedHashSet = " +S3);//assert s3=[150,15,24,65,80]
      
        S3.removeAll(S3); // remove all items
        System.out.println("LinkedHashSet = " +S3);//assert s3=[]
    }
}
