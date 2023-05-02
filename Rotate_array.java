import java.util.* ;
import java.io.*; 
class Solution {
	
//   https://www.codingninjas.com/codestudio/problems/rotate-array_1230543?utm_source=youtube&utm_medium=affiliate&utm_campaign=parikh_youtube&leftPanelTab=0
  
// Arraya-2 parik
  
	public static void main(String args[]) {
		
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		int k=s.nextInt();
		int temp=0;
		for (int i = 0; i < k; i++) {
			temp=a[0];
			for (int j = 0; j < n-1; j++) {
				a[j]=a[j+1];
			}
			a[n-1]=temp;
		}
		for (int i : a) {
			System.out.print(i+" ");
		}
	}
}
