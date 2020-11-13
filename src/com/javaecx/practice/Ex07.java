package com.javaecx.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1;
		int n2;
		int quo;
		int rema;
		
		System.out.print("첫번째 숫자: ");
		n1 = sc.nextInt();
		System.out.print("두번째 숫자: ");
		n2 = sc.nextInt();
		
		if(n1>n2) {
			quo = n1/n2;
			rema = n1%n2;
			System.out.println("몫: " + quo);
			System.out.println("나머지: " + rema);
		} else if(n1<n2) {
			quo = n2/n1;
			rema = n2%n1;
			System.out.println("몫: " + quo);
			System.out.println("나머지: " + rema);
		}
			
		sc.close();

	}

}
