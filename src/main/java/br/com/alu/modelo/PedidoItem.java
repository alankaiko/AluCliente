package br.com.alu.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class PedidoItem {
	private Integer pedido_item_id;


	@Id
	public Integer getPedido_item_id() {
		return pedido_item_id;
	}

	public void setPedido_item_id(Integer pedido_item_id) {
		this.pedido_item_id = pedido_item_id;
	}

	

}
