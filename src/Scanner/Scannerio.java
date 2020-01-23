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

            String stringFormatada = (String.format(new Locale("pt","BR"), "tipo de Conta: %s %d %d %s %02.2f",
                    valor1,valor2, valor3,valor4,valor5
            ));
            System.out.println(stringFormatada);
        }
        sc.close();
    }
}
