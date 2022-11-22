package models;

import utils.Utils;

public class Periferico extends Produto{
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
