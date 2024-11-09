package estruturada;

import java.util.Scanner;

public class equivalenteDobinario {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Insira um número inteiro que contenha somente 0 ou 1: ");
		int numero=input.nextInt();
		int contador=0;
		int total=0;
		int num1;
		int valor_decimal=0;
		int decimal=1;
	    while(numero>=1)
	    {
	    	num1=numero%10;
	    	valor_decimal=num1*decimal;
	    	total=total+valor_decimal;
	    	decimal*=2;
	    	numero=numero/10;
	    	contador++;
	    	
	    }
	    System.out.println(total);
		
		
			
			
		
	}

}
