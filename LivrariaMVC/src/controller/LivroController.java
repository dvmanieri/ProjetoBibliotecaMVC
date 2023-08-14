package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Livro;
import view.LivroView;

public class LivroController {
	List<Livro> listaLivro;
	LivroView livroView;

	public LivroController() {
		listaLivro = new ArrayList();
		livroView = new LivroView();
	}

	public void cadatroLivro(String titulo, String autor, int paginaa, boolean emprestimo) { // aqui eu crio um objeto
																								// para adicionar na
																								// nossa lista de objeto
		Livro livro = new Livro(titulo, autor, paginaa, emprestimo);
		listaLivro.add(livro); // adiciono na lista
	}

	public void emprestarLivro(String empretar) { // esse é um método para alterar o estatus de emprestado do
													// livro(objeto)
		for (Livro livro : listaLivro) {// um for para encontrar o livro selecionado

			if (livro.getTitulo().equalsIgnoreCase(empretar)) { // verificar se o nome do livro é igual
				if (livro.getEmprestimo() == true) { // aqui serve para ver se ele já não está emprestado
					livroView.livroEmprestado();
				} else {
					livro.setEmprestimo(true); // se ele não estiver emprestado altera o valor
				}
			}
		}
	}

	public void devolver(String devolver) { // esse é igual ao de cima
		for (Livro livro : listaLivro) {

			if (livro.getTitulo().equalsIgnoreCase(devolver)) {

				livro.setEmprestimo(false);
			}
		}
	}

	public void excluirLivro(String livroComprar) { // esse serve para remover um objeto dá lista
		for (Livro livro : listaLivro) {

			if (livro.getTitulo().equalsIgnoreCase(livroComprar)) { // ele acha o nome do livro,verifica se está
																	// empresetado e depois remove
				if (livro.getEmprestimo() == true) {
					livroView.livroEmprestado();
					break;
				} else {
					listaLivro.remove(livro);
					break;
				}
			}
		}
	}

	public void inicializar() {
		livroView.saudacao(); // os metodos livroview serve para chamar um System.out.println para fazer a
								// exibição
		Scanner scan = new Scanner(System.in);
		int cont = -1; // contador para deixar o menu ativo
		while (cont != 0) { // aqui eu faço o menu em loop
			livroView.menu();
			cont = scan.nextInt();
			switch (cont) { // aqui eu uso estruturas de decições para fazer as opções do código
			case 1: {
				scan.nextLine();
				livroView.doar();
				String nomeLivro = scan.nextLine();
				livroView.autor();
				String nomeAutor = scan.nextLine();

				livroView.paginas();
				int pagina = scan.nextInt();
				cadatroLivro(nomeLivro, nomeAutor, pagina, false);
				break;
			}

			case 2: {
				scan.nextLine();
				livroView.emprestar();
				String nomeLivro = scan.nextLine();
				emprestarLivro(nomeLivro);
				break;
			}
			case 3: {
				scan.nextLine();
				livroView.devolver();
				String nomeLivro = scan.nextLine();
				devolver(nomeLivro);
				break;
			}
			case 4: {
				scan.nextLine();
				livroView.comprar();
				String nomeLivro = scan.nextLine();
				excluirLivro(nomeLivro);
				break;
			}
			case 5: {
				scan.nextLine();
				livroView.exibirLivro(listaLivro);
				break;
			}
			case 0: {

				break;
			}

			default:
				scan.nextLine();
				livroView.invalido();
				break;
			}
		}

	}
}
