/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eduardotp2;

import javax.swing.JOptionPane;

/**
 * @author Aluno
 */
public class EduardoTP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        LivroFisico livrofisicoum = new LivroFisico("Batman e Robin", "Criador do Batman", 1972, 10.7);
        LivroFisico livrofisicodois = new LivroFisico("Aquaman", "Criador do Aquaman", 1972, 10.7);
        Ebook ebookum = new Ebook("Superman", "Criador do Superman", 1965, 13.7);
        Ebook ebookdois = new Ebook("Robin", "Criador do Robin", 1965, 13.7);

        biblioteca.adicionarLivro(ebookum);
        biblioteca.adicionarLivro(livrofisicoum);
        biblioteca.adicionarLivro(livrofisicodois);
        biblioteca.adicionarLivro(ebookdois);

        biblioteca.listarLivros();

        String busca = JOptionPane.showInputDialog("Escreva o nome do titulo que queira buscar");
        biblioteca.buscarLivroPorTitulo(busca);

    }

}
