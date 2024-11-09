package estruturada;

import java.util.Scanner;

public class desempenhoAlunos {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int passes = 0;
		int failures = 0;
		int studentCounter = 1;
		
		while(studentCounter<=10)
		{
			System.out.print("Entre com um resultado(1=pass,2=fail): ");
			int result = input.nextInt();
			
			if(result==1 || result==2) {
			if (result == 1)
				passes = passes +1;
			else
				failures=failures+1;
			
			studentCounter = studentCounter+1;	
			}else {
				--studentCounter ;
			    System.out.println("número inválido, tente 1 ou 2.");
			}
		}
	         System.out.printf("Passed: %d%n Failed: %d%n", passes, failures);
	         
	         if(passes>8)
	        	 System.out.println("Bonus ao professor");
	}
	

}
