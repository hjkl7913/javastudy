package ch03;

public class Cal {

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
}
