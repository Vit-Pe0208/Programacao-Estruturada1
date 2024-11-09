package estruturada;

import java.util.Scanner;

public class quadradoAsteriscos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um tamanho: ");
        int tamanho = input.nextInt();
        
        if (tamanho < 1 || tamanho > 20) {
            System.out.println("Por favor, insira um tamanho entre 1 e 20.");
        } else {
            int linha = 1;             
            while (linha <= tamanho) {
            	
                int coluna = 1; 
                
                while (coluna <= tamanho) {
                    
                 System.out.print(linha==1||linha==tamanho||coluna==1||coluna==tamanho?"*":" ");
                    coluna++; 
                }
                System.out.println(); 
                linha++; 
            }
        } 
    }
}

