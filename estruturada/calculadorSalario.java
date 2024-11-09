package estruturada;

import java.util.Scanner;


public class calculadorSalario {
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);	
	double salariobruto;
	double horaextra;
	int contador=1;
	
	
	while(contador<=3)
	{
    System.out.println("horas trabalhadas: ");
	double horatrabalhada=input.nextDouble();
	System.out.println("salario-hora: ");
	double salariohora=input.nextDouble();
	
	if (horatrabalhada>40) { 
	horaextra=horatrabalhada-40;	
	salariobruto=40*salariohora+(1.5*horaextra*salariohora);
	System.out.printf("O salario bruto é: %.2f%n", salariobruto);
	}
	else 
		salariobruto=horatrabalhada*salariohora;
		System.out.printf("O salario bruto é:%.2f%n ",salariobruto);
	contador=contador+1;
	}
	System.out.println("Fim do programa");
	}
	

}
