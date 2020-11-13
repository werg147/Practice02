package com.javaecx.practice;

import java.util.Scanner;

public class Ex06 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 2개를 입력해주세요.");
		System.out.print("숫자1: ");
		int numA = sc.nextInt();
		System.out.print("숫자2: ");
		int numB = sc.nextInt();
		
		if(numA>numB) {
			System.out.print("큰 수: " + numA + "\t");
			System.out.print("작은 수: " + numB + "입니다.");
		} else if(numA<numB) {
			System.out.print("큰 수: " + numB + "\t");
			System.out.print("작은 수: " + numA + "입니다.");
		} else {
			System.out.print("큰 수: " + numA + "\t");
			System.out.print("작은 수: " + numB + "입니다.");
		}
		
		sc.close();
		
	}

}
