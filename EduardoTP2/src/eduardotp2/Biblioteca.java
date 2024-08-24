/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardotp2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author Aluno
 */
public class Biblioteca {
    private ArrayList<Livro> livros = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void removerLivro(Livro livro) {
        livros.remove(livro);
    }

    public void listarLivros() {
        livros.forEach(livro -> JOptionPane.showMessageDialog(null, livro.getTitulo()));
    }

    public void buscarLivroPorTitulo(String titulo) {
        boolean encontrado = false;
        for (Livro l : livros) {
            if (l.getTitulo().equalsIgnoreCase(titulo)) {
                JOptionPane.showMessageDialog(null, "Livro Encontrado! ");
                JOptionPane.showMessageDialog(null, "Autor do livro: " + l.getAutor());
                encontrado = true;
                break; //se o livro for encontrado quebra o loop
            }
        }
        if (!encontrado) { //se não for encontrado retorna a mensagem a baixo
            JOptionPane.showMessageDialog(null, "Livro não encontrado.");
        }

    }


}
