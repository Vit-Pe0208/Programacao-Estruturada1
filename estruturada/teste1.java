package estruturada;

import java.util.Scanner;

public class teste1 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
	    int x = 1;
	    int total = 0;
	    
	    while(x<=10)
	    {	
	    int y=x*x;
	    System.out.println(y);
	     total+=y;
	     ++x;
	     
	    }
	    System.out.printf("o total é :%d%n",total);
	}
	

}
