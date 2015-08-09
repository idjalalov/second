package datastructure;
import java.util.ArrayList;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

		int [] num = new int[13];

		num[0] = 9;
		num[1] = 1;
		num[2] = 41;
		num[3] = 8;
		num[4] = 20;
		num[5] = 50;
		num[6] = 29;
		num[7] = 57;
		num[8] = 26;
		num[9] = 53;
		num[10] = 26;
		num[11] = 45;
		num[12] = 52;
		for(int i=0; i<num.length; i++){
			System.out.println(num[i]);
		}
		
		
		ArrayList<String> list = new ArrayList<String>(5);
		list.add("Moskow");
		list.add("Berlin");
		list.add("Paris");
		list.add("Rom");
		list.add("Toronto");
		list.add("Tashkent");
		list.add("Boston");
		list.add("Seoul");
		list.add("Shanhai");
		list.add("Beijin");
		list.add("Kiev");
		list.add("Minsk");
		
		for(String city:list){
			System.out.println(city);
		}
		
		

	
	}

}
