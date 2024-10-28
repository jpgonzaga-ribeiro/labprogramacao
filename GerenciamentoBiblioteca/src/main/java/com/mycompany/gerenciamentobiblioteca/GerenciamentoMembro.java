package com.mycompany.gerenciamentobiblioteca;

import java.util.ArrayList;

public class GerenciamentoMembro extends Gerenciamento {
    private Integer id;
    private String nome;

    private static ArrayList<GerenciamentoMembro> membros = new ArrayList<>();

    public GerenciamentoMembro(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //Método de cadastro de membros
    @Override
    public void Cadastrar() {
        membros.add(this);
        System.out.println("Membro cadastrado: " + this.getNome());
    }

    //Método de remoção de membros
    @Override
    public void Remover() {
        if (membros.removeIf(membro -> membro.getNome().equalsIgnoreCase(this.nome))) {
            System.out.println("Membro removido: " + this.getNome());
        } else {
            System.out.println("Membro não encontrado para remoção.");
        }
    }

    //Método de listagem de membros presente na lista "membros"
    public static void listarGerenciamentoMembro() {
        membros.forEach(membro -> System.out.println(membro.getNome()));
    }

    // Método específico para editar o nome de um Membro pelo nome
    public static void editarMembroPorNome(String nome, String nvNome) {
        boolean encontrado = false; // boolean criado para realizar um tratamento de erro caso não encontre um membro para editar
        for (GerenciamentoMembro m : membros) { // faz a busca do membro informado na lista dos membros
            if (m.getNome().equalsIgnoreCase(nome)) { // ignora em caso se o usuario digitar maiusculo
                System.out.println("Nome do Membro: " + m.getNome());
                m.setNome(nvNome); //seta o novo nome
                System.out.println("Novo nome do membro: " + m.getNome());
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Membro não encontrado.");
        }
    }
}
