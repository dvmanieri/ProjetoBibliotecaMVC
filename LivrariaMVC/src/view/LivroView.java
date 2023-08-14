package view;

import java.util.List;

import model.Livro;

public class LivroView { // aqui temos todos os views, basicamente eu apenas crio métodos com
							// visualizações e vou utilizando elas
	public void saudacao() {
		System.out.println(
				"\nDavi - ola\nDavi - seja bem vindo a livraria do Davi\nDavi - Oque vc gostaria de fazer hoje?");
	}

	public void menu() {
		System.out.println("\n1. Doar livro.");
		System.out.println("2. Emprestar livro.");
		System.out.println("3. Devolver livro.");
		System.out.println("4. Comprar livro.");
		System.out.println("5. Ver livros.");
		System.out.println("0. Sair.");

	}

	public void doar() {
		System.out.println("\nque bom!\nPara doar o livro me passa as seguintes informacoes: ");
		System.out.println("\nme diga o nome do livro: ");
	}

	public void autor() {
		System.out.println("\nme diga o nome do autor: ");
	}

	public void paginas() {
		System.out.println("\nme diga quantas paginas tem: ");
	}

	public void livroEmprestado() {
		System.out.println("\npuxa vida! o seu livro ja foi emprestado.");
	}

	public void emprestar() {
		System.out.println("\nDavi - que otimo!\nDavi - qual livro voce gostaria de emprestar?");
	}

	public void devolver() {
		System.out.println("\nDavi - que otimo!\nDavi - qual livro voce gostaria de devolver?");
	}

	public void comprar() {
		System.out.println("\nDavi - que otimo!\nDavi - qual livro voce gostaria de comprar?");
	}

	public void exibirLivro(List<Livro> listaLivros) {
		for (Livro livro : listaLivros) { // aqui temos um for que faz uma ação para cada objeto(livro)criado
			System.out.println("\n================================");// para cada um ele faz as seguintes ações
			System.out.println("Nome: " + livro.getTitulo());
			System.out.println("Autor: " + livro.getAutor());
			System.out.println("Quantidade de paginas: " + livro.getPaginas());
			System.out.println("Estatus de emprestimo: " + livro.getEmprestimo());
		}
	}

	public void invalido() {
		System.out.println("\nNao entendi a sua escolha.");
		System.out.println("Poderia repeti-la?");
	}
}
