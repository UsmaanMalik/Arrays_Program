class q6Sort1 {
	
	public static void printArr(int x[][]) {
		for(int p=0;p<x.length;p++) {
			for(int j=0;j<x[p].length;j++) {
				System.out.print(x[p][j] + " ");
			}
			System.out.println("");
		}
	}
	
	public static void Sort(int x[][]) {
		for(int i=0;i<x.length;i++) {
			
			for(int j=0;j<x[i].length;j++) {
				
				for(int k=0;k<x[i].length-j-1;k++) {
					
					int temp;
					if(x[i][k] > x[i][k+1]) {
						temp = x[i][k];
						x[i][k] = x[i][k+1];
						x[i][k+1] = temp;
					}	
				}
				
			}
			
		}
		printArr(x);
	}
	
	public static void main(String... sor) {
		int arr[][] = {
				{4,2,2,5,9,8},
				{1,5,7,3,6,2},
				{5,3,1,6,90,8},
			};
		
		printArr(arr);
		System.out.println("");
		
		Sort(arr);
	
	}

}