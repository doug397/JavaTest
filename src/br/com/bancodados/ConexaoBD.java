package br.com.bancodados;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import br.com.cliente.Cliente;
import br.com.cliente.Conta;
import java.util.Date.*;

public class ConexaoBD {

	PreparedStatement stm=null;
	Connection conex=null;
	
	public Connection conecta(){
		String url="jdbc:postgresql://localhost/java";
		String login="postgres";
		String senha="root";
		
		try{
			
			
			 conex=DriverManager.getConnection(url,login,senha);
			 System.out.println("Conectou ");
			// insereDados(conex, conta);
			
		}catch(SQLException e){
			System.out.println("Erro: "+e.getMessage());
			
		}
		return conex;
	 }
	
	/* Funçao InsereDados No Sistema*/
		public void insereDados(Connection conex,Conta conta){
				
			try{
				String isEspecial="V";
				
				String sql="insert into cliente(nome,cpf,dataNascimento,eEspecial)"
						+ "values(?,?,?,?)";
				
				 stm=conex.prepareStatement(sql);
				
				stm.setString(1,conta.getCliente().getNome());
				stm.setInt(2,conta.getCliente().getCpf());
				stm.setDate(3, new Date(conta.getCliente().getDataNascimento().getTime()));
				stm.setBoolean(4,conta.iseEspecial());
				
				
			
			        

				stm.executeUpdate();
				
				System.out.println("Inserido com Sucesso");
			
				
				
			}catch(SQLException e){
				System.out.println("ERro ao inserir: "+e.getMessage());
			}finally{
				/*
				try{
					stm.close();
					System.out.println("")
					
				}catch(SQLException ex){
					System.out.println("ERRO AO FECHAR BANCO: "e.getMessage());
				}*/
			}
			
			
			
		}
		
		
		/*Litar Contas*/
		
		public List<Conta> listar(Connection conex){
				
			List<Conta> lista= new ArrayList<>();
			
			String sql="select n_conta, nome,cpf,dataNascimento,eEspecial from cliente";
			try{
				 stm=conex.prepareStatement(sql);
				 ResultSet resultado=stm.executeQuery();
					 
					 while(resultado.next()){
						 
						 
						 lista.add(new Conta(resultado.getInt(1),new Cliente(resultado.getString(2), resultado.getInt(3),resultado.getDate(4)),
								 resultado.getBoolean(5)));
						 
					 }
				 
				 
			}catch(SQLException exs){
				System.out.println("Erro em Listar Dados: "+exs.getMessage());
				
			}
			 
			
			return lista;
		}
		
		
		/*Deletar toda a Tabela*/
		public void deletar(Connection conex){
			String sql="delete from cliente";
		
			try{
				stm=conex.prepareStatement(sql);
				
				stm.executeQuery();
			}catch(SQLException ex){
				System.out.println("ERRO: " +ex.getMessage());
			}
			
		}
}
