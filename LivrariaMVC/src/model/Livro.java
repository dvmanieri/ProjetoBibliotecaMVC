package model;

public class Livro { // aqui temos apenas uma classe para moledar o nosso livro
	String titulo;
	String autor;
	int paginas;
	boolean emprestimo;

	public Livro(String titulo, String autor, int paginas, boolean emprestimo) {
		this.titulo = titulo;
		this.autor = autor;
		this.paginas = paginas;
		this.emprestimo = emprestimo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public boolean getEmprestimo() {
		return emprestimo;
	}

	public void setEmprestimo(boolean emprestimo) {
		this.emprestimo = emprestimo;
	}

}
