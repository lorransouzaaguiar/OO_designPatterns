package Strategy;

public abstract class JogoStrategy {
    protected Vilao vilao;
    protected Heroi heroi;
    protected int rodadas = 1;
    protected int coeficienteDeBatalha;

    JogoStrategy(Heroi heroi, Vilao vilao, int coeficienteDeBatalha) {
        this.vilao = vilao;
        this.heroi = heroi;
        this.coeficienteDeBatalha = coeficienteDeBatalha;
    }

    public abstract void jogar();

    protected abstract void vilaoAtaca();

    protected abstract void heroiAtaca();

    protected boolean jogoFinalizado() {
        if (this.vilao.getVidaAtual() <= 0 || this.heroi.getVidaAtual() <= 0) {
            if (this.heroi.getVidaAtual() <= 0) {
                System.out.println(this.heroi.getNomeJogador() + " Perdeu");
            } else {
                System.out.println(this.vilao.getNomeJogador() + " Perdeu");
            }
            return true;
        }
        return false;
    }

    protected void exibirRodada(int rodada) {
        System.out.println("Rodada: " + rodada);
        System.out.println("\n");
    }

    protected void exibeVidaDosJogadores() {
        System.out.println("Vida dos Jogadores");
        this.heroi.exibirVida();
        this.vilao.exibirVida();
    }

    protected void statusDoJogo() {
        System.out.println("\n");
        System.out.println("Status do jogo");
        this.exibeVidaDosJogadores();
        System.out.println("Terminou em " + this.rodadas + " rodadas");
    }
}
