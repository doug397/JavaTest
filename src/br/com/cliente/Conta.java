package br.com.cliente;

public class Conta {
	
	private Integer n_conta;
	private Cliente cliente;
	private boolean eEspecial= false;
	
	public Conta(Cliente cliente,boolean eEspecial){
		this.cliente=cliente;
		this.seteEspecial(eEspecial);
		
	}
	public Conta(Integer n_conta,Cliente cliente,boolean eEspecial){
		this.n_conta=n_conta;
		this.cliente=cliente;
		this.seteEspecial(eEspecial);
		
	}

	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Integer getN_conta() {
		return n_conta;
	}


	public void setN_conta(Integer n_conta) {
		this.n_conta = n_conta;
	
	}
	public boolean iseEspecial() {
		return eEspecial;
	}
	public void seteEspecial(boolean eEspecial) {
		this.eEspecial = eEspecial;
	}
}
