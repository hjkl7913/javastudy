package ch01;

public class OperEx02 {

	public static void main(String[] args) {
		int sum = 0; //int sum;  0�� ���ִ�.  int sum = 0; �ʱ�ȭ�ߴ�.
		int distance = 100;
		int move = 20;
		
		sum = sum + move;          //sum = 0 + 20 = 20 
		System.out.println(sum);
		
		sum = sum + move;
		System.out.println(sum);  // sum = 20 + 20 = 40 �����ȴ�.

		sum = sum + move;
		System.out.println(sum);
		
		sum = sum + move;
		System.out.println(sum);
		
		sum = sum + move;
		System.out.println("�����ΰŸ�:"+sum);  //���� ����(String)+����(int) ���ڷι����� ����������ȯ �Ѵ�.
		System.out.println("������:"+distance); // +�� ���ڳ��� ���� Ȥ�� ���ڿ� ����
	}

}
