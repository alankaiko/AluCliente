package br.com.alu.modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Pedido_Item {
	@Id
	private Integer pedido_item_id;

	@ManyToOne
	@JoinColumn(name = "pedido_id")
	private Pedido pedido;

	@OneToMany(mappedBy = "pedido_item", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Pedido_Item_Peca> listapecasunitaria;

	public Integer getPedido_item_id() {
		return pedido_item_id;
	}

	public void setPedido_item_id(Integer pedido_item_id) {
		this.pedido_item_id = pedido_item_id;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public List<Pedido_Item_Peca> getListapecasunitaria() {
		return listapecasunitaria;
	}

	public void setListapecasunitaria(List<Pedido_Item_Peca> listapecasunitaria) {
		this.listapecasunitaria = listapecasunitaria;
	}

	@Override
	public String toString() {
		return "Pedido_Item [pedido_item_id=" + pedido_item_id + ", listapecasunitaria=" + listapecasunitaria + "]";
	}

	
}
