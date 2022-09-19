
    package br.com.residencia.poo.aula01;

    import javax.swing.JOptionPane; // função do java similar ao scanner que chama uma janela.
public class exerciciolistaterceiro {

/*Crie o programa “mini calculadora”, que após ler dois números inteiros
apresenta as operações de soma, subtração, multiplicação e divisão com
eles.
Obs.: Trate o maior número possível de erros (ex: operações com números
negativos, divisão por zero, uso de letras, etc).*/



	
	    public static void main(String[] args) {
	    	// Está pedindo ao usuário para inserir um número.
	        String number1 = JOptionPane.showInputDialog("Digite um número");
	        String number2 = JOptionPane.showInputDialog("Digite outro número");

	     // É um bloco try catch. Ele está tentando analisar a entrada do usuário para um duplo. Se isso
	        // falha, mostrará uma mensagem de erro.
	        try {
	        	 // Está analisando a entrada do usuário para um duplo.
	            double num = Double.parseDouble(number1);   
	            double num2 = Double.parseDouble(number2);
	            // Está verificando se a entrada do usuário é menor que 0. Se for, mostrará uma mensagem de erro.
	            // Se não for, verificará se a entrada do usuário é 0. Se for, mostrará um erro
	            // mensagem. Se não for, ele fará as contas.
	            if (num < 0) {
	                JOptionPane.showMessageDialog(null, "Valor invalido");
	            }else if (num == 0 || num2 == 0){
	            	// se || = e
	                JOptionPane.showMessageDialog(null, "Impossível de dividir");
	            }else {
	                double sum = num + num2;
	                double sub = num - num2;
	                double mult = num * num2;
	                double divi = num / num2;
	    
	                JOptionPane.showMessageDialog(null, "Soma: " + sum + "\nSubstração: " + sub + "\nMultiplicação: " + mult + "\nDivisão: " + divi);
	            }
	        }catch(NumberFormatException ex){

	            JOptionPane.showMessageDialog(null,"São permitidos apenas números","Alerta",JOptionPane.ERROR_MESSAGE);
	        }
	    }
	}
}
