package main;

import controller.LivroController;

public class Main {
	/*
	 * Crie um sistema para cadastrar livros, guarde as informações do título do
	 * livro, autor do livro e quantidade de páginas. Crie com as funcionalidades:
	 * cadastrar livros, exibir livros, emprestar livros e excluir livros.
	 */

	public static void main(String[] args) {
		LivroController livro = new LivroController();
		livro.inicializar(); // esse é um método para iniciar o programa
	}
}
