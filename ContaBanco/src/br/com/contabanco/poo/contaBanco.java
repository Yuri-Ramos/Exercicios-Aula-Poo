package br.com.contabanco.poo;

public class contaBanco {

	public static void main(String[] args) {
		//atributos
		public int numConta;
		protected String tipo;
		private String dono;
		private float saldo;
		private boolean status;
		//metodos abrirConta() fecharConta(), depositar(), sacar(), pagarMensal()
		
		public contaBanco(float s, boolean) {
			this.saldo=s;
			this.status=true;
		}
		public void setDono(String d){
			this.dono=d;
			
		}
		public String getDono() {
			return this.dono;
		}
		public float setSaldo(float s) {
			this.saldo = s;
			
		}
		public void getSaldo() {
			return this.saldo;
		}
		
		public void setStatus(boolean) {
			this.status= e;
		}
		public void getStatus() {
			return this.status;
		}
		
		public void setTipo(String t) {
			this.tipo= t;
		}
		public void getTipo() {
			return this.Tipo;
		}
		
		public void abrirConta() {
			setTipo(t);
			setStatus(true);
			if(t="CC") {
				saldo = 50;
			}else if (t="CP") {
				saldo = 150;
			}
			
		}
		public void fecharConta(){
			if( saldo >0) {
				System.out.println("conta com dinheiro");
						}
			else if( saldo <0) {
				System.out.println("conta em debito");
			}else {
				setStatus(false);
			}
		}
		public void depositar(float v) {
			if( status = true) {
				saldo += v;  // or setSaldo(getSaldo()+v); dá no mesmo.
			}else {
				System.out.println("impossivel depositar");
			}
		}
		public float sacar() {
			if( status =true) { //se getStatus()= true;
				if(saldo > v) {
					saldo = saldo -v;// ou setSaldo(getSaldo()- v);
				}else {
					System.out.println("saldo insulficiente");
				}
			}else {
				System.out.println("impossivel sacar");
			}
		}
		public void pagarMensal() {
			if(status=true) {
			if (tipo= "CC") {
				saldo-= 12;
			}else {
				saldo -= 20;
			}
			}else {
				System.out.println("conta inativa");
			}
		}
	}

}
