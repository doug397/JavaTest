package br.com.locadora;

public class Video {
	private String nome;
	private String nomeOriginal;
	private String genero;
	private String elenco;
	private String sinopse;
	
	
	public Video(String nome){
		this.nome=nome;
		
	}
	public Video nomeOriginal(String nome){
		this.nomeOriginal=nome;
		return this;
	}
	
	public Video doGenero(String genero){
		this.genero=genero;
		return this;
	}
	
	public Video com(String elenco){
		this.elenco=elenco;
		return this;
	}
	
	public Video pequenoResumo(String resumo){
		this.sinopse=resumo;
		return this;
	}
			
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNomeOriginal() {
		return nomeOriginal;
	}
	public void setNomeOriginal(String nomeOriginal) {
		this.nomeOriginal = nomeOriginal;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getElenco() {
		return elenco;
	}
	public void setElenco(String elenco) {
		this.elenco = elenco;
	}
	public String getSinopse() {
		return sinopse;
	}
	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}
	
	

}
