/**
 * @author Shane Anderson
 *
 * quickSortTest.java - an implementation of quick sort algorithm;
 */


public class quickSortTest 
	{
	
	public static int partitionArray (int myArray [ ], int left, int right)
		{
		int pivot;
		int temp;
		
		pivot = myArray [(right + left)/2];
		
		while (left <= right)
			{
			while (myArray[left] < pivot)
				{
				left ++;
				}
			
			while (myArray[right] > pivot)
				{
				right --;
				}
			
			if (left <= right)
				{
				temp = myArray[left];
				myArray[left] = myArray[right];
				myArray[right] = temp;
				}
			
			left ++;
			right --;
			}
		
		return left;
		}
	
	/*
	 * main quick sort algorithm implementation:
	 */
	public static void quicksort (int myArray [ ], int left, int right)
		{
		int index;
		
		if (myArray.length == 0)
			{
			System.out.println("NULL Array, nothing to sort. Exiting...");
			
			System.exit(0);
			}
		
		index = partitionArray (myArray, left, right);
		
		if (left < index - 1)
			{
			quicksort(myArray, left, index - 1);
			}
		
		if (index < right)
			{
			quicksort(myArray, index, right);
			}

		}
	
	
	/*
	 * helper function to print the array:
	 */
	public static void printArray (int myArray[ ])
		{
		int j;
	
		//print sorted array:
		for (j = 0; j < myArray.length; j++)
			{
			System.out.print(myArray[j] + " ");
			
			//System.out.println(" ");
			}
		}
	
	
	/*
	 * begin execution:
	 */
	public static void main (String args [ ])
		{
		int myArray [ ] = {1,2,99,18,23, 4};
		
		quicksort (myArray, 0, myArray.length-1);
		
		printArray (myArray);
		}
	}