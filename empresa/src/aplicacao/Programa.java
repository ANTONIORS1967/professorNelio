package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidade.Empregado;
import entidade.EmpregadoTerceirizado;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Empregado> list = new ArrayList<>();
		
		System.out.print("Entre com o quantidade de empregados:");
		int n = sc.nextInt();
		for(int i = 1; i<=n;i++) {		
		System.out.println("Dados  do empregado  #" +i+ " :");
		System.out.print("Terceirizao (s/n)? ");
		char ch = sc.next().charAt(0);
		System.out.print("Nome: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Horas:");
		sc.nextLine();
		int  hora = sc.nextInt();
		System.out.print("Valor por hora:");
		sc.nextLine();
		double valorPorhora = sc.nextDouble();
		if(ch=='s') {
			System.out.print("Cobran�a adicional ");
			double cobrancaAdicional = sc.nextDouble();
			
			list.add(new EmpregadoTerceirizado(nome, hora, valorPorhora,cobrancaAdicional));
		}
		else {
			list.add(new Empregado(nome, valorPorhora, hora));
		}
		
		}
		
		System.out.println();
		System.out.println("Forma de pagamento: ");
		for (Empregado emp : list) {
			System.out.println(emp.getNome() + " - $ " + String.format("%.2f", emp.FormaDePagamento()));
		}
		
			
		sc.close();
	}

}
