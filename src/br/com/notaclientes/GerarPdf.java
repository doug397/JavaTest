package br.com.notaclientes;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;


import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.ColumnText;


public class GerarPdf {

	public static void main(String[] args) throws FileNotFoundException, DocumentException {
		// TODO Auto-generated method stub
		/*Definindo tamnho da pagina e suas margens*/
		Document doc = new Document(PageSize.A4,65,65,65,65);
		
		OutputStream os=null;
		
		/*Preparando para Receber Dados*/
		try{
			
		 os= new FileOutputStream("D:\\test.pdf");
		 PdfWriter.getInstance(doc, os);
		doc.open();
		
		System.out.println("Criado com Sucesso");
		
		
		/*Stilo de Fonte*/
	    Font f = new Font(FontFamily.COURIER, 20, Font.BOLD);
	    
	    /*Criando Titulo*/
	    Paragraph p = new Paragraph("Meu primeiro arquivo PDF!",f);
	    p.setAlignment(Element.ALIGN_CENTER);
	    p.setSpacingAfter(20);
	
	  
	    
	    /*Criando Paragrafo*/
	    Paragraph p2 = new Paragraph("Lista de Clientes Cadastrado");
	    /*espaçamento ou quebra linha*/
	    p2.setSpacingAfter(30);
	    
	    
	   /*Criando tabelas**/
	   
	   PdfPTable tabela= new  PdfPTable(4);
	   
	
	   PdfPCell header= new PdfPCell(new Paragraph("Lista de Clientes"));
	/*  header.setBackgroundColor(BaseColor.YELLOW);
	   header.setBorderWidthBottom(2.0f);
	   header.setBorderColorBottom(BaseColor.BLUE);
	   header.setBorder(Rectangle.BOTTOM);*/
	   header.setHorizontalAlignment(Element.ALIGN_CENTER);
	   
	   header.setColspan(4);  
	   tabela.addCell(header);
	  
	   
	   
	   
	   PdfPCell c1= new PdfPCell(new Phrase("Codigo"));
	   c1.setHorizontalAlignment(Element.ALIGN_LEFT);
	   c1.setBackgroundColor(BaseColor.YELLOW);
	   tabela.addCell(c1);
	   
	   
	   c1 = new PdfPCell(new Phrase("Nome"));
	   c1.setHorizontalAlignment(Element.ALIGN_LEFT);
	   c1.setBackgroundColor(BaseColor.YELLOW);
	   tabela.addCell(c1);
	   
	   c1 = new PdfPCell(new Phrase("Cpf"));
	   c1.setHorizontalAlignment(Element.ALIGN_LEFT);;
	   c1.setBackgroundColor(BaseColor.YELLOW);
	   tabela.addCell(c1);
	   
	   
	   c1 = new PdfPCell(new Phrase("Nascimento"));
	   c1.setHorizontalAlignment(Element.ALIGN_LEFT);
	   c1.setBackgroundColor(BaseColor.YELLOW);
	   tabela.addCell(c1);
	   
	   
	   
	   
	   
	   
	   
	   tabela.setHeaderRows(1);
	
	   
	   
	   
	   
	    tabela.addCell("Banana");
		tabela.addCell("Laranja");
		tabela.addCell("Abacate");
		tabela.addCell("LIZA");
		tabela.addCell("2.1");
		tabela.addCell("2.2");
	
		/*
		for (int i = 0; i < 10; i++) {
			tabela.addCell("Céclula" + i);
		}
*/
		
	
	
	   
	   tabela.setHorizontalAlignment(Element.ALIGN_CENTER);
	  
	   doc.add(p);
	   doc.add(p2);
	   doc.add(tabela);
	   


		
		}catch(FileNotFoundException f){
			System.out.println("Erro ao Criar");
			System.out.println("Erro :"+f.getMessage());
		}finally{
		
			doc.close();
			System.out.println("Fechado com Sucesso");
		}
			
		
	}

}
