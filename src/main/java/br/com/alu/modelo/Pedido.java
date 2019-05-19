package br.com.alu.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pedido {
	@Id
	private int pedido_id;
	private String pedido_cliente;
	private String pedido_cliente_nome;

	public int getPedido_id() {
		return pedido_id;
	}

	public void setPedido_id(int pedido_id) {
		this.pedido_id = pedido_id;
	}

	public String getPedido_cliente() {
		return pedido_cliente;
	}

	public void setPedido_cliente(String pedido_cliente) {
		this.pedido_cliente = pedido_cliente;
	}

	public String getPedido_cliente_nome() {
		return pedido_cliente_nome;
	}

	public void setPedido_cliente_nome(String pedido_cliente_nome) {
		this.pedido_cliente_nome = pedido_cliente_nome;
	}

}
