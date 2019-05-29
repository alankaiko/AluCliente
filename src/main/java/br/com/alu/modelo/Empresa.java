package br.com.alu.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Empresa {
	@Id
	private Integer empresa_id;
	private String empresa_nome;

	public Integer getEmpresa_id() {
		return empresa_id;
	}

	public void setEmpresa_id(Integer empresa_id) {
		this.empresa_id = empresa_id;
	}

	public String getEmpresa_nome() {
		return empresa_nome;
	}

	public void setEmpresa_nome(String empresa_nome) {
		this.empresa_nome = empresa_nome;
	}

}
