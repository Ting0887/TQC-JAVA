//403 ���ݻ��j����p�� 
import java.util.*;
public class JAVA403 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int m=0,n;
		while(m!=999) {
			System.out.print("Input m:");
			m = sc.nextInt();
		if(m!=999) {
			System.out.print("Input n:");
			n = sc.nextInt();
			
			System.out.println("Ans�]���ݻ��j�^: "+powerTail(m,n,1));
			System.out.println("Ans�]�j��^:"+powerLoop(m,n,1));
			}
		}
	}
	static int powerTail(int m,int n,int r) {
		if(n==0) {
			return r;
		}
		else {
			return powerTail(m,n-1,r*m);
		}
	}
	static int powerLoop(int m,int n,int r) {
		while(n!=0) {
			r = r*m;
			n--;
		}
		return r;
	}
}
