package ProcessingExceptions;

public class ExceptionsMain {
    public static void main(String[] args) {

        System.out.println("Inicio main");
        m1();
        System.out.println("Fim main");
    }

    public static void m1() {
        System.out.println("Inicio m1");
        m2();
        System.out.println("Fim m1");
    }

    /**
     * Metodo que possui o try/catch trata exceptions
     */
    public static void m2() {
        System.out.println("Inicio m2");
        try {

//          int num = 3 / 0;
            ContNull cont = null;

        } catch (Exception ex) {
            System.out.println("Erro :" + ex.getMessage()+"\n");
            System.out.println("Mostrando Pilha Afetada:\n");
            ex.printStackTrace();
            System.out.println("Fim Da Pilha >-< ");
        }
        System.out.println("Fim m2");
    }
}
