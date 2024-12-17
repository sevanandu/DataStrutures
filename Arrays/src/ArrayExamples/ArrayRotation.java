/*
 Rotate Array by One
 
 ---------------------------------------------------------------------
Difficulty: BasicAccuracy: 69.6%Submissions: 289K+Points: 1
Given an array arr, rotate the array by one position in clock-wise direction.

Examples:

Input: arr = [1, 2, 3, 4, 5]
Output: [5, 1, 2, 3, 4]
Explanation: If we rotate arr by one position in clockwise 5 come to the front and remaining those are shifted to the end.

Input: arr = [9, 8, 7, 6, 4, 2, 1, 3]
Output: [3, 9, 8, 7, 6, 4, 2, 1]
Explanation: After rotating clock-wise 3 comes in first position.

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)

Constraints:
1<=arr.size()<=105
0<=arr[i]<=105

*/

package ArrayExamples;

public class ArrayRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]=new int[] {1,2,3,4,5,6,7,8,9,0};
		int rarr[]=new int[arr.length];
		
		System.out.println("Array before rotations");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		int r=2;//Number of Rotaions;
		for(int i=0;i<r;i++) {
			rarr[i]=arr[arr.length-r+i];
		}
		for(int i=0;i<arr.length-r;i++) {
			rarr[i+r]=arr[i];
			
		}
		
		System.out.println("Array after clock wise rotation for "+r+" times");
		for(int i=0;i<arr.length;i++) {
			System.out.print(rarr[i]+" ");
		}
		System.out.println();
		for(int i=0;i<arr.length-r;i++) {
			rarr[i]=arr[i+r];
			
		}
		for(int i=0;i<r;i++) {
			rarr[arr.length-r+i]=arr[i];
		}
		
		
		System.out.println("Array after anti clock wise rotation for "+r+" times");
		for(int i=0;i<arr.length;i++) {
			System.out.print(rarr[i]+" ");
		}
	}

}
