package Java_io;

import java.io.*;

public class Io {

    public static void main(String[] args) throws IOException {
        //para entrada de rede utilizase a classe "Socket"
        //new Socket().getInputStream();

        InputStream fis = System.in;//new FileInputStream("ids.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader bis = new BufferedReader(isr);
        String linha = bis.readLine();

        OutputStream fos = System.out;//new FileOutputStream("ids2.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);



        while(linha != null && !linha.isEmpty()){

            bw.write(linha);
            bw.newLine();
            bw.flush();
            linha = bis.readLine();
        }
        bis.close();
        bw.close();
    }
}
