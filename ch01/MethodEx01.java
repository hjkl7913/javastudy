package ch01;

//�޼���(�Լ�)�� Ŭ�����ȿ� �ۼ��� ���ִ�. (Ŭ���� �ٷξƷ��� �ۼ�)
//�޼���(�Լ�)�� �޼���(�Լ�)�ȿ� �ۼ��� �� ����. 
public class MethodEx01 {

	static int add(int n1,int n2) { //void ���������ʴ´�.
		int result = n1 + n2;
		//System.out.println("result : "+result);
		return result; //return ���� ��������!!
	}
	
	//minus (�Ű������� int�� �ΰ�)(return�� int��)
	static int minus(int m1,int m2 ) {
		int res = m1 - m2;
		return res;
	}
	
	static int multi(int i1,int i2) {
		int resultm = i1 * i2;
		return resultm;
	}
	
	static int divide (int d1, int d2) {
		int resultd = d1 / d2;
		return resultd;
	}
	
	public static void main(String[] args) {
		int num = MethodEx01.add(5,3); //double�ε� �޾�����.
		System.out.println("���ϱ�:"+num);
		//MethodEx01.add(5,3); 
		
		int num1 = MethodEx01.minus(5,3);
		System.out.println("����:"+num1);
		
		int num2 = MethodEx01.multi(5,3);
		System.out.println("���ϱ�:"+num2);
		
		int num3 = MethodEx01.divide(5,3);
		System.out.println("������:"+num3);
	}

}
