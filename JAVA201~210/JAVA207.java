//207 �T��������P�_ 
import java.util.*;
public class JAVA207 {
	
	static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
		test();
		test();
		test();

	}
	static void test() {
		int a,b,c;
		System.out.println("�п�J�T�Ӿ��:");
		a = keyboard.nextInt();
		b = keyboard.nextInt();
		c = keyboard.nextInt();
		if(a+b<c || a+c<b || b+c<a) {
			System.out.println("���i�H�c���T����");
		}
		else {
			if (a*a + b*b == c*c || a*a + c*c == b*b || b*b + c*c == a*a) {
				System.out.println("�����T����\n");
			}
			else if (a*a + b*b < c*c || a*a + c*c < b*b || b*b + c*c < a*a) {
				System.out.println("�w���T����\n");
			}
		    else{
				System.out.println("�U���T����\n");
			}
	
		}
	}
}
