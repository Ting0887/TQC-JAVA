//502 �B�I�ƭp�� 
import java.util.Scanner;

public class JAVA502 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n;
		float sum=0;
		System.out.print("�п�J�ǥͤH�ơG");
		n = sc.nextInt();
		float[] data = new float[n];
		
		for(int i=0;i<data.length;i++) {
			System.out.printf("��%d�Ӿǥͪ����Z�G", i+1);
			data[i] = sc.nextFloat();
			sum += data[i];
		}
		System.out.println("�H��: " + n);
		System.out.println("�`��: " + sum);
		System.out.println("����: " + sum/n);
	}

}
