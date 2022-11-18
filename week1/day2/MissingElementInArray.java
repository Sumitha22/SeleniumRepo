package week1.day2;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
			// Here is the input
			int[] arr = {1,2,3,4,7,6,8};
			int n = arr.length;
            Arrays.sort(arr);
            System.out.println("Print Length of array = " + n);
			// Sort the array
            int sumOfAll = (n*(n +1))/2;
            int sumOfArray = 0;
            for(int i = 0;i <= n - 2; i++)
            {
               sumOfArray = sumOfArray+ arr[i];
             }
                int missingNumber = sumOfAll-sumOfArray;
                System.out.println("Missing number is: "+missingNumber);
            }
            
			

			// loop through the array (start i from arr[0] till the length of the array)

				// check if the iterator variable is not equal to the array values respectively
				
					// print the number
					
					// once printed break the iteration
			
}


