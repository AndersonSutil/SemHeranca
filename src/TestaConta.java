import Conta.Conta;
import Util.ContaUtil;

public class TestaConta {
    public static void main(String[] args) {
        Conta minhaConta = new Conta("174.405");

        minhaConta.depositar(1000);
        minhaConta.sacar(12);
        minhaConta.verSaldo();



    }
}
