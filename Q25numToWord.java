class q25numToWord {
	
	static void numToWord(int x[]) {
		for(int i=0;i<x.length;i++) {
			if(x[i] == 0) {
				System.out.print("Zero ");
			}
			
			if(x[i] == 1) {
				System.out.print("One ");
			}
			
			if(x[i] == 2) {
				System.out.print("Two ");
			}
			
			if(x[i] == 3) {
				System.out.print("Three ");
			}
			
			if(x[i] == 4) {
				System.out.print("Four ");
			}
			
			if(x[i] == 5) {
				System.out.print("Five ");
			}
			
			if(x[i] == 6) {
				System.out.print("Six ");
			}
			
			if(x[i] == 7) {
				System.out.print("Seven ");
			}
			
			if(x[i] == 8) {
				System.out.print("Eight ");
			}
			
			if(x[i] == 9) {
				System.out.print("Nine ");
			}
		}
	}
	public static void main(String... numtoword) {
		int arr[] = {0,4,1,6};
		for(int p : arr) {
			System.out.print(p + " ");
		}
		System.out.println("");
		numToWord(arr);
	}
}