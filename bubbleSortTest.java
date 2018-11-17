/**
 * @author Shane Anderson
 * 
 * Small implementation of the bubbleSort algorithm. An O(n^2) algorithm..
 **/

public class bubbleSortTest 
	{
	
	/*
	 * method that handles the bubble sorting of the array:
	 */
	public static void bubbleSort (int myArray [ ])
		{
		int i;
		int j;
		
		int cursor = myArray.length - 1;
		
		for (i = 0; i < cursor; i++)
			{
			for (j = 0; j < myArray.length - i - 1; j++)
				{
				int swapValue;
				
				int next;
				
				next = j + 1;
				
				//swap values:
				if (myArray[j] > myArray[next])
					{
					swapValue = myArray [j];
					
					myArray[j] = myArray[next];
					
					myArray[next] = swapValue;
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
		int myArray [ ] = {3, 15, 8, 38, 12, 46, 9, 36};
		
		System.out.println("The unsorted array is as follows: ");
		
		printArray (myArray);
		
		System.out.println ("\nBubble Sorting... \n");
		
		//System.out.println (" ");
		
		bubbleSort (myArray);
		
		
		System.out.println("The sorted array is as follows: ");
		
		printArray (myArray);
		}
	}
