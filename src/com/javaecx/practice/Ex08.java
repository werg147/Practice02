package com.javaecx.practice;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1;
		int n2;
		int n3;
		
		System.out.println("숫자 3개를 입력해주세요");
		System.out.print("숫자1: ");
		n1 = sc.nextInt();
		System.out.print("숫자2: ");
		n2 = sc.nextInt();
		System.out.print("숫자3: ");
		n3 = sc.nextInt();
		
		if(n1<n2 && n1<n3) {
			System.out.println("가장 작은수는 " + n1 + " 입니다.");
		} else if(n2<n1 && n2<n3) {
			System.out.println("가장 작은수는 " + n2 + " 입니다.");
		} else {
			System.out.println("가장 작은수는 " + n3 + " 입니다.");
		}
		
		
		
		sc.close();

	}

}