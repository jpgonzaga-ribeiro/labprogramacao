/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gerenciamentobiblioteca;

import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public class GerenciamentoLivro extends Gerenciamento {
    private Integer id;
    private String titulo;

    public GerenciamentoLivro(Integer id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }

    public Integer getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Lista estática para armazenar os livros
    private static ArrayList<GerenciamentoLivro> livros = new ArrayList<>();

    // Método para adicionar um livro à lista
    @Override
    public void Cadastrar() {
        livros.add(this);
        System.out.println("Livro cadastrado: " + this.getTitulo());
    }

    // Método para remover um livro da lista
    @Override
    public void Remover() {
        livros.remove(this);
    }

    //Método de listagem de membros presente na lista "livros"
    public static void listarGerenciamentoLivro() {
        livros.forEach(livro -> System.out.println("Livro: "+ livro.getTitulo()));
    }

    // Método específico para editar o título de um livro pelo nome
    public static void editarLivroPorTitulo(String titulo, String nvTitulo) {
        boolean encontrado = false; // boolean criado para realizar um tratamento de erro caso não encontre o livro para editar
        for (GerenciamentoLivro l : livros) { // faz a busca do livro informado na lista dos livros
            if (l.getTitulo().equalsIgnoreCase(titulo)) { // ignora em caso se o usuario digitar maiusculo
                System.out.println("Título do livro: " + l.getTitulo());
                l.setTitulo(nvTitulo); //seta o novo titulo
                System.out.println("Novo Título do livro: " + l.getTitulo());
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Livro não encontrado.");
        }
    }
}
