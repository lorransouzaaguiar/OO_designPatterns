package TemplateMethod;

class TreinoNoInicioDaTemporada extends Treinos {

    protected void preparoFisico() {
        System.out.println("Preparo Fisico Leve.");
    }

    protected void jogoTreino() {
        System.out.println("Jogo Treino com Equipe Junior.");
    }

}