package exercicio-listas-poo.exercicio;

import java.util.Scanner;// função leia
public class exerciciolistaquarto {
    
/*O programa “termômetro” lê uma temperatura em graus celsius, e devolve
sua equivalência na escala fahrenheit. (Use: F = C * 1, 8 + 32)*/

	
	    public static void main(String[] args) {
	        Scanner meuObj = new Scanner(System.in);
	        // Está imprimindo uma mensagem na tela.
	        System.out.println("Digite a temperatura em Celsius");
	        // Está recebendo a entrada do usuário e armazenando-a na variável `temp`.
	        double temp = meuObj.nextDouble();
	        // Está convertendo a temperatura de Celsius para Fahrenheit.
	        double fahrenheit =  (temp * 1.8) + 32;

	     // Está imprimindo a temperatura em Fahrenheit com duas casas decimais.
	        System.out.printf("A temperatura é %.2f°", fahrenheit);

	        meuObj.close();
	        
	    }
	}
}
