/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author jpgon
 */
public class Livro {
    private int id;
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private String isbn;

    public Livro(String titulo, String autor, int anoPublicacao, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.isbn = isbn;
    }

    public Livro(int id, String titulo, String autor, int anoPublicacao, String isbn) {
        this(titulo, autor, anoPublicacao, isbn);
        this.id = id;
    }

    // Getters e Setters
    public int getId() { return id; }
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getAnoPublicacao() { return anoPublicacao; }
    public String getIsbn() { return isbn; }
}
