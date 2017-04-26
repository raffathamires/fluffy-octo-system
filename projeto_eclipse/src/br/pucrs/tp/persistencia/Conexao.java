package br.pucrs.tp.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.sql.DataSource;
import org.apache.derby.jdbc.EmbeddedDataSource;

public class Conexao {

	public static String DB_CONN_STRING_CREATE = "jdbc:derby:MyDB;create=true";
	// public static String DB_CONN_STRING_CREATE = "jdbc:derby:C:\\Users\\08103879\\MyDB;create=true";
    public static String DB_NAME = "MyDB";
    public static String USER_NAME = "admin";
    public static String PASSWORD = "12345";
    private static DataSource dataSource;	
    
    public static Connection getConexaoViaDriverManager() throws Exception {
        return DriverManager.getConnection(DB_CONN_STRING_CREATE, USER_NAME, PASSWORD);
    }
	
}
