package package1;

import java.util.*;


public class IterateArray {

	public static void main(String[] args) {
		ArrayList arraylist = new ArrayList();
		arraylist.add(12);
		arraylist.add("Aiswarya");
		arraylist.add(2.5);
		arraylist.add('c');
		arraylist.add(5.2f);
		
		Iterator it = arraylist.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());

		}

	}

}
