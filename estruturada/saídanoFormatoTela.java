package estruturada;

import java.util.Scanner;

public class saídanoFormatoTela {
	public static void main(String[] args) {
		int n=1;
		Scanner input=new Scanner(System.in);
		System.out.println("N   10*N 100*N  1000*N");
		while(n<=5)
		{
			
			int n2=n*10;
			int n3=n*100;
			int n4= n*1000;
			
		
		System.out.printf("%d   %d    %d   %d%n",n,n2,n3,n4);
			
			n=n+1;
		}
	}

}
