package array03;

public class ArrayEx01 {
//ctrl +shift +s  ��ü��������
	public static void main(String[] args) {
		//ǥ������ �ٷ� ����ȴ�. �μ���1���̸� ; ���� ���� ; �� �����ڶ���Ѵ�.
		int num = 1;
		for (long i = 2L; i <= 200000000000000000L; i=i*2) { //�ݺ� stack
			System.out.println("2��"+num+"��:"+i);
			num++;
		}
		
		/*while(true) { //���ѹݺ� 
			//���̾��� ��� ���� ���μ������� ���� ������ �ϴ°��� Daemon (�������μ���)��� �ϸ�,  
			//Notify �ϴ� ���� ������ ��� �θ���. �ð��� ������� �ΰ� �ݺ�����
		} */

	}

}
