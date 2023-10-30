class q11MatrixMulti {
	
	static void printArr(int x[][]) {
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x[i].length;j++) {
				System.out.print(x[i][j] + " ");
			}
			System.out.println("");
		}
	}
	public static void MatrixMulti(int x[][] , int y[][]) {
		
		int temp[][] = new int[3][3]; 
		//temp[][] = 0;
		
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x[i].length;j++) {
				for(int k=0;k<x[i].length;k++) {
					temp[i][j] += x[i][k] * y[k][j];					
				}
			}
		}
		
		printArr(temp);
	}
	public static void main(String... matrixm) {
		int arr1[][] = {
				{2,4,2},
				{1,5,7},
				{5,3,1}
			};
		int arr2[][] = {
				{3,1,6},
				{5,3,4},
				{9,3,9}
			};
		
		MatrixMulti(arr1,arr2);
		
	}
}