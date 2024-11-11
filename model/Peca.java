package model;

public class Peca {
    private Jogador jogador;
    private int tipo;

    public Peca(Jogador jogador) {
        this.jogador = jogador;
    }

    public void evoluir() {
        // Lógica para evoluir a peça
    }

    public int getIdDono() {
        return jogador.getId();
    }
}
