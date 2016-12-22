package br.com.exemplosteste.conta;

import br.com.exemplosteste.pessoa.Pessoa;

public abstract class Conta {
		
	private int numero;
	private Pessoa cliente;
	private double saldo=0.0;
	
	
	
	public Conta(int numero,Pessoa cliente){
		this.setNumero(numero);
		this.setCliente(cliente);
		
	}
	


	public Pessoa getCliente() {
		return this.cliente;
	}



	public void setCliente(Pessoa cliente) {
		this.cliente = cliente;
	}
	
	

	public int getNumero() {
		return this.numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}




	public double getSaldo() {
		return saldo;
	}



	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	

	public abstract void mostraConta();
	
	
}
