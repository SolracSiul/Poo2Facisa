package br.facisa.poo.loja.model;

import br.facisa.poo.loja.util.Utils;

public class Periferico extends Produto{
	
	public Periferico(String nome, Double preco, String marca) {
		super(nome, preco);
		this.marca = marca;
	}
	public Periferico(String nome, Double preco) {
		super(nome, preco);
	}
	private String marca;

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	@Override
	public String toString() {
		return "Id: " + this.getId() +	
				"\nNome: " + this.getNome() +
				"\nPreço: " + Utils.doubleToString(this.getPreco()) +
				"\nMarca: " + this.getMarca();
				
	}
}
