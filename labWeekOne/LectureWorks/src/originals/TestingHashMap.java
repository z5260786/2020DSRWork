import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Testing different operations in the HashMap
 *
 * @author Saber Elsayed
 * @see Person
 */
public class TestingHashMap {

    /**
     * main method for testing HashMap
     *
     * @param args
     */
    public static void main(String[] args) {

        /**
         * instantiate a hashMap with an integer key (mobile phone) and Person
         * as values
         * <p>
         * you can use <b>HashTable</b>, but it is slower than HashMap </p>
         * <p>
         * <b>LinkedHashMap</b> -->if you want insertions to be in order</p>
         * <p>
         * <b> TreeMap</b> --> all the elements are sorted </p>
         */
        Map<String, Person> HM = new HashMap<>();

        /* 
         * Key is a string represents mobile number, value is a person object
         */
        Person p1 = new Person("Bob XXX", "040000000", "Braddon");
        Person p2 = new Person("Michael YYY", "041111130", "Braddon");
        Person p3 = new Person("Tom WWW", "0422222222", "Braddon");
        Person p4 = new Person("Lisa ZZZ", "0433333333", "Braddon");

        // use put to add objects to HashMap
        HM.put("040000000", p1); // you can call p1.getMobilePhone for the key
        HM.put("041111130", p2);
        HM.put("0422222222", p3);
        HM.put("0433333333", p4);

        // look for objects using keys  and retrun its value
        System.out.println(HM.get("040000000")); // assert he is Bob XXX

        // check if an object exists, search by key
        System.out.println(HM.containsKey("040000000")); // assert true

        // check if an object exists, search by value
        System.out.println(HM.containsValue(p1)); // assert true

        // if more than one object has the same KEY,
        // the new object replaces the old one
        Person p5 = new Person("Tim AAA", "0433333333", "Braddon");
        HM.put("0433333333", p5);

        /**
         * <p>
         * There are different ways to iterate through HashMap </p>
         * <p>
         * <b> method 1: use iterator</b>
         * <p>
         * Iterator<Entry<String, Person>> it = HM.entrySet().iterator(); while
         * (it.hasNext()) { Map.Entry<String, Person> pair =
         * (Map.Entry<String, Person>) it.next();
         * System.out.println(pair.getKey() + " = " + pair.getValue()); }
         * </p>
         * <p>
         * <b> method 2</b>
         * Set<Map.Entry<String, Person>> keys = HM.entrySet(); keys.forEach((s)
         * -> { System.out.println("Key is: " + s.getKey() + " value is " +
         * s.getValue()); });
         * </p>
         */
        // method 3
        HM.forEach((key, value)
                -> System.out.println("Key is: " + key + " value is " + value));
    }
}
