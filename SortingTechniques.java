import java.util.Scanner;

public class SortingTechniques {

	private static int quickSortCounter;
	
	public static void main(String[] args) {
		
		int arr[] = new int[10];
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Students Heights to store into array ");
		
		// Get input elements of array from user
		for (int i = 0; i <10 ; i++) {            
                arr[i] = in.nextInt();           
        }
		// display array 
		display(arr, 10);
        
        System.out.println("Enter the choice 1. Bubble Sort 2. Insertion Sort  3. Quick Sort ");
        int ch = in.nextInt();        
		switch (ch) {
			case 1: {			
				bubbleSort(arr,10);
				break;
			}
			case 2: {			
				insertionSort(arr,10);
				break;
			}
			case 3: {	
				quickSortCounter = 0;
				quickSort(arr,10);
				break;
			}			
			default:
				break;
		}
		display(arr, 10);
	}
	
	public static void bubbleSort(int a[],int size)
	{
		int i,j,temp,count=0;
		
		for(i=0;i<size;i++)
		{
			for(j=0;j<size-1-i;j++)
			{
				count++;
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.print("No.Of Iterations : "+count);		
	}
	
	public static void insertionSort(int a[],int size) {
		
		int i,temp,j,counter=0;
		 for(i=1; i<size; i++)
	       {
	           temp = a[i];
	           j = i - 1;
	           while((temp < a[j]) && (j >= 0))
	           {
	        	   counter++;
	               a[j+1] = a[j];
	               j = j - 1;
	           }
	           a[j+1] = temp;
	       }		
		 System.out.print("No.Of Iterations : "+counter);
	}
	
	public static void quickSort(int arr[],int size)
	{
		q_Sort(arr,0,size-1);
		System.out.print("No.Of Iterations : "+quickSortCounter);

	}
	
	public static void q_Sort(int a[],int start,int end)
	{
		int left=start;
		int right=end;
		int pivot=a[start];
		
		while(left<right)
		{
			quickSortCounter++;
			while(a[right]>=pivot && (left<right))
				right--;
			if(left!=right)
			{
				a[left]=a[right];
				left++;
			}
			while(a[left]<=pivot && (left<right))
				left++;;
			if(left!=right)
			{
				a[right]=a[left];
				right--;
			}
			
		}
		a[left]=pivot;
		if(start<left)
			q_Sort(a,start,left-1);
		if(end>left)
			q_Sort(a,right+1,end);
	}
	
	public static void display(int a[],int size)
	{
		int i;
		System.out.println("\nArray Is :");
		for(i=0;i<size;i++)
			System.out.print(" "+a[i]);
		
		System.out.println();
		System.out.println("Jayesh");
	}	
}
