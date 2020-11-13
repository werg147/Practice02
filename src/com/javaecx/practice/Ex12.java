package com.javaecx.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String mark;
		int n1;
		int n2;
		
		System.out.println("출력되는 내용을 입력하세요.");
		System.out.print("기호: ");
		mark = sc.nextLine();
		System.out.print("숫자1: ");
		n1 = sc.nextInt();
		System.out.print("숫자2: ");
		n2 = sc.nextInt();
		
		switch(mark) {
			case "+":
				System.out.println("결과는: " + (double)(n1+n2));
				break;
			case "-":
				System.out.println("결과는: " + (double)(n1-n2));
				break;
			case "*":
				System.out.println("결과는: " + (double)(n1*n2));
				break;
			case "/":
				System.out.println("결과는: " + (double)(n1/n2));
				break;
				
			default:
				System.out.println("계산할 수 없습니다.");
		}
		
		
		
		sc.close();

	}

}
