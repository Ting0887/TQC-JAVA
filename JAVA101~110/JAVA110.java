//110 �ϧέ��n 
public class JAVA110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double totalarea;
        System.out.printf("��έ��n���G%f\n", calCircle(5));
        System.out.printf("�T���έ��n���G%f\n", calTriangle(10,5));
        System.out.printf("����έ��n���G%f\n", calRectangle(5,10));
        totalarea = calCircle(5) + calTriangle(10,5) + calRectangle(5,10);
        System.out.printf("���ϧέ��n���G%f\n", totalarea);

	}
	static double calCircle(double r) {
		return r*r*3.1415926;

    }

    static double calTriangle(double i,double j) {
    	return i*j/2.0;

    }

    static double calRectangle(double w,double h) {
    	return w*h;
    }

}
