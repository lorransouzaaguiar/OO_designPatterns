package Facade;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("\n");

        JogoFacade jogoFacade = new JogoFacade();

        jogoFacade.jogarNoFacil();
        jogoFacade.jogarNoMedio();
        jogoFacade.jogarNoDificil();
    }
}
