package br.com.exemplosteste.conta;

import br.com.exemplosteste.pessoa.Pessoa;

public abstract class Conta {
		
	private int numero;
	private Pessoa cliente;
	private double saldo=0.0;
	private boolean eEspecial= false;
	
	
	
	public boolean iseEspecial() {
		return eEspecial;
	}



	public void seteEspecial(boolean eEspecial) {
		this.eEspecial = eEspecial;
	}



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
	

	public void mostraConta() {
		System.out.println("Minha Conta");
		System.out.println("Numero:"+ this.getNumero());
		System.out.println("Cliente:" +this.getCliente().getNome());
		System.out.println("Idade:"+this.getCliente().getIdade());
		System.out.println("Saldo:R$"+this.getSaldo()+"0");
		System.out.println("Conta Especial:"+this.iseEspecial());
	
		
	}
	
}
