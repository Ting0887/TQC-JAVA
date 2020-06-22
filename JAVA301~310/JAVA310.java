//此題題目要求使用do-while-loop 
//310 迴圈正偶數相加
import java.util.*;
public class JAVA310 {
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		int num = 2,sum = 0;
		int size = 0;
		//先讓使用者輸入n值
		System.out.println("請輸入n的值(n>0，且為偶數): ");
		size = input.nextInt(); 
		//檢查n值是否大於零且為偶數，若不符合便一再重新要求輸入 
		while(size<=0||size%2!=0) {
			
			 System.out.print("請輸入n的值(n>0，且為偶數)：");      
			 size = input.nextInt();   
		}
		 //開始進行累加動作 
		do {
			sum = num +sum;  
			num += 2;  
			
		}while(num<=size);//當累加用的變數大於使用者輸入的值便停止
		 
		 System.out.printf("%d+%d+...+%d=%d", 2,4,size,sum); 
		
	}
}
