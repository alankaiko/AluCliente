package br.com.alu.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Pedido {
	@Id
	private Integer pedido_id;

	@Temporal(TemporalType.TIMESTAMP.DATE)
	private Date pedido_data;

	private String pedido_cliente;
	private char pedido_status;

	@Temporal(TemporalType.TIMESTAMP.DATE)
	private Date pedido_previsao_entrega;
	private String pedido_cliente_nome;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "empresa_id", referencedColumnName = "empresa_id", nullable = false)
	private Empresa empresa;

	@OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Pedido_Item> listapecas;

	public Pedido() {
		this.listapecas = new ArrayList<Pedido_Item>();
	}

	public Integer getPedido_id() {
		return pedido_id;
	}

	public void setPedido_id(Integer pedido_id) {
		this.pedido_id = pedido_id;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Date getPedido_data() {
		return pedido_data;
	}

	public void setPedido_data(Date pedido_data) {
		this.pedido_data = pedido_data;
	}

	public String getPedido_cliente() {
		return pedido_cliente;
	}

	public void setPedido_cliente(String pedido_cliente) {
		this.pedido_cliente = pedido_cliente;
	}

	public char getPedido_status() {
		return pedido_status;
	}

	public void setPedido_status(char pedido_status) {
		this.pedido_status = pedido_status;
	}

	public Date getPedido_previsao_entrega() {
		return pedido_previsao_entrega;
	}

	public void setPedido_previsao_entrega(Date pedido_previsao_entrega) {
		this.pedido_previsao_entrega = pedido_previsao_entrega;
	}

	public String getPedido_cliente_nome() {
		return pedido_cliente_nome;
	}

	public void setPedido_cliente_nome(String pedido_cliente_nome) {
		this.pedido_cliente_nome = pedido_cliente_nome;
	}

	public List<Pedido_Item> getListapecas() {
		return listapecas;
	}

	public void setListapecas(List<Pedido_Item> listapecas) {
		this.listapecas = listapecas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pedido_id == null) ? 0 : pedido_id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		if (pedido_id == null) {
			if (other.pedido_id != null)
				return false;
		} else if (!pedido_id.equals(other.pedido_id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pedido [pedido_id=" + pedido_id + ", pedido_data=" + pedido_data + ", pedido_cliente=" + pedido_cliente
				+ ", pedido_status=" + pedido_status + ", pedido_previsao_entrega=" + pedido_previsao_entrega
				+ ", pedido_cliente_nome=" + pedido_cliente_nome + ", empresa=" + empresa + ", listapecas=" + listapecas
				+ "]";
	}

}
