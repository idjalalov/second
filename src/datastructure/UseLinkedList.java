package datastructure;
import java.util.LinkedList;

public class UseLinkedList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use LinkedList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

			
				LinkedList<String> list = new LinkedList<String>();
				
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
