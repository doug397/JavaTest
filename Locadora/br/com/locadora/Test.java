package br.com.locadora;
import static br.com.locadora.DataUtil.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cliente=new Cliente("Douglasd de Jesus Fosneca","123456");
		
		Locacao locacao= Locacao.para(cliente);
		
		Video vingadores= new Video("Os Vingadores");
		
		vingadores.nomeOriginal("Os Vingadores").
		com("Homem de Ferro , Thor e CIA")
		.doGenero("Aventura")
		.pequenoResumo("Guerreiros e Heroes Da Marvel");
		
		
		
		locacao.adicionar(vingadores).paraDevolver(daquiA(TRES_DIAS))
		.aPagar();
		GerenciadorLocador.imprimir(locacao);
		
	
	}

}
