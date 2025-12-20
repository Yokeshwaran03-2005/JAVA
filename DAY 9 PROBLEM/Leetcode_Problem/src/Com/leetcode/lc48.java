package Com.leetcode;

public class lc48 {

	public static void main(String[] args) {
		int a[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9},
		};
		
		lc48 l=new lc48();
		l.rotate(a);
		for (int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}
 
	}
  
	public void rotate(int a[][]) {
		transpose(a);
		reverse(a);
	}

	private void reverse(int[][] a) {
		int row=a.length;
		for(int i=0;i<row;i++) {
			for(int j=i+1;j<a[i].length;j++) {
				int temp=a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=temp;
			}
		}
		
	}

	private void transpose(int[][] a) {
		int n=a.length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n/2;j++) {
				int temp=a[i][j];
				a[i][j]=a[i][n-j-1];
				a[i][n-j-1]=temp;
			}
		}
		
	}
}
