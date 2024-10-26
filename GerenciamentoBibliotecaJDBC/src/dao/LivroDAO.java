/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author jpgon
 */
import conexao.ConnectionFactory;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.Livro;

public class LivroDAO {
    public void inserir(Livro livro) {
        String sql = "INSERT INTO livro (titulo, autor, ano_publicacao, isbn) VALUES (?, ?, ?, ?)";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, livro.getTitulo());
            stmt.setString(2, livro.getAutor());
            stmt.setInt(3, livro.getAnoPublicacao());
            stmt.setString(4, livro.getIsbn());
            stmt.executeUpdate();
            System.out.println("Livro inserido com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Livro> buscarPorAutor(String autor) {
        List<Livro> livros = new ArrayList<>();
        String sql = "SELECT * FROM livro WHERE autor = ?";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, autor);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                livros.add(new Livro(
                        rs.getInt("id"),
                        rs.getString("titulo"),
                        rs.getString("autor"),
                        rs.getInt("ano_publicacao"),
                        rs.getString("isbn")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return livros;
    }

    public void atualizar(Livro livro) {
        String sql = "UPDATE livro SET titulo = ?, ano_publicacao = ? WHERE id = ?";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, livro.getTitulo());
            stmt.setInt(2, livro.getAnoPublicacao());
            stmt.setInt(3, livro.getId());
            int linhasAfetadas = stmt.executeUpdate();
            if (linhasAfetadas > 0) {
                System.out.println("Livro atualizado com sucesso!");
            } else {
                System.out.println("Livro não encontrado.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletar(int id) {
        String sql = "DELETE FROM livro WHERE id = ?";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            int linhasAfetadas = stmt.executeUpdate();
            if (linhasAfetadas > 0) {
                System.out.println("Livro deletado com sucesso!");
            } else {
                System.out.println("Livro não encontrado.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


/*
PreparedStatement é usado para consultas parametrizadas, evitando SQL Injection.
try-with-resources garante que os recursos (conexão, statement e result set) sejam fechados automaticamente.
Mensagens de erro e sucesso são exibidas com JOptionPane.
*/