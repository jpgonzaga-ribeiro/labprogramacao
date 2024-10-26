/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Biblioteca;


/**
 *
 * @author Aluno
 */
import dao.LivroDAO;
import javax.swing.*;
import java.util.List;
import model.Livro;

public class Biblioteca {
    public static void main(String[] args) {
        LivroDAO livroDAO = new LivroDAO();
        int opcao;

        do {
            String menu = """
                    --- Sistema de Gerenciamento da Biblioteca ---
                    1. Inserir Livro
                    2. Buscar Livros por Autor
                    3. Atualizar Livro
                    4. Deletar Livro
                    5. Sair
                    Escolha uma opção:
                    """;
            String entrada = JOptionPane.showInputDialog(menu);
            
            if (entrada == null) break;  // Se o usuário cancelar o menu, encerra o programa
            opcao = Integer.parseInt(entrada);

            switch (opcao) {
                case 1 -> inserirLivro(livroDAO);
                case 2 -> buscarLivrosPorAutor(livroDAO);
                case 3 -> atualizarLivro(livroDAO);
                case 4 -> deletarLivro(livroDAO);
                case 5 -> JOptionPane.showMessageDialog(null, "Encerrando o sistema...");
                default -> JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
            }
        } while (opcao != 5);
    }

    private static void inserirLivro(LivroDAO livroDAO) {
        String titulo = JOptionPane.showInputDialog("Título:");
        String autor = JOptionPane.showInputDialog("Autor:");
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano de Publicação:"));
        String isbn = JOptionPane.showInputDialog("ISBN:");
        
        Livro novoLivro = new Livro(titulo, autor, ano, isbn);
        livroDAO.inserir(novoLivro);
    }

    private static void buscarLivrosPorAutor(LivroDAO livroDAO) {
        String autor = JOptionPane.showInputDialog("Autor:");
        List<Livro> livros = livroDAO.buscarPorAutor(autor);

        if (livros.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum livro encontrado para esse autor.");
        } else {
            StringBuilder resultado = new StringBuilder("Livros encontrados:\n");
            livros.forEach(livro -> resultado.append(
                    String.format("ID: %d | Título: %s | Ano: %d | ISBN: %s%n",
                            livro.getId(), livro.getTitulo(), livro.getAnoPublicacao(), livro.getIsbn())));
            JOptionPane.showMessageDialog(null, resultado.toString());
        }
    }

    private static void atualizarLivro(LivroDAO livroDAO) {
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID do Livro a ser atualizado:"));
        String novoTitulo = JOptionPane.showInputDialog("Novo Título:");
        int novoAno = Integer.parseInt(JOptionPane.showInputDialog("Novo Ano de Publicação:"));
        
        Livro livroAtualizado = new Livro(id, novoTitulo, "", novoAno, "");
        livroDAO.atualizar(livroAtualizado);
    }

    private static void deletarLivro(LivroDAO livroDAO) {
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID do Livro a ser deletado:"));
        livroDAO.deletar(id);
    }
}

/*
                                                        Boas Práticas Adotadas
Uso de PreparedStatement:

Evita SQL Injection e melhora a performance.
try-with-resources:

Garante o fechamento de recursos, evitando memory leaks.
DAO Pattern:

A separação da lógica de acesso ao banco em uma classe DAO facilita a manutenção e o reaproveitamento de código.
Tratamento de Exceções:

Mensagens de erro são exibidas para o usuário, e as exceções são tratadas para evitar falhas inesperadas.

*/

