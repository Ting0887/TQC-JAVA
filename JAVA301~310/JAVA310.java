//���D�D�حn�D�ϥ�do-while-loop 
import java.util.*;
public class JAVA310 {
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		int num = 2,sum = 0;
		int size = 0;
		//�����ϥΪ̿�Jn��
		System.out.println("�п�Jn����(n>0�A�B������): ");
		size = input.nextInt(); 
		//�ˬdn�ȬO�_�j��s�B�����ơA�Y���ŦX�K�@�A���s�n�D��J 
		while(size<=0||size%2!=0) {
			
			 System.out.print("�п�Jn����(n>0�A�B������)�G");      
			 size = input.nextInt();   
		}
		 //�}�l�i��֥[�ʧ@ 
		do {
			sum = num +sum;  
			num += 2;  
			
		}while(num<=size);//��֥[�Ϊ��ܼƤj��ϥΪ̿�J���ȫK����
		 
		 System.out.printf("%d+%d+...+%d=%d", 2,4,size,sum); 
		
	}
}
