//105�s���� 
import java.util.Scanner;
public class JAVA105 {

	public static void main(String[] args) {
		String name;
        int oned, fived, tend, fifd;          
      int totalm;
      int totalhun;
      int totalten;
      int totalunit;
      int totalt;
      
      Scanner keyboard = new Scanner(System.in);
      System.out.print("�п�J�p�ĩm�W�G");
      name = keyboard.next();
      System.out.printf("Hi, %s,�п�J�A���ɪO���ӼơG\n",name);
      System.out.print("�п�J1�����ƶq�G");
      oned = keyboard.nextInt();
      System.out.print("�п�J5�����ƶq�G");
      fived = keyboard.nextInt();
      System.out.print("�п�J10�����ƶq�G");
      tend = keyboard.nextInt();
      System.out.print("�п�J50�����ƶq�G");
      fifd = keyboard.nextInt();
      totalm = oned + 5 * fived + 10 * tend + 50 * fifd;
      totalt = totalm / 1000;
      totalm = totalm % 1000;
      totalhun = totalm / 100;
      totalm = totalm % 100;
      totalten =  totalm / 10; 
      totalunit = totalm % 10;
      System.out.printf("�z�����`�@���G%d �d  %d ��  %d �Q  %d ��\n", totalt, totalhun, totalten, totalunit);

	}

}
