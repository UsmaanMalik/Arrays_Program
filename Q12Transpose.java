class q12Transpose {
	
	public static void printArr(int x[][]) {
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x[i].length;j++) {
				System.out.print(x[i][j] + " ");				
			}
			System.out.println("");
		}
	}
	
	public static void Transpose(int x[][]) {
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x[i].length;j++) {
				System.out.print(x[j][i] + " ");
			}
			System.out.println("");
		}
	}
	public static void main(String... tr) {
		int arr1[][] = {
					{4,2,2},
					{1,5,7},
					{5,3,1},
				};
		
		printArr(arr1);
		System.out.println("");
		Transpose(arr1);
	}

}