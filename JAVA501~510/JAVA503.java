//503 �x�}���M 
public class JAVA503 {
	final static int row=2;
	final static int col=3;
	public static void main(String[] args) {
		int A[][] = {{1,2,3},{4,5,6}};
		int B[][] = {{7,8,9},{10,11,12}};
		int C[][] = new int[row][col];
		
		System.out.println("�}�CA�����e��(2x3)�G\n");
		show(A);
		
		System.out.println("\n�}�CB�����e��(2x3)�G\n");
		show(B);
		
		add(A,B,C);
		
		System.out.println("\n�}�CA+B=C�A�}�CC�����e��(3x3)�G\n");
		show(C);

	}
	public static void add(int a[][],int b[][],int c[][]) {
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
	}
	public static void show(int c[][]) {
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.printf("%02d ",c[i][j]);
			}
			System.out.printf("\n");
		}
	}

}
