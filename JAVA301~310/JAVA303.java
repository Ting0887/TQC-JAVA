//303 ������
public class JAVA303 {

	public static void main(String[] args) {
		
		System.out.printf("1~1000���������Ʀ�:");
		// for loop
		int num;
		for(num=2;num<=1000;num++) {
			
			int sum = 0;
			//��X�]�ơA�ò֥[
			for(int i=1;i<num;i++) {
				
				if(num%i==0) {
					sum += i;
				}
				
			}
			
			if(sum==num) {
				System.out.print( " " + num);
			}
			
		}
		System.out.println("");

	}

}
