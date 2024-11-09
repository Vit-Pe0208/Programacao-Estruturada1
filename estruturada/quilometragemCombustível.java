package estruturada;

import java.util.Scanner;

public class quilometragemCombustível {
	public static void main(String[] args) {
		int total=0;
		int soma=0;
		double quilometro_por_litro;
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Digite os quilometros percorrido ou -1: ");
		int km=input.nextInt();
		System.out.println("Digite a quantidade de litros de gasolina: ");
		int l=input.nextInt();
		quilometro_por_litro=(double)km/l;
		System.out.printf("quilometro por litros na viajem:%.2f%n",quilometro_por_litro);
		
		while(km!=0)
		{
			total+=km;
			++km;
			soma+=l;
			++l;
			
			System.out.println("Digite os quilometros percorrido ou 0 para parar: ");
			km=input.nextInt();
			System.out.println("Digite a quantidade de litros de gasolina  ou 0 para parar: ");
			l=input.nextInt();
		    quilometro_por_litro=(double)km/l;	
			System.out.printf("quilometro por litros na viajem:%.2f%n ",quilometro_por_litro);
		}
		
		System.out.printf("a quilometragem total é %d%n", total);
		System.out.printf("a quantidade total de litros de gasolina consumidos é %d%n" , soma);
		
	}

}
