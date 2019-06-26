package com.biz.exec;

public class FibNubEx_03 {

	/*
	 * 피보나치 수열중 짝수이면서 400만 이하인 항들의 합계
	 */
	public static void main(String[] args) {
		
		int num1 = 1;
		int num2 = 2;

		int sum = num2;
		
		
		while(true) {

			int fnum = num1 + num2;
			if(fnum > 4000000) break;
			if (fnum % 2 == 0)
				sum+=fnum;

			num1 = num2;
			num2 = fnum;
			System.out.println(fnum);
		}
		System.out.println("최종확인 : " + sum);
	}

}
