import java.util.*;

import originals.Person;


public class lectureWeekTwo {

	public static void main(String[] args) {
		testHash();
	}
	
	public static void testHash() {
		//Using hash maps and hashing
		
		Map<String, Person> HM = new HashMap<>();
		
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
		
		Person p1 = new Person("Daniel XXX", "0412345678", "NSW");
		Person p2 = new Person("Stevo YYY", "0498765432", "NSW");
		Person p3 = new Person("Davo ZZZ", "0411223344", "WA");
		
		HM.put("0412345678", p1);
		HM.put("0498765432", p2);
		
		System.out.println(HM.get("0412345678"));
	}
	
	public static void testIterator() {
		int[] intValues = new int[]{0, 2, 4, 5, 7, 9, 7, 36};
		
		Set<Integer> S = new LinkedHashSet<>();
		
		for (Integer i : intValues) {
			S.add(i);
		}
		
		//-------- Method 1 ----------
		Iterator<Integer> it = S.iterator();
		System.out.println("Method 1:");
		while(it.hasNext()) {
			int currentVal = it.next();
			System.out.println(currentVal + " ");
		}
		System.out.println();
		
		//------- Method 2 -----------
		System.out.println("Method 2:");
		for(Integer x : S) {
			System.out.println(x + " ");
		}
		System.out.println();
		
		//------- Method 3 -----------
		it = S.iterator();
		while (it.hasNext()) {
			int currentVal = it.next();
			if(currentVal == 9) {
				it.remove();
			} else {
				System.out.println(currentVal + " ");
			}
		}
	}
	
}
