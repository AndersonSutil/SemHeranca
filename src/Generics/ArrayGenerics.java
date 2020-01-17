package Generics;

import Conta.Conta;

import java.util.ArrayList;

public class ArrayGenerics {
    public static void main(String[] args) {
    //Cria um ArrayList e especifica com o Generics qual
    // o Tipo que será aceitp pelo array list
    ArrayList<String>  nomes= new ArrayList<String>();

    nomes.add("Freula");
    //Num ArrayList de String não aceita outra referencia,
    //que não seja a qual foi especificada entre <>
    //nomes.add(Conta); //-- não aceito no ArrayList3
    }

}
