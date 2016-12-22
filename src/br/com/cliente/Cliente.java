package br.com.cliente;

import java.util.Date;


public class Cliente {
	
	private String nome;
	private Integer cpf;
	private Date dataNascimento;

	public Cliente(String nome,Integer cpf, Date dataNascimento ){
		this.nome=nome;
		this.cpf=cpf;
		this.dataNascimento=dataNascimento;
		
	}
	
	
	public String getNome(){
		return nome;
	}
	public Integer getCpf(){
		return cpf;
	}

	
	public void setNome(String nome){
		this.nome=nome;
	}
	public void setCpf(Integer cpf){
		this.cpf=cpf;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	
	

	

}
