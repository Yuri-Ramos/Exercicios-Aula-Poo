/*programa {
	funcao inicio() {
		cadeia nome
		escreva("Diga seu nome: ")
		leia(nome)
		escreva("Olá, ", nome)	
	}
}
 */


package exercicios_aula;


import java.util.Scanner; // função leia, do portugol

public class ExercicioSegundo {
    public static void main(String[] args) {
        
        System.out.println("Digite o seu nome");
        Scanner msc = new Scanner(System.in);
        String name = msc.nextLine(); 
        System.out.println("Olá O seu nome é " + name);
        msc.close();
    }
}
