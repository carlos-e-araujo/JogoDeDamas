package model;

public class Tabuleiro {
    private Casa[][] mCasas = new Casa[8][8];

    public Tabuleiro() {
        // Construtor que inicializa o tabuleiro
    }

    public void imprimir() {
        // Método para imprimir o tabuleiro
    }

    public Casa getCasa(int x, int y) {
        return mCasas[x][y];
    }

    public void setCasa(int x, int y, Casa casa) {
        mCasas[x][y] = casa;
    }

    public boolean mover(Peca peca, Casa casa) {
        // Lógica para mover a peça para a casa
        return true; // Retorna se o movimento foi bem-sucedido
    }
}
