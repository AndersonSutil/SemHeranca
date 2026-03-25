package DominandoAsCollections.Performace;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformace {

    //Quando se Utiliza HashSet, Se tem Um ganho em performace pois
    //esse tipo de classe utiliza um tabela Hash
    public static void main(String[] args) {

        BigDecimal v1 = new BigDecimal("69.21749") ;
        BigDecimal v2 = new BigDecimal("208.8923595744680851063822978723404231158") ;
        BigDecimal v3 = new BigDecimal("141.08211111111111111111111111111108268");
        BigDecimal v4 = new BigDecimal("83.21221278659611992945326278659611429522");
        BigDecimal v5 = new BigDecimal("46.68833333333333333333333333333333160201");
        BigDecimal v6 = new BigDecimal("34.62249642639721096118874753600322533675");
        BigDecimal v7 = new BigDecimal("187.386761904761904761904761904761907576");

        BigDecimal soma =  v1.add(v2).add(v3).add(v4).add(v5).add(v6).add(v7);
        System.out.println(soma);


//        Collection<Integer> numeros = new HashSet<>();
//        Collection<Integer> numeros1 = new HashSet<>();
//
//        ArrayList<Integer> numeros2 = new ArrayList<>();
//
//        long inicio = System.currentTimeMillis();
//
//        for (int i = 1; i <= 50000; i++) {
//            numeros.add(i);
////            numeros1.add(i);
//            numeros2.add(i);
//        }
//
//        for (Integer numero : numeros) {
//            numeros.contains(numero);
//            numeros2.contains(numeros2);
////            numeros1.contains(numeros1);
//        }
//
//        long fim = System.currentTimeMillis();
//
//        long tempoDeExecucao = fim - inicio;
//
//        System.out.println("Tempo gasto: " + tempoDeExecucao);
//        System.out.println(numeros);
//        System.out.println(numeros2);
//        System.out.println();
//
//
//        long v1 = 2;
//        int v2 = 2;
//
//        int inteiro;
//        double quebrado;
//        float flutuante;
//        long longo;
//
//
//        double soma = v1 + v2;
//
//        float sub = v2 - v1;
//        float div = v2 / v1;
//        int mult = (int) (v2 * v1);
//
//
//        System.out.println(" \nsoma:" + soma + "\n sub:" + sub + "\n div:" + div + "\n mult:" + mult);
//
//        somar((int) v1, v2);
//
//
//    }
//
//    public static void somar(int nume1, int nume2) {
//
//        if (nume1>0 & nume2>0){
//
//            System.out.println("Total da soma e: " + nume1 + nume2);
//
//            for (int i = 0 ; i < 11; i++){
//                System.out.println(nume2*i);
//
//                while (i == 5){
//                    i++;
//                    System.out.println("parei");
//                }
//            }
//
//
//
//
//        }else {
//            System.out.println("numeros tem que ser maior que zero");
//        }
//
    }

}
