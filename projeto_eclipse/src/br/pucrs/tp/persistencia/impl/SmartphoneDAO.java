package br.pucrs.tp.persistencia.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.pucrs.tp.entidade.Smartphone;
import br.pucrs.tp.persistencia.Conexao;
import br.pucrs.tp.persistencia.SmartphonesDAOI; 

public class SmartphoneDAO implements SmartphonesDAOI {

	public static String SQL_BUSCAR_TODOS = "SELECT id, name, description, "
												+ " image, value "
			 							   + " FROM app.smartphones";
	
	public static String SQL_BUSCAR_POR_ID = "SELECT id, name, description, image, value "
											+ " FROM app.smartphones "
										   + " WHERE id = ? ";
	
	@Override
	public List<Smartphone> buscarTodos() {

		List<Smartphone> listagem = new ArrayList<>();
		Conexao con = new Conexao();		

		try (Connection conexao = con.getConexaoViaDriverManager()) {
            
            try (PreparedStatement comando = conexao.prepareStatement(SQL_BUSCAR_TODOS)) {
                try (ResultSet resultados = comando.executeQuery()) {
                    while (resultados.next()) {
                    	
                    	Smartphone smart = new Smartphone( resultados.getInt("id"),
									                       resultados.getString("name"), 
									                       resultados.getString("description"),
									    				   resultados.getString("image"),
									    				   resultados.getDouble("value") );
                        // System.out.println(smart.toString());
                        
                        listagem.add(smart);
                        
                    }
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
		
		return listagem;
		
	} // fim do buscarTodos()

	@Override
	public Smartphone buscarPorId(Integer chave) {

		Smartphone smart = null;
		Conexao con = new Conexao();		

		try (Connection conexao = con.getConexaoViaDriverManager()) {
            
            try (PreparedStatement comando = conexao.prepareStatement(SQL_BUSCAR_POR_ID)) {
            	comando.setInt(1, chave);
                try (ResultSet resultados = comando.executeQuery()) {
                    while (resultados.next()) {
                    	
                    	smart = new Smartphone( resultados.getInt("id"),
									            resultados.getString("name"), 
									            resultados.getString("description"),
									    		resultados.getString("image"),
									    		resultados.getDouble("value") );
                    	
                        // System.out.println(smart.toString());
                        
                    }
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
		
		return smart;
		
	} // fim do buscarPorId()

}
