package package1;
import java.util.*;

public class RetrieveAnElement {

	public static void main(String[] args) {
		ArrayList<String> arrayList  = new ArrayList<String>();
		arrayList.add("Rose");
		arrayList.add("Jasmine");
		arrayList.add("Sunflower");
		arrayList.add("Lotus");
		arrayList.add("Orchid");
		System.out.println("Enter the index to retreive the flower name:");
		Scanner sc = new Scanner(System.in);
		int index = sc.nextInt();
		String flower = arrayList.get(index);
		System.out.println(flower);
		

	}

}
