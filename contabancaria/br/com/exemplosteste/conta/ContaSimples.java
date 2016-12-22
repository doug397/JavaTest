package br.com.exemplosteste.conta;

import br.com.exemplosteste.pessoa.Pessoa;

public class ContaSimples extends Conta implements ContaCorrente{
	
	private final boolean ESPECIAL=false;

	public ContaSimples(int numero, Pessoa cliente) {
		super(numero, cliente);
		
	}


	public boolean isESPECIAL() {
		return ESPECIAL;
	}

	@Override
	public void mostraConta() {
		System.out.println("Minha Conta");
		System.out.println("Numero:"+ this.getNumero());
		System.out.println("Cliente:" +this.getCliente().getNome());
		System.out.println("Idade:"+this.getCliente().getIdade());
		System.out.println("Saldo:R$"+this.getSaldo()+"0");
		System.out.println("Conta Especial:"+this.isESPECIAL());
	
		
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
