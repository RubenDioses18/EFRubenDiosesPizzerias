package com.idat.EFRubenDiosesPizzeria.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pizzeria")
public class Pizzeria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_pizzeria;
	private String direccion;
	private String sede;
	
	
	public Pizzeria() {
		super();
	}
	public Integer getId_pizzeria() {
		return id_pizzeria;
	}
	public void setId_pizzeria(Integer id_pizzeria) {
		this.id_pizzeria = id_pizzeria;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getSede() {
		return sede;
	}
	public void setSede(String sede) {
		this.sede = sede;
	}
	
	

}
