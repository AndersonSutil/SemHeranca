package Serializacao;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializacaoObjeto implements Serializable {
    //Marcarção de Objeto, Quando se a mudanças no Objeto,
    // haverá uma comparação de marcação, caso sejá incompatíveis, joga uma exception na pilha
    // private static final long serialVersionUID = 12L;

    public static void main(String[] args) throws IOException {

        String nome = "Anderson Sutil";
        //Transformando objeto em binario
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Objeto.bin"));
        oos.writeObject(nome);
        oos.close();
    }
}
