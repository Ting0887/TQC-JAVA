//404 ���j�̤j���]��
import java.util.*;
public class JAVA404 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int m=0,n;
		while(m!=999) {
			System.out.print("Input m: ");
			m = sc.nextInt();
			if(m!=999) {
				System.out.print("Input n: ");
				n = sc.nextInt();
				System.out.println("�̤j���]�Ƭ�: " + gcd(m,n));
			}
		}
	}
	static int gcd(int m,int n) {
		if(n==0) {
			return m;
		}
		else {
			return gcd(m,m%n);
		}
	}

}
