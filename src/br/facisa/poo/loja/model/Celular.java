package br.facisa.poo.loja.model;

import br.facisa.poo.loja.util.Utils;

public class Celular extends Produto{

	public Celular(String nome, Double preco, String marca, String armazenamentoInterno, String memoriaRam) {
		super(nome, preco);
		this.marca = marca;
		this.armazenamentoInterno = armazenamentoInterno;
		this.memoriaRam = memoriaRam;
	}
	
	private String marca;
	private String armazenamentoInterno;
	private String memoriaRam;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getArmazenamentoInterno() {
		return armazenamentoInterno;
	}
	public void setArmazenamentoInterno(String armazenamentoInterno) {
		this.armazenamentoInterno = armazenamentoInterno;
	}
	public String getMemoriaRam() {
		return memoriaRam;
	}
	public void setMemoriaRam(String memoriaRam) {
		this.memoriaRam = memoriaRam;
	}
	
	@Override
	public String toString() {
		return "Id: " + this.getId() +	
				"\nNome: " + this.getNome() +
				"\nPreço: " + Utils.doubleToString(this.getPreco()) +
				"\nMarca: " + this.getMarca() +
				"\nArmazenamento Interno: " + this.getArmazenamentoInterno() + 
				"\nMemoria Ram: " + this.getMemoriaRam();
 	}
	
}
