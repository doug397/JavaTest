package br.com.locadora;


public class GerenciadorLocador {
	
	public static void imprimir(Locacao suaLocacao){
		
		System.out.println("Nome: " +
				suaLocacao.getCliente().getNome());
		
		
		for(Video mv: suaLocacao.getRelacaoVideo()){
			System.out.println(mv.getNome()+" - "+ mv.getGenero());
		}
		
		System.out.println("Total : R$" +suaLocacao.getTotal());
		System.out.println("Devolver em "+ suaLocacao.getDataDevolucao());
		System.out.println("Assinatura:________________________");
	
		
	}
			
			
			
}
