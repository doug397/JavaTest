package br.com.testes;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import br.com.exemplosteste.pessoa.Pessoa;
import br.com.exemplosteste.pessoa.PessoaFisica;

public class Test {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Pessoa douglas= new PessoaFisica("Douglas", 21, new Date("11/11/2011") , "12345");
		
		douglas.mostraDados();
		
		
		
		
		
		

		
		
	}

}
