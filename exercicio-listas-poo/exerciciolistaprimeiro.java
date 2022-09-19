

import javax.swing.JOptionPane; // funçao chama uma janela. sem precisar do scanner
public class exerciciolistaprimeiro {
    


/*O programa “bem-vindo” pergunta seu nome e sobrenome, e depois
gentilmente te cumprimenta.
- 1o etapa: perguntar o nome;
- 2o etapa: perguntar o sobrenome;
- 3o etapa: junta o nome com o sobrenome e forma uma frase.*/




	    public  void main(String[] args) {
	    	// inserir um nome.
	        String name = JOptionPane.showInputDialog("Digite o seu nome");
	     // insira um sobrenome.
	        String sobrenome = JOptionPane.showInputDialog("Digite o seu sobrenome");

	     // Está mostrando uma caixa de diálogo de mensagem com o nome e sobrenome.
	        JOptionPane.showMessageDialog(null, "Bem vindo(a) "+ name + " " + sobrenome);
	    }
	}
