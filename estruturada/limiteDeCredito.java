package estruturada;

import java.util.Scanner;

public class limiteDeCredito {
	public static void main(String[] args) {
		int numero_conta,saldo_inicio_do_mês,total_itens_cobrados_cliente,total_de_credito_mensal,limite_de_credito_autorizado;
		Scanner input=new Scanner(System.in);
		
		 System.out.println("Numero da conta: ");
		 numero_conta=input.nextInt();
		 System.out.println("Saldo no inicio do mês: ");
		 saldo_inicio_do_mês=input.nextInt();
		 System.out.println("Total de itens cobrados desse cliente no mês: ");
		 total_itens_cobrados_cliente=input.nextInt();
		 System.out.println("Total de créditos aplicados ao cliente no mês: ");
		 total_de_credito_mensal=input.nextInt();
		 System.out.println("Limite de crédito autorizado: ");
		 limite_de_credito_autorizado=input.nextInt();
		 
		 int novosaldo= saldo_inicio_do_mês+ total_itens_cobrados_cliente-total_de_credito_mensal;
		 System.out.printf("O novo saldo do cliente é: %d%n", novosaldo);
		 
		 if (novosaldo>=limite_de_credito_autorizado)
			 System.out.println("limite de crédito  excedido");
		 
		 
		 
		
		
		
		
	}
	

}


