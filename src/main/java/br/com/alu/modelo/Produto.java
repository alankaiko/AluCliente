package br.com.alu.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Produto {
	@Id
	private Integer produto_id;
}
