package estruturada;

import java.util.Scanner;

public class Triangulorentangulo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite três lados: ");
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		
		
	   
		if (Math.pow(a, 2)+Math.pow(b, 2)== Math.pow(c, 2))
		 System.out.println("é um triâgulo direito");
		else
			System.out.println("não é um triangulo direito");
	}

}
