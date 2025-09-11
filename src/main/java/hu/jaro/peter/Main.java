package hu.jaro.peter;

import hu.jaro.peter.bucket.list.BakancsLista;
import hu.jaro.peter.bucket.list.BakancsListaFeltolto;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        BakancsLista new2 = new BakancsLista("peter");
        BakancsListaFeltolto.averageCost(new2);

    }
}