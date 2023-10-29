class q2Min {

	public static int min(int x[]) {
		int smallest = 10000;
		
		for(int i=0;i<x.length;i++) {
			if(smallest > x[i]) {
				smallest = x[i];
			}
		}
		
		return smallest;
	}
	
	public static void main(String... ma) {
		
		
		//int[] arr = new int[];
		int arr[] = {2,4,15,9,8};
		
		System.out.println(min(arr));
	}

}
