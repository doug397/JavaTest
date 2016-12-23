package br.com.exemplosteste.conta;

import br.com.exemplosteste.pessoa.Pessoa;

public class ContaEspecial extends Conta {
	


	public ContaEspecial(int numero, Pessoa cliente) {
		super(numero, cliente);
		this.seteEspecial(true);
		
		
	}

	@Override
	public void saca(double valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deposita(double valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transferePara(Conta origem, Conta destino) {
		// TODO Auto-generated method stub
		
	}
	

	
	



	



}
