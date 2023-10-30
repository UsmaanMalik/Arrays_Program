import java.util.*;
class q8Union {
	
	public static void printArr(int x[]) {
		for(int i=0;i<x.length;i++) {
			System.out.print(x[i] + " ");
		}
	}
	
	public static void Union(int x[]) {
		
		for(int i=0;i<x.length;i++) {
			for(int j=i+1;j<x.length;j++) {
				if(x[i] == x[j]) {
					x[j] = -1;
				}
			}
		}
		
		for(int i=0;i<x.length;i++) {
			if(x[i] == -1) {
				continue;
			}
			System.out.print(x[i] + " ");
		}
		printArr(x);
		
	}
	public static void main(String... un) {
		
		int arr1[] = {1,4,6,1,7,5};
		int arr2[] = {2,8,6,3,8,9};
		
		int first_length = arr1.length;
		int sec_length = arr2.length;
		
		int temp[] = new int[first_length + sec_length];
		
		System.arraycopy(arr1,0,temp,0,first_length);
		System.arraycopy(arr2,0,temp,first_length,sec_length);
		
		printArr(temp);
		System.out.println("");
		Union(temp);
		
	}
}