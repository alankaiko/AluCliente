package br.com.alu.bean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import br.com.alu.modelo.Pedido;
import br.com.alu.service.PedidoService;

@Component
@Scope("session")
public class ConsultaBean {

	@Autowired
	private PedidoService service;

	private List<Pedido> listaTodos = new ArrayList<Pedido>();
	private Pedido pedido = new Pedido();

	@PostConstruct
	public void ListaInicial() {
		//this.listaTodos = service.ListarTodos();
		this.pedido = service.BuscarPorPedido(7011852);
		System.out.println(pedido.getPedido_cliente());
	}

	public PedidoService getService() {
		return service;
	}

	public void setService(PedidoService service) {
		this.service = service;
	}

	public List<Pedido> getListaTodos() {
		return listaTodos;
	}

	public void setListaTodos(List<Pedido> listaTodos) {
		this.listaTodos = listaTodos;
	}
	
	public Pedido getPedido() {
		return pedido;
	}
	
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

}
