package exercicios_aula;
/*programa {
	funcao inicio() {
		real nota, totalNotas = 0.0, media
		cadeia disciplina, nome
		
		escreva("Digite seu nome: ")
		leia(nome)
		limpa()
		escreva("Digite sua disciplina: ")
		leia(disciplina)
		limpa()
		//escreva("Digite sua primeira nota: \n")
		//leia(nota1)
		//escreva("Digite sua segunda nota: \n")
		//leia(nota2)
		//escreva("Digite sua terceira nota: \n")
		//leia(nota3)
		/*
		para(inteiro cont = 1; cont <= 3; cont++) {
			escreva("Insira a nota ", cont, ": ")
			leia(nota)
			totalNotas += nota
		}
		*/
		/*
		inteiro cont = 1
		enquanto(cont <= 3) {
			escreva("Insira a nota ", cont, ": ")
			leia(nota)
			totalNotas += nota
			cont++
		}
		inteiro cont = 1
		faca {
            escreva("Insira a nota ", cont, ": ")
			leia(nota)
			totalNotas += nota
			cont++
		} enquanto(cont <= 3)
        
		limpa()
		media = totalNotas/3
		escreva("\nOlá, ", nome, "\n")
		escreva("Na disciplina ", disciplina, " a média é ", media)
	}
}
*/
 
import java.util.Scanner;

public class ExercicioQuato {
    
	public static void main(String[] args) {
		Double nota;
		Double totalNotas = 0.0;
		Double media;
		String nome, disciplina;
		try (Scanner ler = new Scanner(System.in)) {
			System.out.printf("Digite seu nome: ");
			nome = ler.nextLine();

			System.out.printf("Digite sua disciplina: ");
			disciplina = ler.nextLine();

			for (int cont = 1; cont <= 3; cont++) {
				System.out.printf("Insira a nota " + cont + ": ");
				nota = ler.nextDouble();
				totalNotas += nota;
			}
		}

		media = totalNotas / 3;
		System.out.printf("Olá " + nome + "\n");
		System.out.printf("Sua média na disciplina " + disciplina + " foi: " + media);
	}

}

