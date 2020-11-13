package com.javaecx.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cm;
		int kg;
		float stan;
		
		System.out.println("키와 몸무게를 입력해주세요.");
		System.out.print("키: ");
		cm = sc.nextInt();
		
		System.out.print("몸무게: ");
		kg = sc.nextInt();
		
		stan = (cm-100) * 0.9f;
		
		if(stan>kg) {
			System.out.println("저체중 입니다.");
		} else if(stan<kg) {
			System.out.println("과체중 입니다.");
		} else {
			System.out.println("표준체중 입니다.");
		}
		
		System.out.print("표준체중: " + stan);
		
		sc.close();

	}

}
