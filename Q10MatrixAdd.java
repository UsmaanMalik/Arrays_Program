class q10MatrixAdd {
	
	public static void printArr(int x[][]) {
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x[i].length;j++) {
				System.out.print(x[i][j] + " ");				
			}
			System.out.println("");
		}
	}
	
	public static void matrixAdd( int x[][] , int y[][] ) {
		
		for(int i=0,a=0;i<x.length && a<y.length;i++,a++) {
			
			for(int j=0,b=0;j<x[i].length && b<y[a].length;j++,b++) {
				
				System.out.print(x[i][j] + y[a][b] + " ");
			
			}
			
			System.out.println("");
		}
		
	}
	public static void main(String... ma) {
		int arr1[][] = {
				{4,2,2},
				{1,5,7},
				{5,3,1},
			};
			
		int arr2[][] = {
				{2,1,8},
				{9,4,6},
				{4,5,2},
			};
		
		printArr(arr1);
		//System.out.print(" ");
		System.out.println(" ");
		printArr(arr2);
		System.out.println(" ");
		matrixAdd(arr1,arr2);
	}

}