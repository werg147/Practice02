package com.javaecx.practice;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1;
		int n2;
		int max;
		int mil;
		
		System.out.print("첫번째 숫자: ");
		n1 = sc.nextInt();
		System.out.print("두번째 숫자: ");
		n2 = sc.nextInt();
		
		if(n1<n2) {
			mil = n1;
			max = n2;
			if((max%mil)==0) {
				System.out.println(mil + " 는(은) " + max + " 의 약수입니다.");
			} else {
				System.out.println(mil + " 는(은) " + max + " 의 약수가 아닙니다.");
			}
		} else if(n1>n2) {
			mil = n2;
			max = n1;
			if((max%mil)==0) {
				System.out.println(mil + " 는(은) " + max + " 의 약수입니다.");
			} else {
				System.out.println(mil + " 는(은) " + max + " 의 약수가 아닙니다.");
			}
		}
		
		sc.close();
		
	}
	
}
