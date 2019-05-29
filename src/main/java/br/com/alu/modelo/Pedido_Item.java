package br.com.alu.modelo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Pedido_Item {
	@Id
	private Integer pedido_item_id;
	
	@ManyToOne
	private Pedido pedido;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Produto produto;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Material material_id;

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

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Material getMaterial_id() {
		return material_id;
	}

	public void setMaterial_id(Material material_id) {
		this.material_id = material_id;
	}

}
