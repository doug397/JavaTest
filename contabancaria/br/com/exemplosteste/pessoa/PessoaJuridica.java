package br.com.exemplosteste.pessoa;

import java.sql.Date;

public class PessoaJuridica extends Pessoa{
	private String cnpj;
	
	
	public PessoaJuridica(String nome, int idade, Date dataNascimento,String cnpj) {
		super(nome, idade, dataNascimento);
		this.cnpj=cnpj;
	}

	
	

	
	public void setCnpj(String cnpj){
		this.cnpj=cnpj;
	}
	
	public String getCnpj(){
		return this.cnpj;
	}

	@Override
	public void mostraDados() {

		System.out.println("Meus Dados");
		System.out.println("Nome: "+this.getNome());
		System.out.println("Idade:"+this.getIdade());
		System.out.println("Cnpj: "+this.getCnpj());
		
		 String data=this.toString();
		System.out.println("Data Nascimento: "+data);
			
		
	}

}
