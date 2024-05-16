import java.util.Arrays;
//https://www.geeksforgeeks.org/find-a-pair-with-the-given-difference/

//Using Brute force
public class FindPairWithDifference {
	
	// Function to find if there exists a pair
	// of elements in the array whose difference is n
	static void findPair(int[] arr, int n, int diff) {
		// Nested loop to compare all possible
		// pairs of elements
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j)
					continue;

				// If the difference between the
				// two elements is n, print them
				if ((arr[j] - arr[i]) == diff) {
					System.out.println("Pair Found: (" + arr[i] + ", " + arr[j] + ")");
					return;
				}
			}
		}

		System.out.println("No such pair");
	}

	public static void main(String[] args) {
		// Input array and diff
		int[] arr = { 1, 8, 30, 40, 100 };
		int n = arr.length;
		int diff = -60;

		// Function call
		findPair(arr, n, diff);
	}
}

//Using sorting and Two pointers
// Java program to find a pair with the given difference
import java.io.*;
import java.util.Arrays;

class GFG {
static boolean findPair(int arr[], int size, int n)
{
	// Step-1 Sort the array
	Arrays.sort(arr);

	// Initialize positions of two elements
	int l = 0;
	int r = 1;

	// take absolute value of difference
	// this does not affect the pair as A-B=diff is same as
	// B-A= -diff
	n = Math.abs(n);

	// Search for a pair

	// These loop running conditions are sufficient
	while (l <= r && r < size) {
		int diff = arr[r] - arr[l];
		if (diff == n
			&& l != r) // we need distinct elements in pair
						// so l!=r
		{
			System.out.print("Pair Found: (" + arr[l] + ", "
				+ arr[r] + ")");
			return true;
		}
		else if (diff > n) // try to reduce the diff
			l++;
		else // Note if l==r then r will be advanced thus no
			// pair will be missed
			r++;
	}
	System.out.print("No such pair");
	return false;
}

// Driver program to test above function
public static void main (String[] args) 
{
	int arr[] = { 1, 8, 30, 40, 100 };
	int size = arr.length;
	int n = -60;
	findPair(arr, size, n);
	System.out.println();
	n = 20;
	findPair(arr, size, n);
}
}

// This code is contributed by Pushpesh Raj
