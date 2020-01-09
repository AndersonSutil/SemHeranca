package Util;

public class ContaUtil {
    private double saldo;


    public double deposita(double valor){
        return saldo += valor;

    }

    public double saca(double valor){
        return saldo -= valor;
    }

    public void verSaldo(){
        System.out.println("Seu Saldo é de:\n"+this.saldo);
    }

}
