package array03;

import java.util.Scanner;

public class Gugudan2 {
	

	//사용자로 부터 입력받은 구구단 프로그램을 완성!
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("값을입력하세요:");
		int num = sc.nextInt();
		for(int i=1; i<10; i++) {
			System.out.println(num+"*"+i+"="+(num*i));
		}
		
	}

}
