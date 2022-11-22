package models;

import utils.Utils;

public class Notebook extends Produto{

	
	public Notebook(String nome, Double preco) {
		super(nome, preco);
	}
	
	private String marca;
	private String sistemaOperacional;
	private String memoriaRam;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getSistemaOperacional() {
		return sistemaOperacional;
	}
	public void setSistemaOperacional(String sistemaOperacional) {
		this.sistemaOperacional = sistemaOperacional;
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
		"\nSistema Operacional " + this.getSistemaOperacional() +
		"\nMemoria Ram: " + this.getMemoriaRam();
		
	}	
}
