package inflearn.String;

import java.util.Scanner;

public class Main_6 {
	public String solution(String str) {
		String answer = "";
		for(int i = 0; i<str.length(); i++) {
			if(str.indexOf(str.charAt(i))==i) {
				answer += str.charAt(i);
			}
		}
		
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		Main_6 T = new Main_6();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		System.out.println(T.solution(str));
	}	

}
