package Conta;

import Util.ContaUtil;


public class Conta implements Comparable<Conta>, Acoes {

    private ContaUtil contaUtil;
    private String cpf;
    private int IdCpf;

    public Conta(String cpf, int IdCpf) {
        this.contaUtil = new ContaUtil();
        this.cpf = cpf;
        this.IdCpf = IdCpf;
    }

    public Conta(String cpf) {
        this.contaUtil = new ContaUtil();
        this.cpf = cpf;
    }

    public Conta(String cpf, int IdCpf, double valorInicial) {
        this.contaUtil = new ContaUtil(valorInicial);
        this.cpf = cpf;
        this.IdCpf = IdCpf;
    }

    public int getIdCpf() {
        return IdCpf;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public double sacar(double valor) {
        return this.contaUtil.saca(valor);
    }

    @Override
    public double depositar(double valor) {
        return this.contaUtil.deposita(valor);
    }

    @Override
    public void verSaldo() {
        System.out.println("Conta Referente:\n" + this.cpf);
        contaUtil.verSaldo();
    }

    //Sobrescrita
    @Override
    public boolean equals(Object obj) {
        Conta outra = (Conta) obj;

        if (this.cpf != outra.cpf) {
            return false;
        }
        return true;
    }

    //Sobrecarga
    public String toString() {
        return "Conta:" + this.cpf + "     " + "IdConta:" + this.IdCpf +"     \n  "+
                "Saldo:" + this.contaUtil.getSaldo() +"";
    }

    /**
     * Definindo a Ordem Natural
     * Método Sobrescrito da Interface da java.lang.Comparable
     * @param conta
     * @return
     */
    @Override
    public int compareTo(Conta conta) {
        return Double.compare(this.contaUtil.getSaldo(), conta.contaUtil.getSaldo());
    }
}
