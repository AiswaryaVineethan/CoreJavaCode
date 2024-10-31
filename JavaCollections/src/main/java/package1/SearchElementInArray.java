package package1;
import java.util.*;

public class SearchElementInArray {

	public static void main(String[] args) {
		ArrayList<Character> arrayList = new ArrayList<Character>();
		arrayList.add('A');
		arrayList.add('B');
		arrayList.add('C');
		arrayList.add('D');
		arrayList.add('E');
		System.out.println("Enter the element to search: ");
		Scanner sc = new Scanner(System.in);
		char element = sc.next().charAt(0);
		System.out.println(arrayList.contains(element));
		

	}

}
