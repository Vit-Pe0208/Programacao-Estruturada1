package estruturada;

import java.util.Scanner;

public class maiorEmenor {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int contador=1;
		System.out.println("Digite um inteiro: ");
		int num=input.nextInt();
		int maior=num;
		int menor=num;
		
		while(contador<=9)
		{
			System.out.println("Digite um inteiro: ");
			num=input.nextInt();
			
			if(num>maior) {
				maior=num;
			}else if(num<menor ) {
				menor=num;
			}
			contador++;
				
			
		}
		System.out.printf("O maior número é: %d%n",maior);
		System.out.printf("O menor número é: %d%n",menor);
		
	}

}
