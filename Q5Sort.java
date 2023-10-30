class q5Sort {
	
	public static void printArr(int p[]) {
		for(int i=0;i<p.length;i++) {
			System.out.print(p[i] + " ");
		}
	}
	
	public static void Sort(int x[]) {
		for(int i=0;i<x.length;i++) {
			for(int j=i+1;j<x.length;j++) {
				int temp=0;
				if(x[j] < x[i]) {
					
					temp = x[i];
					x[i] = x[j];
					x[j] = temp;
					
				}
			}
		}
		
		printArr(x);
	}
	
	
	public static void main(String... sor) {
		int arr[] = {2,7,1,9,8,10,12};
		
		printArr(arr);
		System.out.println("");
		Sort(arr);
		//printArr(Sort(arr));
		//System.out.print(Sort(arr));
	}

}