package Strategy;

public class Medio extends JogoStrategy {

    public Medio(Heroi heroi, Vilao vilao) {
        super(heroi, vilao, 3);
    }

    @Override
    public void jogar() {
        System.out.println("Jogando no Nível médio");
        while (true) {
            System.out.println("\n");
            this.exibirRodada(this.rodadas);
            this.heroiAtaca();
            this.vilaoAtaca();
            this.heroiAtaca();
            this.vilaoAtaca();

            if (this.jogoFinalizado()) {
                this.statusDoJogo();
                System.out.println("\n");
                break;
            }

            this.rodadas += 1;
        }

    }

    @Override
    protected void vilaoAtaca() {
        System.out.println("Vilao ataca");
        int coeficienteDefesa = this.heroi.getDefesa() / this.coeficienteDeBatalha;
        int vidaAtual = this.heroi.getVidaAtual() + coeficienteDefesa
                - (this.vilao.getDano() * this.coeficienteDeBatalha);
        this.heroi.setVidaAtual(vidaAtual);
    }

    @Override
    protected void heroiAtaca() {
        System.out.println("Herói ataca");
        int coeficienteDefesa = this.vilao.getDefesa() / this.coeficienteDeBatalha;
        int vidaAtual = this.vilao.getVidaAtual() + coeficienteDefesa
                - (this.heroi.getDano() * this.coeficienteDeBatalha);
        this.vilao.setVidaAtual(vidaAtual);
    }

}