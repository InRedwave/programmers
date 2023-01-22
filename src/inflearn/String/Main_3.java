package inflearn.String;

import java.util.Scanner;

public class Main_3 {

	public String solution(String str) {
		String answer ="";
		//가장 작은 수로 초기화한다.
		int m = Integer.MIN_VALUE, pos;
		while((pos=str.indexOf(' '))!= -1) {
			String tmp = str.substring(0, pos);
			int len = tmp.length();
			if(len>m) {
				m=len;
				answer = tmp;
			}
			str=str.substring(pos+1);
		}
		//마지막 단어 남으면 ' ' 에 의해 잘라내지지 않기 때문에 
		//비교가 적용되지 않음. -> 마지막 처리 if문 필요하다.
		if(str.length()>m) answer = str;
		
		return answer;
	}
	
	
	
	
	public static void main(String[] args) {
		Main_3 T = new Main_3();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(T.solution(str));
		
		sc.close();
	}
}
