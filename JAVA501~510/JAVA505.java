//505 ����}�C 
public class JAVA505 {

	public static void main(String[] args) {
		String[] data = {"A","B","C","D","E","F","G","H","I","J"};
		System.out.print("����}�C��Ƥ��e�G ");
		for(int i=0;i<data.length;i++) {
			System.out.print(" " + data[i]);
		}
		
		reverse(data);
		System.out.print("\n����}�C��Ƥ���G ");
		for(int i=0;i<data.length;i++) {
			System.out.print(" " + data[i]);
		}
	}
	public static void reverse(String[] data) {
		String tmp;
		for(int i=0,j=9 ;i<j ;i++,j--) {
			tmp = data[i];
			data[i] = data[j];
			data[j] = tmp;
		}
	}

}
