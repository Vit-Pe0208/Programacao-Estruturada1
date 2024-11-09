package estruturada;

import java.util.Scanner;

public class Desafio2 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double imposto;
		
		System.out.println("Qual o seu salário anual: ");
		double salario=input.nextDouble();
		
		if (salario <= 22847.76) {
			System.out.println("Não paga imposto");
		}	
        else if ((salario>=22847.77) && (salario<=33919.80)) {
		         imposto=salario*0.075;
		         System.out.printf("valor do IR:%.2f%n ",imposto);
        }
        else if ((salario>=33919.81) && (salario<=45012.60)) {
                imposto=salario*0.15;
		        System.out.printf("valor do IR:%.2f%n  ",imposto);
        }
        else if ((salario>=45012.61) && (salario<=55976.16)) {
                imposto=salario*0.225;
		        System.out.printf("valor do IR:%.2f%n  ",imposto);
        }        
        else if (salario>=55976.16) {
        	
                imposto=salario*0.275;
		        System.out.printf("valor do IR:%.2f%n  ",imposto);
		
        }
        else
        {
        	System.out.println("salário inválido");
        }
		
		
      
		     
	}

}
