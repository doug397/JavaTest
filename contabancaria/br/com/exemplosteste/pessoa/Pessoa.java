package br.com.exemplosteste.pessoa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Pessoa {
	
	private String nome;
	private int idade;
	private Date dataNascimento;
	
	
	public Pessoa(String nome,int idade, Date dataNascimento){
		this.idade=idade;
		this.nome=nome;
		this.dataNascimento=dataNascimento;
	}
	
	
	public void setNome(String nome){
		this.nome=nome;
	}
	
	public void setIdade(int idade){
		this.idade=idade;
	}
	
	public String getNome(){
		return this.nome;
	}
	public int getIdade(){
		return this.idade;
	}
	
	
	public Date getDataNascimento(){
		return this.dataNascimento;
	}
	
	public void setDataNascimento(Date dataNascimento){
		this.dataNascimento=dataNascimento;
	}
	
	
	
	@Override
	public String toString(){
		
		Date dataHoje = this.getDataNascimento();
		SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
		
		String data = formataData.format(dataHoje);

		return data;
	
	}
	
	
	/*Converte String em date*/
	public Date toDate(){
		SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
		Date dataEntrada = null;
		try { 
		    dataEntrada = formataData.parse("21/09/2010");
		} catch (ParseException ex) {
		    ex.printStackTrace();
		}
		System.out.println(dataEntrada);
		
		return dataEntrada;
		
	}
	
	
	
	public  abstract void mostraDados();
	
}
