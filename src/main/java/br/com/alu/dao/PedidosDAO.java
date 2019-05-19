package br.com.alu.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import br.com.alu.modelo.Pedido;

@Repository
public class PedidosDAO {

	@PersistenceContext
	private EntityManager gera;

	public List<Pedido> ListaGeral() {
		CriteriaQuery<Pedido> criteriaQuery = gera.getCriteriaBuilder().createQuery(Pedido.class);
		@SuppressWarnings("unused")
		Root<Pedido> root = criteriaQuery.from(Pedido.class);
		return gera.createQuery(criteriaQuery).getResultList();

	}

	public Pedido PedidoPorcodigo(Integer codigo) {
		System.out.println("numero = "+ codigo);
		return gera.find(Pedido.class, codigo);
	}

}
