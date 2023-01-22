package inflearn.StackQueue;

import java.util.Scanner;
import java.util.Stack;

public class Main_1 {
	
	public String solution (String str) {
		String answer ="YES";
		Stack<Character> stack = new Stack<>();
		
		for(char x : str.toCharArray()) {
			if(x == '(') {
				stack.push(x);
			} else {
				//닫는 괄호가 많은 경우
				if(stack.isEmpty()) {
					return "NO";
				}
				stack.pop();
			}
		}
		//반복문이 끝나도 남아있을 수 있음 (여는 괄호가 많은 경우)
		if(!stack.isEmpty()) {
			return "NO";
		}
		return answer;
	}
	
	
	
	public static void main(String[] args) {
		Main_1 T = new Main_1();
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		System.out.println(T.solution(str));
	}

}
