package estruturada;

import java.util.Scanner;

public class palínDromos {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Digite um palíndromos de cinco dígitos: ");
		int palindromos = input.nextInt();
		System.out.println(palindromos>9999 && palindromos<=99999 ? "é um palindromo" : "Não é um palindromo, tente novamente");
		
	}

}
