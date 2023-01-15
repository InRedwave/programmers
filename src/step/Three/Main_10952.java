package step.Three;

import java.util.Scanner;

public class Main_10952 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean run = true;
		while (run) {
			String[] array = sc.nextLine().split("");
			
			
			
			if (!array[0].equals("0")) {
				int a = Integer.parseInt(array[0]);
				int b = Integer.parseInt(array[2]);
				System.out.println(a + b);
			} else  {
				run = false;
			}
		}
		sc.close();
	}

}
