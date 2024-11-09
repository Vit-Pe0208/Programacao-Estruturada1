package estruturada;

import java.util.Scanner;

public class fatorial {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Digite um número inteiro positivos : ");
		int numero=input.nextInt();
		if(numero==0)
			System.out.println("1");
		else if (numero<0)
		System.out.println("número inválido");
		else {
			int fatorial=1;
			while(numero>=1)
			{
				
				fatorial=fatorial*numero;
				numero--;
				
				
			}
			System.out.println(fatorial);
		}
		
	}

}
