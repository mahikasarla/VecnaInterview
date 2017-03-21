package mahi;
public class Sort {
	//This code will sort the numbers in the array.
    //task: Modify the algorithm to reverse the sort, then comment on its
    //efficiency in the space provided below:
    /*
		Here sorting complexity could be more efficient and readability could be improved.
		Best complexity sorted algorithms are heapsort and smoothsort with time complexity nlogn in all cases.
		Here I am writing Heap sort algorithm to sort the array.
		So the complexity of the problem nlogn for sorting in all cases.
		By writing different functions to sort the array the readability of the problem also improved.
		Here main plot of the solution is improving the time complexity. 
    */
	
	 private static int N;
	 
	    //Sorting Function
	 
	    public static int[] sort(int array[])
	    {       
	        heapify(array);        
	        for (int i = N; i > 0; i--)
	        {
	            swap(array,0, i);
	            N = N-1;
	            maxHeap(array, 0);
	        }
	        return array;
	    } 
	    
	    // Heap function    
	    public static void heapify(int array[])
	    {
	        N = array.length-1;
	        for (int i = N/2; i >= 0; i--)
	            maxHeap(array, i);   
	    }
	    
	    // Function to swap largest element in heap        
	    public static void maxHeap(int array[], int i)
	    { 
	        int left = 2*i ;
	        int right = 2*i + 1;
	        int max = i;
	        if (left <= N && array[left] > array[i])
	            max = left;
	        if (right <= N && array[right] > array[max])        
	            max = right;
	 
	        if (max != i)
	        {
	            swap(array, i, max);
	            maxHeap(array, max);
	        }
	    }    
	    // Function to swap two numbers in an array
	    public static void swap(int array[], int i, int j)
	    {
	        int tmp = array[i];
	        array[i] = array[j];
	        array[j] = tmp; 
	    } 

	  public static void main(String[] args) {
		  
	    //fill the array with random numbers
	  int[] unsorted = new int[100];
	    for(int i = 0; i < 100; i++)
	      unsorted[i] = (int) (Math.random() * 100);

	    System.out.println("Here are the unsorted numbers:");
	    for(int i = 0; i < unsorted.length; i++)
	      System.out.print(unsorted[i] + " ");
	    System.out.println();
      int[] sorted =sort(unsorted);
      // Print sorted Array 
      System.out.println("Here are the sorted numbers: ");        
      for (int i = 0; i <sorted.length ; i++)
          System.out.print(sorted[i]+" ");            
      System.out.println(); 
      
      System.out.println("Here are the reverse sorted numbers: ");
	    for(int i = 99; i>= 0; i--)
	      System.out.print(unsorted[i] + " ");
	    System.out.println();
	  }
	  
	}


