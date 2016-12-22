package br.com.exemplosteste.conta;

public interface ContaCorrente {
	
	void saca(double valor);
	void deposita(double valor);
	void transferePara(Conta origem, Conta destino);

}
