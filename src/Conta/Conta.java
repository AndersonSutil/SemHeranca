package Conta;

import Util.ContaUtil;

public class Conta implements Acoes{

    private ContaUtil contaUtil;
    private String cpf;


    public Conta(String cpf) {
        this.contaUtil = new ContaUtil();
        this.cpf = cpf;
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
        System.out.println("Conta Referente:\n"+this.cpf);
        contaUtil.verSaldo();

    }
}
