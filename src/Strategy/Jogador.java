package Strategy;

public abstract class Jogador {
    protected int vidaAtual;
    protected int defesa;
    protected int dano;
    protected String nomeJogador;

    Jogador(int vidaAtual, int defesa, int dano, String nomeJogador) {
        this.vidaAtual = vidaAtual;
        this.defesa = defesa;
        this.dano = dano;
        this.nomeJogador = nomeJogador;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getVidaAtual() {
        return vidaAtual;
    }

    public void setVidaAtual(int vidaAtual) {
        this.vidaAtual = vidaAtual;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public String getNomeJogador() {
        return nomeJogador;
    }

    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

    public void exibirVida() {
        System.out.println("Vida atual do " + this.nomeJogador + ": " + this.vidaAtual);
    }

}
