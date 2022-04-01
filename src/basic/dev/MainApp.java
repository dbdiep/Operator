package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap a");
		int a = sc.nextInt();
		System.out.println("Nhap b");
		int b = sc.nextInt();
		
		System.out.format("%d + %d = %d %n", a, b, a + b);
		System.out.format("%d - %d = %d %n", a, b, a - b);
		System.out.format("%d * %d = %d %n", a, b, a * b);
		System.out.format("%d / %d = %d %n", a, b, a / b);

		System.out.println("Nhap so thap phan d");
		float d = sc.nextFloat();
		System.out.format("%.2f %n", d);
		
		System.out.println("Nhap c");
		int c = sc.nextInt();
		System.out.format("%d + %d > %d %s  %n", a, b, c, a + b > c);
		System.out.format("%d + %d < %d %s  %n", a, b, c, a + b < c);
		System.out.format("%d + %d >= %d %s  %n", a, b, c, a + b >= c);
		System.out.format("%d + %d <= %d %s  %n", a, b, c, a + b <= c);
		System.out.format("%d - %d > %d %s  %n", a, b, c, a - b > c);
		System.out.format("%d - %d < %d %s  %n", a, b, c, a - b < c);
		System.out.format("%d - %d >= %d %s  %n", a, b, c, a - b >= c);
		System.out.format("%d - %d <= %d %s  %n", a, b, c, a - b <= c);
		System.out.format("%d * %d > %d %s  %n", a, b, c, a * b > c);
		System.out.format("%d * %d < %d %s  %n", a, b, c, a * b < c);
		System.out.format("%d * %d >= %d %s  %n", a, b, c, a * b >= c);
		System.out.format("%d * %d <= %d %s  %n", a, b, c, a * b <= c);
		System.out.format("%d / %d > %d %s  %n", a, b, c, a / b > c);
		System.out.format("%d / %d < %d %s  %n", a, b, c, a / b < c);
		System.out.format("%d / %d >= %d %s  %n", a, b, c, a / b >= c);
		System.out.format("%d / %d <= %d %s  %n", a, b, c, a / b <= c);
	}
}
