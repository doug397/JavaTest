package br.com.cliente;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

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

	public void imprimir(List<Conta> contas) throws FileNotFoundException, DocumentException {
		// TODO Auto-generated method stub
		/*Definindo tamnho da pagina e suas margens*/
		Document doc = new Document(PageSize.A4,20,10,10,10);
		OutputStream os=null;
		
		/*Preparando para Receber Dados*/
		try{
			
		 os= new FileOutputStream("E:\\DOUGLAS CURSOS\\Cursos E Projetos\\Analise e Desenvolvimento de Sistemas (DROPBOX)\\JAVA\\workspace\\JavaTest\\Clientes.pdf");
		 PdfWriter.getInstance(doc, os);
		doc.open();
		
		System.out.println("Criado com Sucesso");
		
		
		/*Stilo de Fonte*/
	    Font f = new Font(FontFamily.COURIER, 20, Font.BOLD);
	    
	    Font fT= new Font(FontFamily.TIMES_ROMAN,13,Font.BOLD);
	    
	    /*Criando Titulo*/
	    Paragraph p = new Paragraph("Meu primeiro arquivo PDF!",f);
	    p.setAlignment(Element.ALIGN_CENTER);
	    p.setSpacingAfter(20);
	
	  
	    
	    /*Criando Paragrafo*/
	    Paragraph p2 = new Paragraph("Lista de Clientes Cadastrado");
	    /*espaçamento ou quebra linha*/
	    p2.setSpacingAfter(30);
	    
	    
	   /*Criando tabelas**/
	   
	   PdfPTable tabela= new  PdfPTable(5);
	  
	
	   PdfPCell header= new PdfPCell(new Paragraph("Lista de Clientes"));
	 header.setBackgroundColor(BaseColor.YELLOW);
/*	   header.setBorderWidthBottom(2.0f);
	   header.setBorderColorBottom(BaseColor.BLUE);
	   header.setBorder(Rectangle.BOTTOM);*/
	   header.setHorizontalAlignment(Element.ALIGN_CENTER);
	   
	   header.setColspan(5);  
	   tabela.addCell(header);
	  
	   
	   
	   
	   PdfPCell c1= new PdfPCell(new Phrase("Codigo",fT));
	   c1.setHorizontalAlignment(Element.ALIGN_LEFT);
	   c1.setBackgroundColor(BaseColor.YELLOW);
	   tabela.addCell(c1);
	   
	   
	   c1 = new PdfPCell(new Phrase("Nome",fT));
	   c1.setHorizontalAlignment(Element.ALIGN_LEFT);
	   c1.setBackgroundColor(BaseColor.YELLOW);
	   tabela.addCell(c1);
	   
	   c1 = new PdfPCell(new Phrase("Cpf",fT));
	   c1.setHorizontalAlignment(Element.ALIGN_LEFT);;
	   c1.setBackgroundColor(BaseColor.YELLOW);
	   tabela.addCell(c1);
	   
	   
	   c1 = new PdfPCell(new Phrase("Nascimento",fT));
	   c1.setHorizontalAlignment(Element.ALIGN_LEFT);
	   c1.setBackgroundColor(BaseColor.YELLOW);
	   tabela.addCell(c1);
	   
	   c1 = new PdfPCell(new Phrase("Conta Especial",fT));
	   c1.setHorizontalAlignment(Element.ALIGN_LEFT);
	   c1.setBackgroundColor(BaseColor.YELLOW);
	   tabela.addCell(c1);
	   
	   
	   
	   
	   
	   
	   
	   
	  tabela.setHeaderRows(1);
	
	   
	   
	 /*  
	   
	    tabela.addCell("Banana");
		tabela.addCell("Laranja");
		tabela.addCell("Abacate");
		tabela.addCell("LIZA");
		tabela.addCell("2.1");
		tabela.addCell("2.2");
	*/
		/*Atribuindo Valores Automaticos*/
	/*	for (int i = 0; i < 10; i++) {
			tabela.addCell("Céclula" + i);
		}
*/
		
	   for(Conta conta:contas){
		   tabela.addCell(conta.getN_conta().toString());
		   tabela.addCell(conta.getCliente().getNome());	   
		   tabela.addCell(conta.getCliente().getCpf().toString());
		   tabela.addCell(conta.getCliente().getDataNascimento().toString());
		
		   boolean tipo;
		   if(tipo= conta.iseEspecial()==true){
			   tabela.addCell("SIM");
		   }else{
			   tabela.addCell("NÃO");
		   }
		   
	   }
	
	
	   
	   tabela.setHorizontalAlignment(Element.ALIGN_LEFT);
	  
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
