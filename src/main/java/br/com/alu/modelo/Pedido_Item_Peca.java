package br.com.alu.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Pedido_Item_Peca {
	@Id
	private Integer pedido_item_peca_id;

	private Integer pedido_item_peca_numero;
	private Integer pedido_item_peca_und;

	@ManyToOne
	@JoinColumn(name = "pedido_item_id")
	private Pedido_Item pedido_item;

	public Integer getPedido_item_peca_id() {
		return pedido_item_peca_id;
	}

	public void setPedido_item_peca_id(Integer pedido_item_peca_id) {
		this.pedido_item_peca_id = pedido_item_peca_id;
	}

	public Integer getPedido_item_peca_numero() {
		return pedido_item_peca_numero;
	}

	public void setPedido_item_peca_numero(Integer pedido_item_peca_numero) {
		this.pedido_item_peca_numero = pedido_item_peca_numero;
	}

	public Integer getPedido_item_peca_und() {
		return pedido_item_peca_und;
	}

	public void setPedido_item_peca_und(Integer pedido_item_peca_und) {
		this.pedido_item_peca_und = pedido_item_peca_und;
	}

	public Pedido_Item getPedido_item() {
		return pedido_item;
	}

	public void setPedido_item(Pedido_Item pedido_item) {
		this.pedido_item = pedido_item;
	}

	@Override
	public String toString() {
		return "Pedido_Item_Peca [pedido_item_peca_id=" + pedido_item_peca_id + ", pedido_item_peca_numero="
				+ pedido_item_peca_numero + ", pedido_item_peca_und=" + pedido_item_peca_und + "]";
	}
	
	

}
