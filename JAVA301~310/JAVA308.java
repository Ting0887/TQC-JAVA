//308 �q���g��O���`�p
//���D�n�D�ϥ�do-while-loop 
import java.util.*;
public class JAVA308 {
	
	static Scanner input = new Scanner(System.in);
	//�L�v�T���G//static int i = -1;
	
	public static void main(String[] args) {
		int total = 0,s = 0;
		 //do-while-loop���S�ʬO���|���ˬd����A�@�w�|���j�����@�� 
		do {
			System.out.print("�п�J���O���B�A�ο�J-1����: "); 
			total += s;
			//�]�ڭ̬O�z�L�ϥΪ̿�J-1�ӧP�_�����A�ҥH-1���ƭȤ��i�[�J�B��A
			//�G�N���\�b���Y�A�ϥL�L�@�ή�,�|�����Q����O�ױ��Ӹ����j��   
			
			//s = input.nextInt();
			//�i�H�ΤU�C�g�k
			s = new Scanner(System.in).nextInt(); 
			
			
		}while(s!=-1) ;
		System.out.print("�q���P���`���O: " + total); 	
		}
		

	

}
