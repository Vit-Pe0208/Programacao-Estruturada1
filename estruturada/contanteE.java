package estruturada;

import java.util.Scanner;

public class contanteE {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número inteiro positivo: ");
        int numero = input.nextInt();
        int contador = 1;
        double total = 1.0; // Começa com 1 para incluir o primeiro termo 1/0!
        
        while (contador <= numero) {
            int fatorial = 1;
            int i = 1;
            
            // Calcula o fatorial de contador
            while (i <= contador) {
                fatorial *= i;
                i++;
            }
            
            total += 1.0 / fatorial;
            contador++;
        }
        
        System.out.println(total);
        input.close();
    }
}

