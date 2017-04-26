package br.pucrs.tp.negocio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import javax.swing.plaf.synth.SynthSeparatorUI;

import br.pucrs.tp.entidade.Smartphone;
import br.pucrs.tp.persistencia.Conexao;
import br.pucrs.tp.persistencia.SmartphonesDAOI;
import br.pucrs.tp.persistencia.impl.SmartphoneDAO;

public class Main {

	public static void main(String[] args) {


		System.out.println("TÉCNICAS DE PROGRAMAÇÃO - AULA 25/04/2017");
		
		System.out.println("Raffaela Monteiro - Matrícula 10204083-9");
		System.out.println("Joacir Júnior     - Matrícula 08103879-9\n\n");
		
		SmartphonesDAOI smartDAO = new SmartphoneDAO();
		
		// OBTEM A LISTA COMPLETA DE SMARTPHONES E EXIBE NO CONSOLE		
		List<Smartphone> listagem = smartDAO.buscarTodos();
		System.out.println("OBTEM A LISTA COMPLETA DE SMARTPHONES:");
		System.out.println("QTD DE SMARTPHONES = " + listagem.size()); 
		for(Smartphone smart : listagem){
			System.out.println("---> " + smart.toString());
		}
		
		// OBTEM O SMARTPHONE DE ID 1		
		Smartphone smartphone1 = smartDAO.buscarPorId(1);
		System.out.println("\n\nOBTEM O SMARTPHONE DE ID 1:");
		System.out.println("---> " + smartphone1.toString());
		
	}

}
