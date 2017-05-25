package model;

import java.util.Random;

public class Livro {
	private String titulo;
	private String autor;
	private int numeroDePaginas;
	private int id;
	
	Random aleatorio = new Random();
	
	
	
	public Livro(String titulo, String autor, int numeroDePaginas) {
		this.titulo = titulo;
		this.autor = autor;
		this.numeroDePaginas = numeroDePaginas;
	
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
	public int getNumeroDePaginas() {
		return numeroDePaginas;
	}
	public void setNumeroDePaginas(int numeroDePaginas) {
		this.numeroDePaginas = numeroDePaginas;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id = aleatorio.nextInt(500) + 1;
	}
	
	

}
