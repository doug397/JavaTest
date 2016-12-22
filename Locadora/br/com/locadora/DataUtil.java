package br.com.locadora;

import java.util.Date;

public class DataUtil {
	
	public static final int UM_DIA= 1;
	public static final int DOIS_DIAS=2;
	public static final int TRES_DIAS=3;
	public static final int QUATRO_DIAS=4;
	
	public static Date daquiA(int dataMs){
		dataMs= new Date().getDate() +dataMs;
		Date data= new Date();
		
		data.setDate(dataMs);
		
		return data;
		
		
	}
	
}
