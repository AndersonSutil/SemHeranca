package Sort;

import Conta.Conta;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenarContas {

    public static void main(String[] args) {
        Conta c1 = new Conta("123456789",100);
        Conta c2 = new Conta("123456789",10);
        Conta c3 = new Conta("223456789",7);
        Conta c4 = new Conta("323456789",88);
        Conta c5 = new Conta("423456789",30);

        List<Conta> contas = new ArrayList<Conta>();
        contas.add(c1);
        contas.add(c2);
        contas.add(c3);
        contas.add(c4);
        contas.add(c5);

        for (Conta conta: contas) {
            System.out.println(conta);
        }

        Ordenador ordenador = new Ordenador();

        contas.sort(ordenador);
        System.out.println("\n");

        for (Conta conta: contas) {
            System.out.println(conta);
        }

    }


}
class Ordenador implements Comparator<Conta>{
    /**
     * Metodo que compara os IdCpf das contas, para ordenar do menor para maior
     * @param c1
     * @param c2
     * @return
     */
    @Override
    public int compare(Conta c1, Conta c2) {
        if(c1.getIdCpf() < c2.getIdCpf()){
            return -1;
        }
        if(c2.getIdCpf() > c2.getIdCpf()){
            return 1;
        }
        return 0;
    }
}
