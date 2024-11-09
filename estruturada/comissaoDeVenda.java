package estruturada;

import java.util.Scanner;

public class comissaoDeVenda {
	public static void main(String[] args) {
		double total=0;
		double contador=0;
		double item;
		double rendimento;
		Scanner input=new Scanner(System.in);
		
		System.out.println("digite o numero do item(1,2,3 ou 4) vendido ou 5: ");
		item=input.nextDouble();
		
		if (item==1)
			item=239.99;
		else if (item==2)
			item=129.75;
		else if (item==3)
			item=99.95;
		else if(item==4)
			item=350.89;
		else
			item=0;
		
		
		while(item>4)
		{
			total+=item;
			System.out.println("digite o numero do item(1,2,3 ou 4) vendido ou 5: ");
			item=input.nextDouble();
			
			if (item==1)
				item=239.99;
			else if (item==2)
				item=129.75;
			else if (item==3)
				item=99.95;
			else if(item==4)
				item=350.89;
			else
				item=0;
			
			
		}
		rendimento=200+(0.09*total);
		System.out.printf("o rendimento dele foi de:%.2f%n",rendimento);
				
	}

}
