package FirstTerm;


public class ArraySort {
	
	   int[] insertionsort(int[] arr)
	    {
	        int n = arr.length;
	        for (int i = 1; i < n; ++i) {
	            int key = arr[i];
	            int j = i - 1;
	 
	            /* Move elements of arr[0..i-1], that are
	               greater than key, to one position ahead
	               of their current position */
	            while (j >= 0 && arr[j] > key) {
	                arr[j + 1] = arr[j];
	                j = j - 1;
	            }
	            arr[j + 1] = key;
	        }
	 return arr;
	    }
	  int[] bubbleSort(int[] arr)
	    {
	        int n = arr.length;
	        for (int i = 0; i < n-1; i++)
	            for (int j = 0; j < n-i-1; j++)
	                if (arr[j] > arr[j+1])
	                {
	                    // swap arr[j+1] and arr[j]
	                    int temp = arr[j];
	                    arr[j] = arr[j+1];
	                    arr[j+1] = temp;
	                }
return arr;
	    }
	   int[]  selecitonsort(int[] input) {
		 for (int i = 0; i < input.length; i++) {
		 	int index=i;
		 for (int j = i+1; j < input.length; j++) {
		 	if(input[j]<input[index]) {
		 		index=j;
		 	}
		 	int smallerNumber = input[index];
		     input[index] = input[i];
		     input[i] = smallerNumber;

		 }
		 }

		 return input; }
}
