package step.Three;

import java.util.Scanner;

public class Main_2438 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String answer = "*";
		
		for(int i =1; i<=a; i++) {
			for(int j=2; j<=i; j++) {
				answer += "*";
			}
			System.out.println(answer);
			answer = "*";
		}
		sc.close();
	}
}
