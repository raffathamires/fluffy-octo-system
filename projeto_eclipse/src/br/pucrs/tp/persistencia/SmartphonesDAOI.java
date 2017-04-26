package br.pucrs.tp.persistencia;

import java.util.List;

import br.pucrs.tp.entidade.Smartphone;

public interface SmartphonesDAOI {
	
	public List<Smartphone> buscarTodos();
	public Smartphone buscarPorId(Integer id);	

}
