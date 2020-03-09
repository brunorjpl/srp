package br.edu.infnet.srp.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Patrimonio {

	@Id
	@GeneratedValue
	private Integer id;
	
	private String numero;
	
	private String descricao;
	
	private String local;
	
	public Patrimonio() {
	}

	public Patrimonio(String numero, String descricao, String local) {
		super();
		this.numero = numero;
		this.descricao = descricao;
		this.local = local;
	}

	public Patrimonio(Integer id, String numero, String descricao, String local) {
		super();
		this.id = id;
		this.numero = numero;
		this.descricao = descricao;
		this.local = local;
	}

	@Override
	public String toString() {
		return "Patrimonio [id=" + id + ", numero=" + numero + ", descricao=" + descricao + ", local=" + local + "]";
	}

	public Integer getId() {
		return id;
	}


	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}
	
}