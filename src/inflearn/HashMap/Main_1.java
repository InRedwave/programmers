package inflearn.HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Main_1 {
	
	public char solution (int n, String s) {
		char answer = ' ';
		HashMap<Character, Integer> map = new HashMap<>();
		//들어오는 알파벳이 x로 들어옴. A, B .. 
		for(char x : s.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0)+1);
		}
//		//다른 메소드 키가 포함되어 있는지 확인할 수 있음.
//		System.out.println(map.containsKey('A'));
//		System.out.println(map.containsKey('F'));
		
//		//key의 개수를 알 수 있는 메소드
//		System.out.println(map.size());
		
//		//키 삭제
//		System.out.println(map.size());
//		System.out.println(map.remove('A')); //지우고, value (A) 의 개수도 리턴해준다.
//		System.out.println(map.size());
		
		
		
		int max = Integer.MIN_VALUE;
		for(char key : map.keySet()) {
			//System.out.println(key + " " + map.get(key));
			if(map.get(key)>max) {
				max = map.get(key);
				answer=key;
			}
		}
		return answer;
	}
	
	
	
	public static void main(String[] args) {
		Main_1 T = new Main_1();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String str = kb.next();
		System.out.println(T.solution(n, str));
	}

}
