package aula05;

public class ContaBanco {
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	// metodos personalizados
	
	public void abrirConta() {
		
	}
	public void fecharConta() {
		
	}
	public void depositar() {
		
	}
	public void sacar() {
		
	}
	public void pagarMensal() {
		
	}
	// metodos especials
	public ContaBanco() {
		this.saldo =0;
		this.status =false;
	}
	public void setNumConta(int n) {
		this.numConta= n;
		
	}
	public int getNumConta() {
		return this.numConta;
	}
	
	public void setDono(String dono) {
		this.dono=dono;
	}
	public String gtDono() {
		return this.dono;
	}
	public void setTipo(String tipo) {
		this.tipo= tipo;
	}	
	public String getTipo() {
		return thtipo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public float getSaldo() {
		return saldo;
	}
	public boolean isStatus(){
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	
}
