package inflearn.SortingAndSearching;

import java.util.Scanner;

public class Main_1 {

	public int[] solution(int n, int[] arr) {
		//j가 n+1이므로 i가 n 까지 돌 필요가 없음 
		for(int i = 0; i<n-1; i++) {
			int idx = i;
			for(int j = i+1; j<n; j++) {
				if(arr[j] < arr[idx]) {
					idx = j;
				}
			}
			int tmp = arr[i];
			arr[i] = arr[idx];
			arr[idx] = tmp;
		}
		return arr;
	}

	public static void main(String[] args) {
		
		Main_1 T = new Main_1();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		for(int i = 0; i<n; i++) {
			array[i] = sc.nextInt();
		}
		for(int x : T.solution(n, array)){
			System.out.print(x + " ");
		}
		
		
		sc.close();
		
		
	}
}
