package br.com.alu.bean;

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

	private Pedido pedido;
	private int codigoProjeto;
	
	
	public ConsultaBean() {
		this.pedido = new Pedido();
	}

	public void BuscarPorCodigo() {
		this.pedido = service.BuscarPorPedido(this.codigoProjeto);
		System.out.println(this.pedido.getPedido_id()+"f");
		System.out.println(this.pedido.getPedido_cliente()+"aff");
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public int getCodigoProjeto() {
		return codigoProjeto;
	}

	public void setCodigoProjeto(int codigoProjeto) {
		this.codigoProjeto = codigoProjeto;
	}
}
