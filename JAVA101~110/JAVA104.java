//104�Z���p�� 
import java.util.Scanner;

public class JAVA104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x1,y1,x2,y2,distance;
		Scanner scanner = new Scanner(System.in);
		System.out.print("��J��1�ժ�x�My�y�СG");
		x1 = scanner.nextDouble();
		y1 = scanner.nextDouble();
		
		System.out.print("��J��2�ժ�x�My�y�СG");
		x2 = scanner.nextDouble();
		y2 = scanner.nextDouble();
		
		distance = Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
		System.out.printf("����(%.2f,%.2f)�M(%.2f,%.2f)�������Z���O %.2f�C \n",x1,y1,x2,y2,distance);

	}

}
