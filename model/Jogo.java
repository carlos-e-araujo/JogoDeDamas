package model;

public class Jogo {
    private Tabuleiro tabuleiro;
    private Jogador[] vJogadores;
    private Jogador jogadorAtual;
    private int maximoDeCapturasPossiveis;

    public static void main(String[] args) {
        // Método principal para iniciar o jogo
    }

    public void trocarJogador() {
        // Lógica para trocar o jogador atual
    }

    public int verificarPossibilidades(Jogador jogador, Tabuleiro tabuleiro) {
        // Lógica para verificar possibilidades de jogadas
        return 0;
    }

    public void solicitarAcao(Jogador jogador, Tabuleiro tabuleiro) {
        // Solicita uma ação do jogador
    }

    public boolean verificarPossivelVencedor(Tabuleiro tabuleiro) {
        // Verifica se há um possível vencedor
        return false;
    }
}
