//304 �\�I�O��
import java.util.*;
public class JAVA304 {
	
	static Scanner keyboard = new Scanner(System.in);
	
	//�]�w�פ����
	static int stop = -1;

	public static void main(String[] args) {
		//�ŧi�ܼ�
		int total = 0;
		int dollar = 0;
		int count = 0;
		//�ϥ�While�j��
		while(dollar!=stop) {
			System.out.print("Please enter meal dollars or enter -1 to stop: ");
			dollar = keyboard.nextInt();
			
			if (dollar!=stop) {
				total += dollar;
				count ++;
			}
			
		}
		  System.out.println("�\�I�`�O��: " + total);
	      System.out.printf("%d �D�\�I�����O�ά�: %.2f\n", count, (double)total/count);

	}

}
