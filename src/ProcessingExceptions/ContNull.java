package ProcessingExceptions;

import Conta.Conta;

public class ContNull {
    static Conta conta;

    public String verificaNulo(String conta){
        return (conta == null) ? "Conta Nula" : this.toString();
    }

    public static void main(String[] args) {
        ContNull contN = new ContNull();
        System.out.println(contN.verificaNulo(""));
    }
}