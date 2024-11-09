package estruturada;

public class operadoresLogicos {
	public static void main(String[] args) {
		System.out.printf("%s%n%s: %b%n%s : %b%n%s: %b%n%s: %b%n%n", 
				         "Condição E(&&)","falso && falso",(false && false),
				         "falso && verdadeiro",(false && true),
				         "verdadeiro && falso",(true && false),
				         "verdadeiro && verdadeiro",(true && true));
		
		 System.out.printf("%s%n%s: %b%n%s : %b%n%s: %b%n%s: %b%n%n", 
		                  "Condição OU(||)","falso || falso",(false || false),
		                  "falso || verdadeiro",(false || true),
		                  "verdadeiro || falso",(true || false),
		                  "verdadeiro || verdadeiro",(true || true));
		 
		 System.out.printf("%s%n%s: %b%n%s : %b%n%s: %b%n%s: %b%n%n", 
		                  "Lógica Booleana E(&)","falso & falso",(false & false),
		                  "falso & verdadeiro",(false & true),
		                  "verdadeiro & falso",(true & false),
		                  "verdadeiro & verdadeiro",(true & true));
		 
		 System.out.printf("%s%n%s: %b%n%s : %b%n%s: %b%n%s: %b%n%n", 
                          "Lógica Booleana inclusiva OU(|)","falso | falso",(false | false),
                          "falso | verdadeiro",(false | true),
                          "verdadeiro | falso",(true | false),
                          "verdadeiro | verdadeiro",(true | true));
		 
		 System.out.printf("%s%n%s: %b%n%s : %b%n%s: %b%n%s: %b%n%n", 
                          "Lógica booleana exclusiva OU (^) ",
                          "falso ^ falso",(false ^ false),
                          "falso ^ verdadeiro",(false ^ true),
                          "verdadeiro ^ falso",(true ^ false),
                          "verdadeiro ^ verdadeiro",(true ^ true));
		 
		 System.out.printf("%s%n%s: %b%n%s : %b%n%s", 
                          "Logica Não(!)",
                          "!falso",(!false),"!verdadeiro",(!true));		
	}

}
