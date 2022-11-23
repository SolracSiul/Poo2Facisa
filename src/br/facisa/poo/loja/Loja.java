package br.facisa.poo.loja;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


import br.facisa.poo.loja.model.Celular;
import br.facisa.poo.loja.model.Notebook;
import br.facisa.poo.loja.model.Periferico;
import br.facisa.poo.loja.model.Produto;
import br.facisa.poo.loja.util.Utils;

public class Loja {
	private static ArrayList<Produto> produtos;
	private static Map<Produto, Integer> carrinho;
	
	public static void main(String[] args) {
		produtos = new ArrayList<>();
		carrinho = new HashMap<>();
		menu();
	}
	private static void menu() {
		int opcao = 0;
		System.out.println("----------------------------------");
		System.out.println("----------Loja do Luis--------");
		System.out.println("----------------------------------");
		System.out.println("---- Selecione uma operação ----");
		System.out.println("----------------------------------");
		System.out.println("| Opção 1 - Cadastrar |");
		System.out.println("| Opção 2 - Listar |");
		System.out.println("| Opção 3 - Comprar |");
		System.out.println("| Opção 4 - Carrinho |");
		System.out.println("| Opção 5 - Sair |");
		
		try {
			opcao = Utils.leInt();
		}catch(NumberFormatException e) {
			System.out.println("Por favor, informe uma opção válida.");
			Utils.pausar(1);
			menu();
		}
		
		switch(opcao) {
			case 1:
				cadastrarProdutos();
				break;
			case 2:
				listarProdutos();
				break;
			case 3:
				comprarProdutos();
				break;
			case 4:
				verCarrinho();
				break;
			case 5:
				System.out.println("Volte sempre");
				System.exit(0);
			default:
				System.out.println("Opção Inválida!");
				menu();
				break;
				
		}
	}
	private static void cadastrarProdutos() {
		System.out.println("Informe o tipo do produto: ");
		System.out.println("| Opção 1 - Celular |");
		System.out.println("| Opção 2 - Computador |");
		System.out.println("| Opção 3 - Periferico |");
		System.out.println("| Opção 4 - Generico |");
		int tipoProduto = Utils.leInt();
			
		if(tipoProduto == 1) {
			System.out.println("Cadastrando um celular");
				System.out.println("Nome do produto: ");
				String nome = Utils.leString();
			
				System.out.println("Preço do produto: ");
				Double preco = Utils.leDouble();
				
				System.out.println("Marca do produto: ");
				String marca = Utils.leString();
				
				System.out.println("Armazenamento Interno do produto: ");
				String armazenamentoInterno = Utils.leString();
				
				System.out.println("Memoria Ram do produto: ");
				String memoriaRam = Utils.leString();
				
				Produto produto = new Celular(nome, preco, marca, armazenamentoInterno, memoriaRam);
				produtos.add(produto);
				System.out.println(produto);
				Utils.pausar(1);
				
			}else if(tipoProduto == 2) {
				System.out.println("Cadastrando um computador");
				
				System.out.println("Nome do produto: ");
				String nome = Utils.leString();
			
				System.out.println("Preço do produto: ");
				Double preco = Utils.leDouble();
				
				System.out.println("Marca do produto: ");
				String marca = Utils.leString();
				
				System.out.println("Sistema operacional do produto: ");
				String sistemaOperacional = Utils.leString();
				
				System.out.println("Memória ram do produto: ");
				String memoriaRam = Utils.leString();
				
				Produto produto = new Notebook(nome, preco, marca, sistemaOperacional, memoriaRam);
				produtos.add(produto);
				System.out.println(produto);
				Utils.pausar(1);
				
			}else if(tipoProduto == 3) {
				System.out.println("Cadastrando um periferico");
				System.out.println("Nome do produto: ");
				String nome = Utils.leString();
			
				System.out.println("Preço do produto: ");
				Double preco = Utils.leDouble();
				
				System.out.println("Marca do produto: ");
				String marca = Utils.leString();
				
				Produto produto = new Periferico(nome, preco, marca);
				produtos.add(produto);
				System.out.println(produto);
				Utils.pausar(1);
				
			}else if(tipoProduto == 4) {
				System.out.println("Cadastrando um tipo genérico");
	
				System.out.println("Nome do produto: ");
				String nome = Utils.leString();
				
				System.out.println("Preço do produto: ");
				Double preco = Utils.leDouble();
				
				Produto produto = new Produto(nome, preco);
				produtos.add(produto);
				System.out.println(produto);
			}else {
				System.out.println("Opção Inválida. Tente novamente");
				cadastrarProdutos();
			}
		Utils.pausar(2);
		menu();
	}
	private static void listarProdutos() {
		if(produtos.size() > 0) {
			System.out.println("Lista de produtos: \n");
			for(Produto p : produtos) {
				System.out.println(p);
			}
		}else {
			System.out.println("Nenhum produto cadastrado");
		}
		Utils.pausar(5);
		menu();
	}
	private static void comprarProdutos(){
		if(produtos.size() > 0) {
			System.out.println("Lista de produtos: \n");	
			for(Produto p: produtos) {
				System.out.println(p);
			}
			System.out.println("Informe o ID do produto que você deseja: ");
			int id = Utils.leInt();
			boolean isPresent = false;
				for (Produto p: produtos) {
					if(p.getId() == id) {
						int qtd = 0;
						try {
							qtd = carrinho.get(p);
							carrinho.put(p, qtd +1);
						}catch(NullPointerException e){
							carrinho.put(p,  1);
						}
					System.out.println(p.getNome() + " adicionado ao carrinho");
					isPresent = true;
					if(isPresent) {
							System.out.println("Quer adicionar outro produto ? ");
							System.out.println("Digite 1 para sim, ou 0 para finalizar a compra ? \n");
						int opcao = Utils.leInt();
							if(opcao == 1) {
								comprarProdutos();
							}else {
								finalizarCompra();
						}
					}
				}else {
					System.out.println("Produto não encontrado");
					Utils.pausar(2);
					menu();
				}
			}
		}else {
			System.out.println("Não existem produtos cadastrados!");
			Utils.pausar(2);
			menu();
		}
	}
	private static void verCarrinho() {
		System.out.println("---Produs no seu carrinho: ---");
		if(carrinho.size() > 0) {
			for(Produto p : carrinho.keySet()) {
				System.out.println("Produto: " + p + "\nQuantidade: " + carrinho.get(p));
			}
		}else {
			System.out.println("Carrinho vazio! ");
		}
		Utils.pausar(2);
		menu();
	}
	private static void finalizarCompra() {
		Double valorDaCompra = 0.0;
		System.out.println("Seus Produtos");
		for(Produto p : carrinho.keySet()) {
			int qtd = carrinho.get(p);
			valorDaCompra += p.getPreco() * qtd;
			System.out.println(p);
			System.out.println("Quantidade: " + qtd);
			System.out.println();
		}
		System.out.println("O valor da sua compra é: " + Utils.doubleToString(valorDaCompra));
		carrinho.clear();
		System.out.println("Volte Sempre");
		Utils.pausar(2);
		menu();
	}
}
