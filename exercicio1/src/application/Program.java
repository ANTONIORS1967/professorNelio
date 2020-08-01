package application;

import java.util.Locale;
import java.util.Scanner;

import enttities.Rectangle;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Rectangle rec = new Rectangle();

		System.out.println("Enter rectangle width and height:");
		rec.height = sc.nextDouble();
		rec.width = sc.nextDouble();

		System.out.printf("AREA = %.2f %n ", rec.area());
		System.out.printf("PERIMETRO = %.2f %n ", rec.perimetro());
		System.out.printf("DIAGONAL = %.2f %n ", rec.diagonal());

		sc.close();
	}

}
