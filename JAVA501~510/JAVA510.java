//510 �G���j�M�k 
import java.util.*;
public class JAVA510 {
	private static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		search();
		search();

	}
	public static void search() {
		int[] data = {5, 9, 13, 15, 17, 19, 25, 30, 45};
		
		System.out.print("�п�J�n�M�䪺���: ");
		int target = keyboard.nextInt();
		
		int left=0;
		int right=data.length-1;
		int middle=0;
		
		int times=0;
		
		while(left<=right) {
			middle = (right+left)/2;
			
			System.out.printf("�M��϶�: %d(%d)..%d(%d),����: %d(%d)\n",left,data[left],right,data[right],middle,data[middle]);
			
			times++;

			if(target==data[middle]){
				break;
			}
			if(target<data[middle]){
				right = middle - 1;
			}
			else{
				left = middle + 1;
			}
		}
		System.out.printf("�g�L %d �����M��\n",times);
		
		if(target==data[middle]) {
			System.out.printf("�z�n�䪺��Ʀb�}�C������%d�Ӧ�m\n", middle);
		}
		else {
			 System.out.printf("%d���b�}�C��\n", target);
		}
	}

}
