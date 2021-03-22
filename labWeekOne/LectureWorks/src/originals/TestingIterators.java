import java.util.*;

/**
 * showing different ways to iterate through collections
 *
 * @author Saber Elsayed
 */
public class TestingIterators {

    public static void main(String[] args) {
        // an array with integer values 
        int[] intValues = new int[]{0, 2, 4, 5, 7, 9, 7, 36};
        /* instantiate a new Stack object that accepts Integer objects */
        Set<Integer> S = new LinkedHashSet<>();
        /* Insert all elemets in intValues array elem in S */
        for (Integer i : intValues) {
            S.add(i);
        }
        // iterate through objects in S
        // -------------------------- method 1 --------------------------
        Iterator<Integer> it = S.iterator();
        System.out.print("Method 1:");
        while (it.hasNext()) { // if it has another value
            int currentVal = it.next();

            System.out.print(currentVal + " "); // print the current object
        }
        System.out.println();

        // -------------------------- method 2 --------------------------
        System.out.print("Method 2:");
        for (Integer x : S) {
            System.out.print(x + " ");
        }
        System.out.println();

        // -------------------------- method 3 --------------------------
        System.out.println("Method 3:" + S);

        //iterator is the only ‘safe' way to modify a collection during traversal
        it = S.iterator();
        while (it.hasNext()) { 
            int currentVal = it.next();
            if (currentVal == 9) {
                it.remove();
            } else {
                System.out.print(currentVal + " "); 
            }
        }

    }
}
