//301 ��Ƴs�[
import java.util.*;
public class JAVA301 {
	static Scanner keyboard = new Scanner(System.in);//�]�i�H�β�7��g�k
	
	public static void main(String[] args) {
		//Scanner keyboard = new Scanner(System.in);
		// �ŧi�ܼ�
		int num;
		int sum=0;
		
		//���o��L��J���
		System.out.println("Input:");
		num = keyboard.nextInt();
		
		//�j�餺�e
		for(int i=1;i<=num;i++) {
			sum += i;
		}
		System.out.println("1 + ... + " + num + " = " + sum );

	}

}
