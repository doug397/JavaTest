package br.com.locadora;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Locacao {
	private Cliente cliente;
	private List<Video> relacaoVideo= new ArrayList<Video>();
	private Date dataDevolucao;
	private boolean pago;
	
	
	private Locacao(Cliente cliente){
		this.cliente=cliente;
	}
	
	public static  Locacao para(Cliente cliente){
		return new Locacao(cliente);
	}
	
	public Locacao adicionar(Video... videos){
		for(Video vid: videos){
			relacaoVideo.add(vid);
		}
		
		return this;
	}
	
	public Locacao paraDevolver(Date data){
		dataDevolucao= data;
		return this;
	}
	
	public Locacao aPagar(){
		pago=false;
		return this;
	}
	
	public Locacao jaPago(){
		pago=true;
		return this;
	}
	
	
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public List<Video> getRelacaoVideo() {
		return relacaoVideo;
	}
	public void setRelacaoVideo(List<Video> relacaoVideo) {
		this.relacaoVideo = relacaoVideo;
	}
	public Date getDataDevolucao() {
		return dataDevolucao;
	}
	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	public boolean isPago() {
		return pago;
	}
	public void setPago(boolean pago) {
		this.pago = pago;
	}
	
	public String getTotal(){
		if(!pago){
			int valor= this.relacaoVideo.size()*2;
			return valor+ ",00";
		}else{
			return "0,00";
		}
	}

}
