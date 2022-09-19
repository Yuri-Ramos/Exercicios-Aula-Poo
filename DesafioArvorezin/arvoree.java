

import java.util.Scanner;
import java.lang.Thread;

import java.util.InputMismatchException;
public class arvoree {
    

    public static void main(String[] args) {
		arvoree.Inicio();
	}

	/**
	 * 
	 */
	public static void Inicio() {

		Scanner ler = new Scanner(System.in);
		int tamanho;


        
		try {
            System.out.println("loading..");
            Thread.sleep(1000);
            System.out.println("Bem vindo ao Desafio da Árvore!");
            System.out.println();
            Thread.sleep(2000);
			System.out.println("Qual o tamanho da árvore?");
			tamanho = ler.nextInt();
            Thread.sleep(1000);
            System.out.println("loading...");
            Thread.sleep(1000);
			String j = "*";
			for (int i = 1; i <= tamanho; i++) {
				for (int k = i; k <= tamanho; k++) {

					System.out.print(" ");

				}
				System.out.println(j);
				j += "**";
			}

			
                for (int i = 0; i < 4; i++) {
				for (int k = 0; k <= tamanho - 3; k++) {

					System.out.print(" ");
				}
				System.out.println("*****");
			}
			for (int i = 0; i <= 1; i++) {
				for (int k = 0; k <= tamanho - 5; k++) {
					System.out.print(" ");
				}
				
			}
            Thread.sleep(4000);
            Inicio();
        }
        catch (Exception e){
            System.out.println(e);
			
		}
        ler.close();
      
    }
    
        

	}
    
