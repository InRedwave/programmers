package step.Three;

import java.util.Scanner;

public class Main_11022 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a =Integer.parseInt(sc.nextLine());
		
		for(int i = 1; i<=a; i++) {
			String[] array = sc.nextLine().split("");
			int first = Integer.parseInt(array[0]);
			int second = Integer.parseInt(array[2]);
			
			
			System.out.println("Case #" + i + ": " + first + " + " + second + " = " + (first+second));
			
		}
		
		
		
	}
}
