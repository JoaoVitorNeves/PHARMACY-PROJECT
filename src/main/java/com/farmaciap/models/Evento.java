package com.farmaciap.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "evento")
public class Evento {
	@Id
	private long cns;

	private String nome_completo;
	private String telefone; 
	private String medicamentos;
	private String qnt_med;
	private String ultima_retirada;
	public long getCns() {
		return cns;
	}
	public void setCns(long cns) {
		this.cns = cns;
	}
	public String getNome_completo() {
		return nome_completo;
	}
	public void setNome_completo(String nome_completo) {
		this.nome_completo = nome_completo;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getMedicamentos() {
		return medicamentos;
	}
	public void setMedicamentos(String medicamentos) {
		this.medicamentos = medicamentos;
	}
	public String getQnt_med() {
		return qnt_med;
	}
	public void setQnt_med(String qnt_med) {
		this.qnt_med = qnt_med;
	}
	public String getUltima_retirada() {
		return ultima_retirada;
	}
	public void setUltima_retirada(String ultima_retirada) {
		this.ultima_retirada = ultima_retirada;
	}
	
	
}
