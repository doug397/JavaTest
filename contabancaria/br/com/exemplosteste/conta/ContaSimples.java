package br.com.exemplosteste.conta;

import br.com.exemplosteste.pessoa.Pessoa;

public class ContaSimples extends Conta {
	
	private final boolean ESPECIAL=false;

	public ContaSimples(int numero, Pessoa cliente) {
		super(numero, cliente);
		
	}


	public boolean isESPECIAL() {
		return ESPECIAL;
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
