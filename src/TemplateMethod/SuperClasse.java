package TemplateMethod;

public abstract class SuperClasse {

    public void templateMethod() {
        this.executaFuncaoA();
        this.executaFuncaoB();
    }

    abstract void executaFuncaoA();

    public void executaFuncaoB() {
        System.out.println("executa B");
    }
}
