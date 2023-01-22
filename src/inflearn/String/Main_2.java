package inflearn.String;

import java.util.Scanner;

public class Main_2 {
	public String solution(String str) {
		String answer ="";
		
		for(char x : str.toCharArray()) {
			if(x>=97 && x<=122) {
				answer += (char)(x-32);
			} else {
				answer += (char)(x+32);
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main_2 T = new Main_2();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
		
		sc.close();
	}
}
