package Scanner;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Scannerio {
    public static void main(String[] args) throws IOException {
        //Utilizando o Scanner para entradas de Arquivos
        Scanner sc = new Scanner(new File("idss.csv"));
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            System.out.println(line);

            Scanner sl = new Scanner(line);
            sl.useLocale(Locale.US);
            sl.useDelimiter(",");

            String valor1 = sl.next();
            int valor2 = sl.nextInt();
            int valor3 = sl.nextInt();
            String valor4 = sl.next();
            double valor5 = sl.nextDouble();

            System.out.println("Tipo: "+valor1+"\nConta: "+valor2+" Agencia: "+valor3+"\nNome: "+valor4+"\nSaldo: "+valor5);
        }
        sc.close();
    }
}
