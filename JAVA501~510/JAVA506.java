//506 三維陣列元素之和
public class JAVA506 {

	public static void main(String[] args) {
		int sum = 0;
		int A[][][] = {{{1,2,3},{4,5,6}},
				  {{7,8,9},{10,11,12}},
				  {{13,14,15},{16,17,18}},
				  {{19,20,21},{22,23,24}}};
		for(int i=0;i<4;i++) {
			for(int j=0;j<2;j++) {
				for(int k=0;k<3;k++) {
					sum += A[i][j][k];
				}
			}
		}
		System.out.println("sum = " + sum);
	}

}
