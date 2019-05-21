package br.com.alu.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import br.com.alu.modelo.Pedido;
import br.com.alu.service.PedidoService;

@Component
@Scope("view")
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
