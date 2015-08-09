package datastructure;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<String> queue = new LinkedList<String>();

		queue.add("New York");
		queue.add("Denver");
		queue.add("Phoenix");
		queue.add("Jersey city");
		queue.add("London");
		queue.add("Oslo");
		queue.add("LA");
		queue.add("San jose");
		queue.add("SF");
		queue.add("New Haven");
		queue.add("Kansas");
		queue.add("Georgia");
		
		System.out.println(queue.peek());
		System.out.println(queue.remove());
		
//		for(String city:queue){
//			System.out.println(city);
//		}

	}

}
