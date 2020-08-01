package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.Aluno;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno alu = new Aluno();
		
		alu.nome = sc.nextLine();
		alu.nota1 = sc.nextDouble();
		alu.nota2 = sc.nextDouble();
		alu.nota3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f%n", alu.notaFinal());
		
		if (alu.notaFinal() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", alu.pontosFaltantes());
		} else {
			System.out.println("PASS");
		}
		sc.close();
	}

}
