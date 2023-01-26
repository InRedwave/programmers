package other.stack;

import java.util.Scanner;
import java.util.Stack;

public class Main_12605 {
	
	public String solution(String[] array) {
		Stack<String> stack = new Stack<>();
		for(String x : array) {
			stack.push(x);
		}
		String answer = "";
		for(String x : array) {
			answer += stack.pop() + " ";
		}
		//System.out.println(answer);
		return answer;
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main_12605 T = new Main_12605();
		int N = sc.nextInt();
		sc.nextLine();
		String[] array = new String[N];
		
		for(int i= 1; i<=N; i++) {
			array = sc.nextLine().split(" ");
			System.out.println("Case #" + i + ": " + T.solution(array));
//			for(String x : array) {
//				System.out.println(x);
//			}
			
		}
		
		
	}

}
