package br.com.alu.dao;

import java.util.List;

public interface DAOGenerico<T> {
	public List<T> Listar();
	public List<T> ListaPorNumero(Integer numero);
}
