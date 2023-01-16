package programmers.harucoding.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_11660 {

	public static void main(String[] args) throws IOException {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(buffer.readLine());
		int N = Integer.parseInt(token.nextToken());
		int M = Integer.parseInt(token.nextToken());
		
		long[] S = new long[N+1];
		//token = new StringTokenizer(bufferReader.readLine());
		for(int i = 1; i<= N; i++) {
			//합배열 공식 S[i] = S[i-1] + A[i]
			S[i] = S[i-1] + Integer.parseInt(token.nextToken());
		}
		
		
		
	}

}
