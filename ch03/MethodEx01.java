package ch03;

import ch03.MethodEx01;

public class MethodEx01 {


	
	public static void main(String[] args) {
		int num = Cal.add(5,3); //double�ε� �޾�����.
		System.out.println("���ϱ�:"+num);
		//MethodEx01.add(5,3); 
		
		int num1 = Cal.minus(5,3);
		System.out.println("����:"+num1);
		
		int num2 = Cal.multi(5,3);
		System.out.println("���ϱ�:"+num2);
		
		int num3 = Cal.divide(5,3);
		System.out.println("������:"+num3);
	}
}
