package inflearn.StackQueue;

import java.util.Scanner;
import java.util.Stack;

public class Main_2 {

	public String solution(String input) {
		String answer = "";
		Stack<Character> stack = new Stack<>();
		for (char x : input.toCharArray()) {
			if (x == ')') {
				// 여는 괄호까지 꺼내고 멈춘다
				while (stack.pop() != '(') {
				}
			} else {
				stack.push(x);
			}
		}
		for (int i = 0; i < stack.size(); i++) {
			answer += stack.get(i);
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Main_2 T = new Main_2();
		Scanner sc = new Scanner(System.in);
		String input = sc.next();

		System.out.println(T.solution(input));
		sc.close();
	}
}