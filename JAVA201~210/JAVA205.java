//205 ���ƧP�_ 
import java.util.*;
public class JAVA205 {
	
	static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
		test();
		test();
		test();
	}
	static void test() {
		int num;
		System.out.println("Enter an integer:");
		num = keyboard.nextInt();
		
		if (num%2 == 0 & num%3 == 0 & num%6 == 0) {
			System.out.println(num + "�O2�B3�B6������");
		}
		else if (num%2 == 0) {
			System.out.println(num + "�O2������");
		}
		else if (num%3 == 0) {
			System.out.println(num + "�O3������");
		}
		else if (num%6 == 0) {
			System.out.println(num + "�O2������");
		}
		else {
			System.out.println(num + "���O2�B3�B6������");
		}
	}

}
