package com.senai.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Product")
public class Product {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NotNull
	private String brand;
	@NotNull
	private String madein;
	@NotNull
	private float price;
	@NotNull
	private String nome;
	
	protected void Product () {}
	protected void Product (int id, String brand, String madein, float price, String nome) {
		this.id = id;
		this.brand = brand;
		this.madein = madein;
		this.price = price;
		this.nome = nome;
				
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getMadein() {
		return madein;
	}
	public void setMadein(String madein) {
		this.madein = madein;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
