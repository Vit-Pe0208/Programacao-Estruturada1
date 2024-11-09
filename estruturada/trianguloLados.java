package estruturada;

import java.util.Scanner;

public class trianguloLados {
	//condiçaõ da existencia de um triângulo: a soma de dois lados quaisquer deve ser maior que o terceiro lado.
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite três lados: ");
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		
		if (a+b>c & a+c>b & b+c>a)
            System.out.println("é um triângulo");
		else
            	System.out.println("Não é triângulo");
			
            
		
		
		
		
	}

}
