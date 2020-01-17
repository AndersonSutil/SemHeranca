package Equals;

import Conta.Conta;

import java.util.ArrayList;

public class MetodoEquals {
    public static void main(String[] args) {

        ArrayList<Conta> contas = new ArrayList<Conta>();

        Conta c1 = new Conta("123456789");
        Conta c2 = new Conta("123456789");
        Conta c3 = new Conta("123123");

        contas.add(c1);
        contas.add(c2);
        contas.add(c3);

        boolean existe = contas.contains(c3);
        System.out.println("Já existe:" +existe);

        contas.contains(c3);
        contas.contains(c2);


    }
}
