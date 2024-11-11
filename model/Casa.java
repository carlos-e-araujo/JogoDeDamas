package model;

public class Casa {
    private boolean estado;
    private Peca peca;

    public Casa() {
        // Construtor para inicializar a casa
    }

    public void adicionarPeca(Peca peca) {
        this.peca = peca;
        this.estado = true;
    }

    public void removerPeca() {
        this.peca = null;
        this.estado = false;
    }

    public Peca getPeca() {
        return peca;
    }

    public boolean verificarEstado() {
        return estado;
    }
}
