package inflearn.String;
import java.util.Scanner;

public class Main_1 {
	
	public int solution(String input1, char find){
		int answer =0;
	    char[] arr = input1.toLowerCase().toCharArray();
		int count = 0;
			
		for(int i =0; i< arr.length; i++) {
			if(find==arr[i]) {
				count++;
			}
		}
	    
	    return count;
	  }
	
	
	public static void main(String[] args) {
		Main_1 main = new Main_1();
	    Scanner sc=new Scanner(System.in);
	    String input1 = sc.nextLine();
		String input2 = sc.nextLine();
	    		
		char find = input2.toLowerCase().charAt(0);
		System.out.print(main.solution(input1, find));
		sc.close();
	}

}
