package Sort;

import Conta.Conta;
import Util.ContaUtil;

import java.util.*;

public class OrdenarContas {

    public static void main(String[] args) {
        Conta c1 = new Conta("123456789", 100, 150.0);
        Conta c2 = new Conta("123456789", 10, 2000.0);
        Conta c3 = new Conta("223456789", 7, 500.0);
        Conta c4 = new Conta("323456789", 88, 3000.0);
        Conta c5 = new Conta("423456789", 30, 1.0);

        List<Conta> contas = new ArrayList<Conta>();
        contas.add(c1);
        contas.add(c2);
        contas.add(c3);
        contas.add(c4);
        contas.add(c5);

        //Lambdas Passa a entrada de parametro() Sinaliza que é um lambda -> Passa o codigoa executar
        contas.forEach((conta) -> System.out.println(conta));

        System.out.println("Ordenando por IdConta: _____________________\n");

        contas.sort(Comparator.comparingInt((Conta c) -> c.getIdCpf()));

        //contas.sort((c1,c2) -> Integer.compare(c1.getIdCpf(), c2.getIdCpf()) );

        contas.forEach((conta) -> {
            System.out.println(conta);
        });

        System.out.println("Ordenando por Ordem natural, valor na Conta:______________________\n");

        // Ordem natural, Utilizando os metodos Statics da Classe Collections
        Collections.sort(contas);
        contas.forEach ((conta -> System.out.println(conta)));

        System.out.println("Ordenando por Conta :______________________\n");

        //Usando Lambdas para Criar uma variavel da Interface Comparator
        Comparator<Conta> comp = (Conta s1,Conta s2) -> {
            String nomeC1 = s1.getCpf();
            String nomeC2 = s2.getCpf();
            return nomeC1.compareTo(nomeC2);
        };
        contas.sort(comp);
        contas.forEach ((conta -> System.out.println(conta)));


    }


}
