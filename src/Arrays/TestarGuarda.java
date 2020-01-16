package Arrays;

import Conta.Conta;
import ProcessingExceptions.ContNull;

public class TestarGuarda {
    public static void main(String[] args) {
        GuardadorRef guar = new GuardadorRef();
        Conta conta1 = new Conta("123124");
        guar.add(conta1);
        conta1.depositar(11);
        conta1.verSaldo();
        Conta ref = (Conta) guar.mostrarObjeto(0);
        ref.verSaldo();


    }
}
