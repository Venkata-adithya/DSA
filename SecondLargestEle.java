import java.util.* ;
import java.io.*;

// https://www.codingninjas.com/codestudio/problems/second-largest-element-in-the-array_873375?utm_source=youtube&utm_medium=affiliate&utm_campaign=parikh_youtube

// Arrays- 1st problem@p

public class Solution {
	public static int findSecondLargest(int n, int[] arr) {
	
		Arrays.sort(arr);
		for (int i = n-1; i > 0; i--) {
			if(arr[i]!=arr[i-1]){
				return arr[i-1];
			}
		}
		return -1;
	}
	
	
}
