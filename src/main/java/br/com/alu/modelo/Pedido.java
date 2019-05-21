package br.com.alu.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Pedido {
	private Integer pedido_id;
	private Integer empresa_id;
	private Integer cliente_id;
	private Date pedido_data;
	private String pedido_cliente;
	private char pedido_status;
	private Date pedido_previsao_entrega;
	private String pedido_cliente_nome;

	@Id
	public Integer getPedido_id() {
		return pedido_id;
	}

	public void setPedido_id(Integer pedido_id) {
		this.pedido_id = pedido_id;
	}

	public Integer getEmpresa_id() {
		return empresa_id;
	}

	public void setEmpresa_id(Integer empresa_id) {
		this.empresa_id = empresa_id;
	}

	public Integer getCliente_id() {
		return cliente_id;
	}

	public void setCliente_id(Integer cliente_id) {
		this.cliente_id = cliente_id;
	}

	@Temporal(TemporalType.TIMESTAMP.DATE)
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

	@Temporal(TemporalType.TIMESTAMP.DATE)
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

}
