package practice2;

import java.util.Scanner;
public class Arithmetic {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("식을 입력하세요>>");
		double op1 = scan.nextDouble();
		String operator = scan.next();
		double op2 = scan.nextDouble();
		double result =0;
		switch(operator) {
		case "+" : result = op1 + op2;break;
		case "-" : result = op1 - op2;break;
		case "*" : result = op1 * op2;break;
		case "/" : 
			if(op2 == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
			return;
			}
			result = op1 / op2;
		defualt: System.out.println("연산 기호가 잘못되었습니다.");
		}
		System.out.println("연산 결과 "+result);
	}
}
