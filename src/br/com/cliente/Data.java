package br.com.cliente;

public class Data {
		
	private byte dia;
	private byte mes;
	private int ano;
	
	
	
	public Data(byte dia,byte mes, int ano){
		this.dia=dia;
		this.mes=mes;
		this.ano=ano;
	}
	
	
	public boolean validaData(){
		if( (dia<31 && dia>0) || (mes>0 && mes<31) ){
			return true;
		}else{
			return false;
		}
		
	}
	
	public void inicializaData(byte dia,byte mes, int ano){
		
		this.dia=0;
		this.mes=0;
		this.mes=0;
		
	}
	
	
	
	public byte getDia(){
		return dia;
	}
	public byte getMes(){
		return mes;
	}
	public int getAno(){
		
		return ano;
	}
	public void setDia(byte dia){
		this.dia=dia;
	}
	public void setMes(byte mes){
		this.mes=mes;
		
	}
	public void setAno(int ano){
		this.ano=ano;
	}
}
