package programmers.harucoding.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_11659 {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer token = new StringTokenizer(bufferReader.readLine());
		int N = Integer.parseInt(token.nextToken());
		int M = Integer.parseInt(token.nextToken());
		
		long[] S = new long[N+1];
		
		token = new StringTokenizer(bufferReader.readLine());
		for(int i = 1; i<= N; i++) {
			//합배열 공식 S[i] = S[i-1] + A[i]
			S[i] = S[i-1] + Integer.parseInt(token.nextToken());
		}
		
		for(int q = 0; q<M; q++) {
			token = new StringTokenizer(bufferReader.readLine());
			int i = Integer.parseInt(token.nextToken());
			int j = Integer.parseInt(token.nextToken());
			
			System.out.println(S[j]-S[i-1]);
		}
		
	}

}
