package Serializacao;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DesserializacaoObjeto {
    public static void main(String[] args) throws Exception {
        //Desempacotando objeto Binario
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Objeto.bin"));
        String nome = (String) ois.readObject();
        ois.close();
        System.out.println(nome);
    }
}
