//307 �j��̤j���]��
import java.util.*;
public class JAVA307 {
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int num1,num2;
		// //�����ϥΪ̦b�j��~����J��ӼƦr 
		System.out.println("Input:");
		
		num1 = input.nextInt();
		num2 = input.nextInt();
		
		///�Y���󤣲ŦX�K���|�i�J�j�� 
		
		while(num1!=999) {
			//�@�i�|�j���A�|������@��gcd��k 
			System.out.println(gcd(num1,num2));
			//�ϥΪ̦A����J��ӼƦr�A�ѤU���j��P�_ 
			System.out.println("Input:");
			num1 = input.nextInt();
			num2 = input.nextInt();
		}
		
	}
	private static int gcd(int m,int n) {
		int tmp;
		while (m%n!=0) {
			tmp = n;
			n = m%n;
			m = tmp;
			
		}
		return n;
	}
		
}
