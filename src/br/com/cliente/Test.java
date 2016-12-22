package br.com.cliente;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.itextpdf.text.DocumentException;

import java.util.*;
import java.text.*;

import br.com.bancodados.ConexaoBD;

public class Test {

	public static void main(String[] args) throws ParseException {
		
		ConexaoBD postgre=new ConexaoBD();
		Connection conexao=postgre.conecta();
		GerarPdf pdf= new GerarPdf();
		
	Conta conta=new Conta(new Cliente("DodoLari",111,new Date("2000/01/16") ),true);
		
		
//postgre.insereDados(conexao, conta);
//	postgre.deletar(conexao);
	 
	List<Conta> contas=  postgre.listar(conexao);
	
	for(Conta contaLista : contas){
		System.out.println(contaLista.getN_conta()+": "+contaLista.getCliente().getNome());
		
	}
		
		try {
			pdf.imprimir(contas);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

	
	
	}

}
