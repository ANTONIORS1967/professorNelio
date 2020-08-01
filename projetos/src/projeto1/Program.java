package projeto1;



import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Cicle;
import entities.Rectangle;
import entities.enums.Color;
import entities.Shape;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of shapes:");
		int n = sc.nextInt();
		List<Shape> list = new ArrayList<>();
		
		for(int i=1;i<=n;i++) {
			System.out.println("Shape # " +i+ " data:");
			System.out.println("Rectangle or Circle (r/c)?");
			char ch = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED):");
			Color color = Color.valueOf(sc.next());
			if(ch=='r') {
				System.out.println("Width:");
				Double width = sc.nextDouble();
				System.out.println("Height");
				Double height = sc.nextDouble();
				list.add(new Rectangle(color,width,height));
				
			}
			else {
				System.out.println("Radius");
				Double radius = sc.nextDouble();
				list.add(new Cicle(color,radius));
			}
			
		}
		System.out.println();
		System.out.println("SHAPE AREAS:");
		for(Shape shape : list) {
			System.out.println( String.format("%.2f", shape.area()) );
		}
		
		sc.close();
	}

}
