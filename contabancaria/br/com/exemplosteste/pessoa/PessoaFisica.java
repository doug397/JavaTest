package br.com.exemplosteste.pessoa;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PessoaFisica extends Pessoa {
	
	private String cpf;
	
	public PessoaFisica(String nome, int idade, Date dataNascimento,String cpf) {
		super(nome, idade, dataNascimento);
		this.cpf=cpf;
		
	}

	
	public String getCpf() {
		return this.cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}




	@Override
	public void mostraDados() {
		
		System.out.println("Meus Dados");
		System.out.println("Nome: "+this.getNome());
		System.out.println("Idade:"+this.getIdade());
		System.out.println("Cpf: "+this.getCpf());
	    String data=this.toString();
		System.out.println("Data Nascimento: "+data);
		
		
	}
	
	

}
