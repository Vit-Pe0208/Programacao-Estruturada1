package estruturada;

import java.util.Scanner;

public class fatorialex {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Digite um número inteiro positivos : ");
		int numero=input.nextInt();
		System.out.println("Digite o valor de x  : ");
		double x=input.nextDouble(); 
		int contador=0;
		double total=1;
	
		
		while(contador<=numero)
		{
			if(contador>0) {
			int fatorial=1;
			int e=1;
			
			while(e<=contador)
			{
				fatorial=fatorial*e;
				e++;
				
			}					
			total+=Math.pow(x,contador)/fatorial;
			
			}
			contador++;
		}
		System.out.println(total);
		
		
		
		
	}	

}
