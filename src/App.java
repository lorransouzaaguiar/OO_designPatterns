import TemplateMethod.SubClasseA;
import TemplateMethod.SubClasseB;

public class App {
    public static void main(String[] args) throws Exception {
        SubClasseA subA = new SubClasseA();
        subA.templateMethod();

        SubClasseB subB = new SubClasseB();
        subB.templateMethod();

    }
}
