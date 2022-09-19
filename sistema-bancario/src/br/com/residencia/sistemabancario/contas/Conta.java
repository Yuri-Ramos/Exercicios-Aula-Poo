package br.com.residencia.sistemabancario.contas;


public class Conta {


		public int numero;
		public String titular;
		public double saldo;

		// ACOES DA CONTA

		// metodo de saque sem tratamento
//		public void sacar(double valor) {
		// double novoSaldo = this.saldo - valor;
		// this.saldo = novoSaldo;
		// }

		public boolean sacar(double valor) {
			if (this.saldo < valor) {
				System.out.println("SALDO INSUFICIENTE!");
				return false;
			} else {
				double novoSaldo = this.saldo - valor;
				this.saldo = novoSaldo;
				return true;
			}
		}

		// metodo para efetuar um deposito
		// public void depositar(double valor) {
		// double novoSALDO = this.saldo + valor;
		// this.saldo = novoSaldo;
		// this.saldo += valor;

		// metodo para efetuar um depositco com tratamento

		public boolean depositar(double valor) {
			if (valor < 0) {
				System.out.println("Valor invalido");
				return false;
			} else {
				this.saldo += valor;
				return true;
			}
		}

		public boolean transferir(double valor, Conta mConta) {
			
			if (this.saldo < valor) {
				System.out.println("Saldo Invalido! Valor do saldo é [" + saldo + "]");

				return false;
			} else {
				this.saldo = this.saldo - valor;
				// this.saldo -= valor;

				mConta.depositar(valor);
				System.out.println("transferencia com sucesso!");
				
				return true;
			}
			}
		

	}






	//public -> publico
	//-> a partir da mesma classe
	//-> qualquer classe do mesmo pacote
	//-> qualquer classe filha no mesmo pacote
	//-> qualquer classe filha em pacote diferente
	//-> qualquer classe em pacote diferente

	//protected -> protegido
	//->a partir da mesma classe
	//-> qualquer classe do mesmo pacote
	//-> qualquer classe filha no mesmo pacote
	//-> qualquer classe filha em pacote diferente

	//default -> padrao
	//-> a partir da mesma classe
	//-> qualquer classe do mesmo pacote
	//-> qualquer classe filha no mesmo pacote

	//private -> privado
	//->a partir da mesma classe