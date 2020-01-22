package Java_io;

import java.io.*;

public class JavaioInput {
    //Fluxo de entrada de arquivos
    //Classes para leitura de Arquivos, é necessario tratar as exceptions
    public static void main(String[] args) throws IOException {
        //Transforma o Arquivo em bytes
        FileInputStream fis = new FileInputStream("ids.txt");
        //Lê os bytes
        InputStreamReader isr = new InputStreamReader(fis);
        //Transforma os bytes em String
        BufferedReader bis = new BufferedReader(isr);
        //Lê as linhas do Arquivo
        String linha = bis.readLine();
        while(linha != null){
            System.out.println(linha);
            linha = bis.readLine();
        }
        bis.close();
    }
}
