//507 �����O�έp�� 
public class JAVA507 {

	public static void main(String[] args) {
		int hours;
		hours = 2;
		park(hours);
		System.out.println("--------------------");
		
		hours = 3;
		park(hours);
		System.out.println("--------------------");
		
		hours = 5;
		park(hours);
		System.out.println("--------------------");
		
		hours = 8;
		park(hours);
		

	}
	public static void park(int hours) {
		int fee = 0;
		int[] hourTable = {0,2,4,6};
		int[] feeTable = {30,50,80,100};
		System.out.println("�����ɼơG" + hours + "�p��");
		for(int i=3;i>=0;i--) {
			if(hours>hourTable[i]) {
				fee += (hours-hourTable[i])*feeTable[i];
				hours = hourTable[i];
			}
		}
		System.out.println("��ú�O�ΡG" + fee + "����");
	}

}
