package package1;
import java.util.*;

public class RemovingElementFromArray {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);
		System.out.println("The Initial array list is " + arrayList);
		arrayList.remove(2);
		System.out.println("The array list after removing the third element is :" + arrayList);
		

	}

}
