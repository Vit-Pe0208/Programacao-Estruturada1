package estruturada;

import java.util.Scanner;

public class doismaioresnumeros {
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int contador=1;
	
	System.out.println("Digite um número: ");
	int num=input.nextInt();
	int maior=num;
	int maior2=num;
	
	while(contador<=9)
	{
		System.out.println("Digite um número: ");
		 num=input.nextInt();
	
		if (num>maior) {
			maior2=maior;
			maior=num;
		}else if(num>maior2 && num!=maior) {
			maior2=num;
		}
		
		contador=contador+1;
	}
	System.out.printf("Os dois maiores número da série são:%d%n%d ",maior,maior2);
	
	}
	
}
