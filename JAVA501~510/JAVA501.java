//501 �}�C�p�� 
import java.util.Scanner;

public class JAVA501 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int num,sum=0,count=0;
		int[] data = new int[10];
		System.out.println("�п�J10�Ӿ�ơG");
		for(int i=0;i<data.length;i++) {
			System.out.printf("��%d�Ӿ��: ",i+1);
			data[i] = sc.nextInt();
			if(data[i] > 60) {
				sum += data[i];
				count++;
			}
		}
		System.out.printf("�}�C���j��60����%d��\n", count);
		System.out.printf("�`�X��:%d\n", sum);
		System.out.println("�����Ȭ�:" + sum/(double)count);
	}

}
