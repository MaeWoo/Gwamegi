package practice2;

import java.util.Scanner;

public class practice2 {
	public static void main(String[] args) {
	}
}
class first{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("두 정수를 입력하세요>>");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("10 + 20은 "+(a+b));
		scan.close();
	}
}
class second{
	public static void main(String[] args) {
		System.out.print("몇 층인지 입력하세요>>");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		System.out.println((a*5)+"m 입니다.");
		scan.close();
	}
}
class third{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("x 값을 입력하세요>>");
		int a = scan.nextInt();
		System.out.println("x="+a+", "+"y="+(int)((Math.pow(a, 2)-3*a+7)));
		scan.close();
	}
}
class fourth{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("점 (x,y)의 좌표를 입력하세요>>");
		int a = scan.nextInt();
		int b = scan.nextInt();
		if(a>=50&&b>=50&&a<=100&&b<=100) {
			System.out.println("점("+a+","+b+")은 "+"(50,50)과 (100,100)의 사각형 내에 있습니다.");	
		}
		else {
			System.out.println("사각형 밖에 있습니다.");
		}
		scan.close();
	}
}
class fifth{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("논리 연산을 입력하세요>>");
		String a = scan.next();
		String b = scan.next();
		a = scan.next();
		switch(b) {
		case "OR":System.out.println("true");break;
		case "AND":System.out.println("false");break;
		}
		scan.close();

	}
}
class sixth{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a=0,b=0,c=0,d=0,e=0,f=0,g=0;
		System.out.println("돈의 액수를 입력하세요>>");
		int price = scan.nextInt();
		if (price/50000 >0) {
			a = price/50000;
			price %=50000;
		}
		if (price/10000 >0) {
			b = price/10000;
			price %= 10000;
		}
		if (price/1000 >0) {
			c = price/1000;
			price %= 1000;
		}
		if (price/500 >0) {
			d = price/500;
			price %= 500;
		}
		if (price/100 >0) {
			e = price/100;
			price %= 100;
		}
		if (price/10 >0) {
			f = price/10;
			price %= 10;
		}
		if (price/1 >0) {
			g = price/1;
		}
		System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+g);
		scan.close();
	}
}
class seventh{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("학점을 입력하세요>>");
		String score = scan.next();
		switch(score) {
		case "A" : System.out.println("Excellent");break;
		case "B" : System.out.println("Excellent");break;
		case "C" : System.out.println("Good");break;
		case "D" : System.out.println("Good");break;
		case "F" : System.out.println("Bye");break;
		}
		scan.close();
	}
}
class eighth{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("커피 주문하세요>>");
		String coffee = scan.next();
		int count = scan.nextInt();
		switch(coffee) {
		case "에스프레소":System.out.println(2000*count);break;
		case "아메리카노":System.out.println(2500*count);break;
		case "카푸치노":System.out.println(3000*count);break;
		case "카페라떼":System.out.println(3500*count);break;
		}
		/*
		if(coffee.equals("에스프레소")==true) {
			System.out.println(2000*count);
		}
		else if(coffee.equals("아메리카노")==true) {
			System.out.println(2500*count);
		}
		else if(coffee.equals("카푸치노")==true) {
			System.out.println(3000*count);
		}
		else if(coffee.equals("카페라떼")==true) {
			System.out.println(3500*count);
		}
		*/
	}
}
class ninth{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1~99 사이의 정수를 입력하세요");
		int game = scan.nextInt();
		if(game/10 == 3 ||game/10==6||game/10==9) {
			System.out.print("박수짝");
			if(game%10 == 3 ||game%10==6||game%10==9) {
				System.out.println("짝");
			}
		}
		else{
			if(game%10 == 3 ||game%10==6||game%10==9) {
			System.out.println("박수짝");
			}
		}
	}
}
class tenth{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("커피 주문하세요>>");
		String coffee = scan.next();
		int count = scan.nextInt();
		if(count>=10) {
			switch(coffee) {
			case "에스프레소":System.out.println((int)((2000*count)*0.95));break;
			case "아메리카노":System.out.println((int)((2500*count)*0.95));break;
			case "카푸치노":System.out.println((int)((3000*count)*0.95));break;
			case "카페라떼":System.out.println((int)((3500*count)*0.95));break;
			}
		}
		else {
			switch(coffee) {
			case "에스프레소":System.out.println(2000*count);break;
			case "아메리카노":System.out.println(2500*count);break;
			case "카푸치노":System.out.println(3000*count);break;
			case "카페라떼":System.out.println(3500*count);break;
			}
		}
	}
}