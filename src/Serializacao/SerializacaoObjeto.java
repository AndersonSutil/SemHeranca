package Serializacao;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializacaoObjeto  {
    public static void main(String[] args) throws IOException {
        String nome = "Anderson Sutil";
        //Transformando objeto em binario
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Objeto.bin"));
        oos.writeObject(nome);
        oos.close();
    }
}
