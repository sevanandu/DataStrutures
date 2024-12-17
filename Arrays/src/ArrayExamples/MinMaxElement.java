/*
Min and Max in Array
--------------------------------------------------------------------
Difficulty: BasicAccuracy: 68.55%Submissions: 311K+Points: 1
Given an array arr. Your task is to find the minimum and maximum elements in the array.

Note: Return an array that contains two elements the first one will be a minimum element and the second will be a maximum of an array.

Examples:

Input: arr = [3, 2, 1, 56, 10000, 167]
Output: 1 10000
Explanation: minimum and maximum elements of array are 1 and 10000.


Input: arr = [1, 345, 234, 21, 56789]
Output: 1 56789
Explanation: minimum and maximum element of array are 1 and 56789.


Input: arr = [56789]
Output: 56789 56789
Explanation: Since the array contains only one element so both min & max are same.


Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)

Constraints:
1 <= arr.size() <= 105
1 <= arr[i] <=1012

*/

package ArrayExamples;

import java.util.Scanner;

public class MinMaxElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min,max;
		int arr[]= new int[] {1,5,6,3,9,7,2,3,0,8};
		
		min=max=arr[0];
	for(int i=0;i<arr.length;i++) {//Time Complexity O(N) as size of array
		if(arr[i]<min) {
			min=arr[i];
		}
		if(arr[i]>max) {
			max=arr[i];
		}
		
	}
	
	System.out.println("Min of array "+min+" Max of array "+max);
		
		

	}

}
