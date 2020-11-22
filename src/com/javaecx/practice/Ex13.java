package com.javaecx.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("숫자를 입력해 주세요.");
		System.out.print("숫자: ");
		double num = sc.nextDouble();
		
		double fun;
		
		if(num<=0) {
			fun = (num*num*num) - 9*num + 2;
			System.out.println("계산 결과는 " + fun + " 입니다.");
		} else if(num>0) {
			fun = 7*num + 2;
			System.out.println("계산 결과는 " + fun + " 입니다.");
		} 
				
		
		sc.close();
		

	}

}
