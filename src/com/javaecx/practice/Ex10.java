package com.javaecx.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sa;
		
		System.out.println("사번(정수)를 입력해주세요.");
		System.out.print("사번: ");
		sa = sc.nextInt();
		
		if(sa>0) {
			if((sa%3)==0) {
				System.out.println("A팀입니다.");
			} else if((sa%3)==1) {
				System.out.println("B팀입니다.");
			} else if((sa%3)==2) {
				System.out.println("C팀입니다.");
			}
		}
		
		sc.close();
		
		

	}

}
