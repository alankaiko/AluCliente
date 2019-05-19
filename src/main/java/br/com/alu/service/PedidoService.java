package br.com.alu.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.alu.dao.PedidosDAO;
import br.com.alu.modelo.Pedido;

@Service
public class PedidoService {
	@Autowired
	private PedidosDAO dao;

	@Transactional
	public List<Pedido> ListarTodos() {
		return dao.ListaGeral();
	}

	@Transactional
	public Pedido BuscarPorPedido(Integer codigo) {
		return dao.PedidoPorcodigo(codigo);
	}
}
