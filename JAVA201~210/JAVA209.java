//209 �H���y��
import java.util.*;
public class JAVA209 {
	
	static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		test();
		test();
		test();
		test();
		
		
	}
	public static void test() {
		double x,y;
		System.out.println("�п�Jx�y��: ");
		x = keyboard.nextDouble();
		System.out.println("�п�Jy�y��: ");
		y = keyboard.nextDouble();
		
		if (y==0.0) {
			System.out.printf("(%.2f,%.2f)�bx�b�W\n",x,y);
		}
		else if (x==0.0) {
			System.out.printf("(%.2f,%.2f)�by�b�W\n",x,y);
		}
		else if(x>0.0 && y>0.0) {
			System.out.printf("(%.2f,%.2f)�b�Ĥ@�H��\n",x,y);
		}
		else if(x<0.0 && y>0.0) {
			System.out.printf("(%.2f,%.2f)�b�ĤG�H��\n",x,y);
		}
		else if(x<0.0 && y<0.0) {
			System.out.printf("(%.2f,%.2f)�b�ĤT�H��\n",x,y);
		}
		else {
			System.out.printf("(%.2f,%.2f)�b�ĥ|�H��\n",x,y);
		}

	}

}
