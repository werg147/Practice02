package com.javaecx.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int won;
		
		System.out.println("수익을 입력해 주세요.");
		System.out.print("금익: ");
		won = sc.nextInt();
		
		if(0<=won && won<=1000) {
			double tax = 0.09*won;
			System.out.println("소득세는 " + tax + " 입니다.");
		} else if(1000<won && won<=4000) {
			double tax = 1000*0.09 + 0.18*(won-1000);
			System.out.println("소득세는 " + tax + " 입니다.");
		} else if(4000<won && won<=8000) {
			double tax = 1000*0.09 + 3000*0.18 + 0.27*(won-4000);
			System.out.println("소득세는 " + tax + " 입니다.");
		} else if(8000<=won) {
			double tax = 1000*0.09 + 3000*0.18 + 4000*0.27 + 0.36*(won-8000);
			System.out.println("소득세는 " + tax + " 입니다.");
		} else {
			System.out.println("잘못 입력했습니다.");
		}
		
		
		
		
		sc.close();
	}

}
