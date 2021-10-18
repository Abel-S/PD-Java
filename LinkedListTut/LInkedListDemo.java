package LinkedListTut;

import java.util.Deque;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingDeque;



public class LInkedListDemo {

	public static void main (String[] args) {
		/*Deque <String> deque = new LinkedList<>();
		deque.offer("1");
		deque.add("2");
		deque.add("3");
		//boolean wasAdded = deque.offerFirst("3");
		System.out.println(wasAdded);
		System.out.println(deque.removeLast());
		System.out.println(deque);
		*/
		
		Deque <String> stack = new LinkedList<>();
		stack.push("redBook");
		stack.push("brownBook");
				
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop()); //will throw exception
		System.out.println(stack);
		//peak on empty stack = null
	}
	
}
