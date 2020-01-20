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

        for (Conta conta : contas) {
            System.out.println(conta);
        }
        //Pode utilizar o null quando vai utilizar o Objeto só no metodo isolado "Má Pratica"
        //Class Anonimas, quando se precisa utilizar apenas uma interface para o metodo,
        //com isso a jvm cria uma classe anônima só para executar o metodo,
        // Tem que se Colocar o new ,nome da interface, <Generics>,(Construtor da Classe),{Bloco de codigo}
        contas.sort(new Comparator<Conta>() {
                        @Override
                        public int compare(Conta c1, Conta c2) {
                            //metodo Simplificado
                            return Integer.compare(c1.getIdCpf(), c2.getIdCpf());
                        }
                    }
        );
        System.out.println("_____________________\n");

        for (Conta conta : contas) {
            System.out.println(conta);
        }

        System.out.println("______________________\n");

        // Ordem natural, Utilizando os metodos Statics da Classe Collections
        Collections.sort(contas);

        for (Conta conta : contas) {
            System.out.println(conta);
        }


    }


}
