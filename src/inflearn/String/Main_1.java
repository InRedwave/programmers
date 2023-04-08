package inflearn.String;
import java.util.Scanner;

public class Main_1 {
	
	public int solution(String str, char t) {
		int answer = 0;
		
		str = str.toUpperCase();
		t = Character.toUpperCase(t);
		
//		for(int i=0; i<str.length();i++) {
//			if(str.charAt(i)==t) {
//				answer ++;
//			}
//		}
		
		for(char x : str.toCharArray()) {
			if(x==t) {
				answer ++;
			}
			
		}

		return answer;
	}
	
	public static void main(String[] args) {
		Main_1 main = new Main_1();
	    Scanner sc=new Scanner(System.in);
	   String input1 = sc.next();
		char c = sc.next().charAt(0);
		
		System.out.println(T.solution(input1, c));
	}

}
