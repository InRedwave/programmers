package inflearn.Array;

import java.util.Scanner;

public class Main_3 {
	
	public String solution(int n, int[] arrayA, int[] arrayB) {
		String answer = "";
		
		for(int i = 0; i<n; i++) {
			if(arrayA[i] == arrayB[i]) {
				answer += "D";
			} else if (arrayA[i] == 1 && arrayB[i] == 3) {
				answer += "A";
			} else if (arrayA[i] == 2 && arrayB[i] == 1) {
				answer += "A";
			} else if(arrayA[i] == 3 && arrayB[i] == 2) {
				answer += "A";
			} else {
				answer += "B";
			}
		}
		return answer;
	}
	
	

	public static void main(String[] args) {
		Main_3 T = new Main_3();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arrayA = new int[n];
		int[] arrayB = new int[n];

		for (int i = 0; i < n; i++) {
			arrayA[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			arrayB[i] = sc.nextInt();
		}
		
		for (char x : T.solution(n, arrayA, arrayB).toCharArray()) {
			System.out.println(x);
		}
		sc.close();
	}
}
