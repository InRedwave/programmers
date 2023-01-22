package inflearn.String;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main_4 {
	public ArrayList<String> solution(int n, String[] str){
		ArrayList<String> answer = new ArrayList<>();
		for(String x : str) {
			char[] s = x.toCharArray();
			int lt = 0, rt=x.length()-1;
			
			while(lt<rt) {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] =tmp;
				lt++;
				rt--;
			}
			String tmp = String.valueOf(s);
			answer.add(tmp);
		}
		return answer;
	}
		
	
	
	
	public static void main(String[] args) throws IOException {
		Main_4 T = new Main_4();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String[] str = new String[n];
		for(int i =0; i<n;i++) {
			str[i] = sc.next();
		}
		
		//String 담긴 ArrayList 를 forEach로 출력시킨다.
		for(String x : T.solution(n, str)) { 
			System.out.println(x);
		}
		
		sc.close();
		
	}
}
