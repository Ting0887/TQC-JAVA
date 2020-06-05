//204 ¤½­¿¼Æ­pºâ 
import java.util.*;
public class JAVA204 {
	
	static Scanner input= new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
		test();

	}
	static void test() {
		int num;
		System.out.println("Input:");
		num = input.nextInt();
		if (num%5==0 & num%9==0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
