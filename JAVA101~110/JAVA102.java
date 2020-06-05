//102 單位換算
import java.util.Scanner;
public class JAVA102 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input:");
		double kilo,pound;
		kilo = scanner.nextDouble();
		pound = kilo*2.20462;
		System.out.printf("%f kg = %f ponds\n",kilo,pound);
	}

}
