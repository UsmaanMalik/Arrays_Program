class q1Max {
	
	public static int max(int x[]) {
		int largest = 0;
		
		for(int i=0;i<x.length;i++) {
			if(largest < x[i]) {
				largest = x[i];
			}
		}
		
		return largest;
	}
	
	public static void main(String... ma) {
		
		
		//int[] arr = new int[];
		int arr[] = {2,4,15,9,8};
		
		System.out.println(max(arr));
	}

}