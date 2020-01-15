package StringsJava;

import org.w3c.dom.ls.LSOutput;

public class TratamentoDeStrings {


    public String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public String letrasComEspaco = "A B C D E F G H I J";

    public void pegarLetras() {
        String letrasC = letras.substring(0, 5);
        System.out.println(letrasC);
    }

    public void deixarMinusculas() {
        String letrasMi = letras.toLowerCase();
        System.out.println(letrasMi);
    }

    public void deixarMaiusculas() {
        String letrasMi = letras.toLowerCase();
        String letrasMa = letrasMi.toUpperCase();
        System.out.println(letrasMa);
    }

    /**
     * O método trim() , por algum motivo não funciona para remover o espaços
     */
    public void tirarEspaco() {
        String letrasSEsp = letrasComEspaco.replaceAll("\\s", "");
        System.out.println(letrasSEsp);
    }

    public void substituirLetras() {
        String letrasSubs = letrasComEspaco.replace('A', 'b');
        System.out.println(letrasSubs);
    }

    public void subistiturSequenciaDeLetras() {
        String sequencia = letras.replace("ABCDEF", "XYZTK");
        System.out.println(sequencia);
    }

    public void concatenarString() {
        String concatenar = letrasComEspaco.concat("lá la la");
        System.out.println(concatenar);
    }

    public void repetirString() {
        String repetir = letrasComEspaco.repeat(2);
        System.out.println(repetir);
    }


    public void pegandoIndexDaLetra() {
//        char seila = 'H';
//        for (int i = 0; i < 15; i++) {
//             seila = letrasComEspaco.charAt(i);
//        }
        System.out.println(letrasComEspaco.charAt(2));
    }

    public void pegandoQuantidadeDeIndex() {

        System.out.println(letrasComEspaco.codePointCount(0, letrasComEspaco.length()));
    }

    public void sei() {


    }

    public static void main(String[] args) {

        TratamentoDeStrings trat = new TratamentoDeStrings();
        trat.pegarLetras();
        trat.deixarMinusculas();
        trat.deixarMaiusculas();
        trat.tirarEspaco();
        trat.substituirLetras();
        trat.subistiturSequenciaDeLetras();
        trat.concatenarString();
        trat.repetirString();
        trat.pegandoIndexDaLetra();
        trat.pegandoQuantidadeDeIndex();
        trat.sei();

    }
}
