/**
 * @author Shane Anderson
 * 
 * selectionSortTest.java: A small implementation of the selection sort algorithm
 */

public class selectionSortTest 
	{
	
	/*
	 * method that handles the selection sorting:
	 */
	@SuppressWarnings("unused")
	public static void selectionSort (int myArray [ ])
		{
		int cursor;
		int i, j, temp;
		
		for (i = 0; i < myArray.length - 1; i++) 
			{
			for (j = i + 1; j < myArray.length; j++)
				{
				cursor = myArray[i];
				
				if (myArray[i] > myArray [j])
					{
					temp = myArray [i];
					myArray[i] = myArray [j];
					myArray[j] = temp;
					}
				}
			}
		}
	

	/*
	 * method that handles the printing of the array.
	 * array is printed before and after sorting. Called '
	 * from main ( ):
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
	public static void main (String [ ] args)
		{
		int myArray [ ] = {13, 8, 45, 32, 28, 64, 51};
		
		System.out.println("Before sorting: ");
		
		printArray(myArray);
		
		selectionSort (myArray);
		
		System.out.println("\nAfter sorting: ");
		
		printArray(myArray);
		}
	}
