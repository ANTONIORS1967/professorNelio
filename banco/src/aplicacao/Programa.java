package aplicacao;

import entidade.Conta;
import entidade.ContaJuridica;
import entidade.ContoPoupanca;

public class Programa {

	private static Conta acc1;

	public static void main(String[] args) {
		
	Conta acc = new Conta(1001,"Antonio", 0.0);
	ContaJuridica bacc = new ContaJuridica(1002,"Maria",0.0, 500.0);
	
	//UpCasting
	
	acc1 = bacc;
	Conta acc2 = new ContaJuridica(1003,"Vinicius",0.0, 200.0);
	Conta acc3 = new ContoPoupanca(1004,"Henrique",0.0, 0.01);
	
	//Downcasting
	
	
	ContaJuridica acc4 = (ContaJuridica)acc2;
	acc4.emprestimo(100.0);
	
	//ContaJuridica acc5 = (ContaJuridica)acc3;
	
		if(acc3 instanceof ContaJuridica) {
			ContaJuridica acc5 =(ContaJuridica)acc3;
			acc5.emprestimo(200.0);
			System.out.println( "Empresimo");
		}
		if(acc3 instanceof ContoPoupanca) {
			ContoPoupanca acc5 =(ContoPoupanca)acc3;
			acc5.utilizarSaldo();
			System.out.println("utilizarSaldo");
		}
	}
}
