
    import java.util.Scanner;

public class exerciciolistasegundo {
    /*O programa “Tempo de vida” irá imprimir a soma das idades de todos os
colegas da sua equipe (6 pessoas). Pergunte a cada um a idade e não
esqueça a sua! Depois faça a atribuição direta da expressão em uma
variável inteira.*/



	
	    public static void main(String[] args) {

	        int sum = 0;
	        
	        Scanner msc = new Scanner(System.in);
	     // Pedindo a idade de 6 amigos 
	        for (int i = 0; i < 6; i++) {
	            System.out.println("Digite a idade do amigo " + (i+1));
	         // Está pedindo a entrada do usuário e armazenando na variável `age`.
	            int age = msc.nextInt();
	            // Está adicionando o valor de `age` ao valor de `sum`
	            sum += age;
	        }
	        System.out.println("Digite a sua idade");
	     // Está pedindo a entrada do usuário e armazenando na variável `age`.
	        int age = msc.nextInt();
	        System.out.println("Tempo de vida " + (age + sum));

	        msc.close();
	    }
	}

}
