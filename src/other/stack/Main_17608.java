package other.stack;

import java.util.Scanner;
import java.util.Stack;

public class Main_17608 {
	
	public int solution(int [] array) {
		
		Stack<Integer> stack = new Stack<>();
		int count = 1;
		int size = array.length;
		int first = array[size-1];
		for(int x : array) {
			stack.push(x);
		}
		for(int x : array) {
			int second = stack.pop();
			if(first < second) {
				count ++;
				first = second;
			}
			
		}
		return count;
	}
	
	

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main_17608 T = new Main_17608();
		
		int num = sc.nextInt();
		int [] array = new int[num];
		for(int i = 0; i< num; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println(T.solution(array));
		sc.close();
	}
}
