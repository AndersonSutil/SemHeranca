package ListJavaUtil;

import Conta.Conta;

import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        ArrayList listObj = new ArrayList();

        Conta c1 = new Conta("123");
        Conta c2 = new Conta("456");
        Conta c3 = new Conta("789");
        Conta c4 = new Conta("012");

        listObj.add(c1);
        listObj.add(c2);
        listObj.add(c3);
        listObj.add(c4);

        System.out.println(listObj.size());

        Conta ref = (Conta) listObj.get(0);

        System.out.println(ref);

        listObj.remove(3);

        for(Object o: listObj){
            System.out.println(o);
        }
    }
}
