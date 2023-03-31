package basic.dev;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new LinkedList<Integer>();
		Stack<Integer> stack = new Stack<>();
		Queue<Integer> queuel = new LinkedList<Integer>();
		queue.add(10);
		queue.add(22);
		queue.add(73);
		queue.add(15);
		queue.add(04);
		
		System.out.println("hàng đợi sau khi thêm: " + queue);
		while(queue.size() > 0) {
			stack.push(queue.remove());
		}
		while(stack.size() > 0) {
			queuel.add(stack.pop());
		}
		System.out.println("hàng đợi sau khi đảo ngược: " + queuel);
	}

}