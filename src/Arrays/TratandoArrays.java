package Arrays;

public class TratandoArrays {
    String[] nomes = new String[10];
    //Array mais generico possivel caso queira utilizar metodos()
    // especificos tem que fazer Type-Cast como

    public void arrayDenumeros() {
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i * i;
            System.out.println(numeros[i]);
        }
    }
    public void nomes(){
        for (int i=0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }
    }
    public void mensagem(){
        System.out.println("Funciona");
    }

    /**
     * O args é um Array que captura as entradas no " Program Arguments "
     * @param args
     */
    public static void main(String[] args) {

        TratandoArrays tr = new TratandoArrays();
        tr.nomes();

        for(int i = 0; i < args.length; i++){
            System.out.println(args[i]);
        }

        Object[] arrayGenerico = new Object[10];
        arrayGenerico[0] = new TratandoArrays();
        //type-cast
        TratandoArrays tratamento = (TratandoArrays) arrayGenerico[0];
        //acessando metodo especifico
        tratamento.nomes();
        tratamento.mensagem();
        System.out.println(tratamento);



    }
}
