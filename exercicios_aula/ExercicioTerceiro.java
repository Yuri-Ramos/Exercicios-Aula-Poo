
/*programa {
	funcao inicio() {
		cadeia nome
		inteiro idade
		escreva("Qual é o seu nome? ")
		leia(nome)
		
escreva("\nQual é a sua idade? ")
		leia(idade)
		limpa()
		escreva("Seu nome é ", nome, " e sua idade é ", idade)
	}
}
 */




package exercicios_aula;

import java.util.Scanner;

public class ExercicioTerceiro {
    
public class TerceiroExercicio {

    public  void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu nome");
        String name = scanner.nextLine();
        System.out.println("Digite a sua idade");
        int age = scanner.nextInt();
        System.out.println("O seu nome: " + name + " e sua idade é " + age);
        scanner.close();
    }
}
}
