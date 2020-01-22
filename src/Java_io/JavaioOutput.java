package Java_io;

import java.io.*;

public class JavaioOutput {
    //Fluxo de saida de arquivos
    //Classes para gerar um saida de arquivos
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("ids2.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("Escrevendo Arquivo");
        bw.newLine();
        bw.write("Escrevendo Arquivo");
        bw.newLine();
        bw.close();
    }
}
