package TemplateMethod;

public abstract class Treinos {
    final void treinoDiario() {
        preparoFisico();
        jogoTreino();
        treinoTatico();
    }

    abstract protected void preparoFisico();

    abstract protected void jogoTreino();

    final protected void treinoTatico() {
        System.out.println("Treino Tatico");
    }

}
