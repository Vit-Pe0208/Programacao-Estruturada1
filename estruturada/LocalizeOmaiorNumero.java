package estruturada;

import java.util.Scanner;

public class LocalizeOmaiorNumero {
	public static void main(String[] args) {
	int counter=1;
	Scanner input=new Scanner(System.in);
	
	System.out.println("Digite o inteiro: ");
	int number=input.nextInt();
	int maior=number;
	int menor=number;
	
	while(counter<=9)
	{   
		System.out.println("Digite o inteiro: ");
		 number=input.nextInt();
		 if (number>maior)maior=number;
		
		
	    counter=counter+1;
		
	}
	
	System.out.printf("O maior numero da série é:%d%n ",maior);	
	}

}
