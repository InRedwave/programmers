package inflearn.String;

import java.io.IOException;
import java.util.Scanner;

public class Main_5 {
	
	public String solution(String str) {
		String answer;
		char[] s= str.toCharArray();
		
		int lt = 0;
		int rt = str.length()-1;
		
		
		while(lt<rt) {
			if(!Character.isAlphabetic(s[lt])) {
				lt++;
			} else if(!Character.isAlphabetic(s[rt])) {
				rt--;
			} else {
				char tmp=s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
				
		}
		//char 배열을 스트링화
		answer=String.valueOf(s);
		return answer;
	}
	

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();		
		Main_5 main = new Main_5();
		System.out.println(main.solution(str));
		
		sc.close();
	}
}