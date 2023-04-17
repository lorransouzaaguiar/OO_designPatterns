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

    protected boolean jogoFinalizado() {
        if (this.vilao.getVidaAtual() <= 0 || this.heroi.getVidaAtual() <= 0) {
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
        if (this.heroi.getVidaAtual() <= 0) {
            System.out.println(this.vilao.getNomeJogador() + " é o vencedor");
        } else {
            System.out.println(this.heroi.getNomeJogador() + " é o vencedor");
        }
        System.out.println("Terminou em " + this.rodadas + " rodadas");

    }

    protected void vilaoAtaca() {
        System.out.println("Vilao ataca");
        int coeficienteDefesa = this.heroi.getDefesa() / this.coeficienteDeBatalha;
        int vidaAtual = this.heroi.getVidaAtual() + coeficienteDefesa
                - (this.vilao.getDano() * this.coeficienteDeBatalha);
        this.heroi.setVidaAtual(vidaAtual);
    }

    protected void heroiAtaca() {
        System.out.println("Herói ataca");
        int coeficienteDefesa = this.vilao.getDefesa() / this.coeficienteDeBatalha;
        int vidaAtual = this.vilao.getVidaAtual() + coeficienteDefesa
                - (this.heroi.getDano() * this.coeficienteDeBatalha);
        this.vilao.setVidaAtual(vidaAtual);
    }
}
