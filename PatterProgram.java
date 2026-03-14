public class PatterProgram {
	public static void main(String args[]) {
		int n = 4;
		int s = 2*n-1;
		for(int i = 0 ; i<s; i++) {
			for(int j= 0; j<s;j++) {
			
			int max=i;
			int l=j;
			int r=s-1-j;
			int min = s-1-i;
			int v= n-Math.min(Math.min(max, min), Math.min(l, r));
				System.out.print(v+ " ");
			}
			System.out.println();
		}
	}

}
