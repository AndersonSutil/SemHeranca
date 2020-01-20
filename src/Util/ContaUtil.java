package Util;

public class ContaUtil  {
    private double saldo;

    public ContaUtil(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public ContaUtil(){

    }

    public double deposita(double valor){
        return saldo += valor;
    }

    public double saca(double valor){
        return saldo -= valor;
    }

    public void verSaldo(){
        System.out.println("Seu Saldo é de:\n"+this.saldo);
    }

//    @Override
//    public int compareTo(ContaUtil contaUtil) {
//        return Double.compare(this.getSaldo() , contaUtil.getSaldo());
//    }
}
