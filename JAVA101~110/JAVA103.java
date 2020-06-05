//103 ­pºâ¥­§¡­È
import java.util.Scanner;

public class JAVA103 {

	public static void main(String[] args) {
		int a,b,c;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input: ");
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		
		System.out.printf("Average: %4.2f",(a+b+c)/3.0);

	}

}
