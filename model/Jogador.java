package model;

public class Jogador {
    private String nome;
    private int id;

    public Jogador(String nome) {
        this.nome = nome;
        // Define o ID de alguma maneira, por exemplo, sequencialmente
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }
}
