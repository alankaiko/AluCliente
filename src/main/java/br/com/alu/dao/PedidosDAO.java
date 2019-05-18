package br.com.alu.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.alu.modelo.Pedido;

@Repository
public class PedidosDAO {

	@PersistenceContext
	private EntityManager gera;

	@SuppressWarnings("unchecked")
	public List<Pedido> ListaGeral() {
		return this.gera.createQuery("SELECT * FROM pedido").getResultList();

	}

	public Pedido PedidoPorcodigo(Integer codigo) {
		return this.gera.find(Pedido.class, codigo);
	}

}
