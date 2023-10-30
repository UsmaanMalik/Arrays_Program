import java.util.*;
class q7MergeSort {
	
	public static void printArr(int x[]) {
		for(int p=0;p<x.length;p++) {
			//for(int j=0;j<x[p].length;j++) {
				System.out.print(x[p] + " ");
			//}
			//System.out.println("");
		}
	}
	
	public static void MergeSort(int x[]) {
		
		for(int i=0;i<x.length;i++) {
			for(int j=i+1;j<x.length;j++) {
				//int temp = 0;
				if(x[i] > x[j]) {
					int temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}
			}
		}
		printArr(x);
		
	}
	public static void main(String... mer) {
	
		int arr1[] = {1,4,6,1,7,5};
		int arr2[] = {2,8,6,3,8,9};
		
		int first_length = arr1.length;
		int sec_length = arr2.length;
		
		int temp[] = new int[first_length + sec_length];
		
		System.arraycopy(arr1,0,temp,0,first_length);
		System.arraycopy(arr2,0,temp,first_length,sec_length);
		printArr(temp);
		System.out.println("");
		MergeSort(temp);
	}
}