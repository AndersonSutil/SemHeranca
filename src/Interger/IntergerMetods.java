package Interger;

public class IntergerMetods {
    public static void main(String[] args) {

        System.out.println("Valor Maximo de um Interger:\n"+Integer.MAX_VALUE);
        System.out.println("Valor minimo de um Interger:\n"+Integer.MIN_VALUE);
        System.out.println("Quantidade de Bytes de um Interger:\n"+Integer.BYTES);
        System.out.println("Tamanho de bits de um Interger:\n"+Integer.SIZE);
        System.out.println("Tipo primitivo de um Interger:\n"+Integer.TYPE);

        Integer num = Integer.valueOf(10);//AutoBoxing
        int num2 = num.intValue();//UnBoxing
        String n = new String("2");
        int num3 = Integer.parseInt(n);//Tranformando String em int, "parsing"
        //Possui transformação de um Interger para outros valores primitivos:
        // byte, float, short, long, int, double
        System.out.println("Transformando int em double :\n"+ num.doubleValue());
    }
}
