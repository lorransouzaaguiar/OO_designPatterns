package TemplateMethod;

class TreinoNoMeioDaTemporada extends Treinos {

    protected void preparoFisico() {
        System.out.println("Preparo Fisico Intenso.");
    }

    protected void jogoTreino() {
        System.out.println("Jogo Treino com Equipe Reserva.");
    }
}
