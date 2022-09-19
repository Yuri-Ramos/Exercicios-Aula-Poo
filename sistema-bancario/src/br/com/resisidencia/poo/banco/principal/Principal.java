package br.com.resisidencia.poo.banco.principal;

	
	import br.com.poo.sistemabancario.contas.Conta;

	public class Principal {

		

			public static void main(String[] args) {
				Conta minhaConta = new Conta();
				minhaConta.titular = "Rafael";
				minhaConta.saldo = 1000.0;
				minhaConta.numero = 1111;
				minhaConta.sacar(0.0);
				minhaConta.depositar(0);
				
				Conta minhaContaDois = new Conta();
				minhaContaDois.titular = "Ana";
				minhaContaDois.saldo = 1000.0;
				minhaContaDois.numero = 2222;
				minhaContaDois.sacar(0.0);
				minhaContaDois.depositar(0);
				
				Conta minhaContaTres = new Conta();
				minhaContaTres.titular = "Juca";
				minhaContaTres.saldo = 1000.0;
				minhaContaTres.numero = 3333;
				minhaContaTres.sacar(0.0);
				minhaContaTres.depositar(0);
				
				//Transferências
				minhaConta.transferir(0,minhaContaDois);
				minhaContaDois.transferir(0, minhaConta);
				minhaContaTres.transferir(100, minhaConta);
				minhaContaTres.transferir(100, minhaContaDois);
				
				System.out.print("\n");
				System.out.println("Saldo atual: [" + minhaConta.saldo + "]");
				System.out.println("Nome do titular: [" + minhaConta.titular + "]");
				System.out.println("Número da conta: [" + minhaConta.numero + "]");
				System.out.print("\n");
				
				System.out.println("Saldo atual: [" + minhaContaDois.saldo + "]");
				System.out.println("Nome do titular: [" + minhaContaDois.titular + "]");
				System.out.println("Número da conta: [" + minhaContaDois.numero + "]");
				System.out.print("\n");
				
				System.out.println("Saldo atual: [" + minhaContaTres.saldo + "]");
				System.out.println("Nome do titular: [" + minhaContaTres.titular + "]");
				System.out.println("Número da conta: [" + minhaContaTres.numero + "]");
				System.out.print("\n");
				
				
			}

		}