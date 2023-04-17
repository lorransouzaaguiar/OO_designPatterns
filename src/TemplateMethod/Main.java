package TemplateMethod;

public class Main {

    public static void main(String[] args) throws Exception {
        TreinoNoInicioDaTemporada treinoNoInicioDaTemporada = new TreinoNoInicioDaTemporada();
        treinoNoInicioDaTemporada.treinoDiario();

        TreinoNoMeioDaTemporada treinoNoMeioDaTemporada = new TreinoNoMeioDaTemporada();
        treinoNoMeioDaTemporada.treinoDiario();

    }
}
