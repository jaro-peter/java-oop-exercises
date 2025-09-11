package hu.jaro.peter.bucket.list;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

/**
 * 4. A mellékelt bakancslista.txt szöveges file bakancslita elemeket tartalmaz, az alábbi formátumban:
 * megnevezés,év,költség,[ÉTTEREM|HELY|KÖNYV],[cím,telefonszám|város,ország|szerző],költség,év
 * A főprogramban hozzon létre egy BakancsLista objektumot és töltse fel a listát a file tartalmával!
 */

public class BakancsListaFeltolto {
    private static int a = 2;

    public static void main(String[] args) {
        BakancsLista bakancsLista = new BakancsLista("laszloBakancslistaja");
        List<String> sorok = new ArrayList<>();

        try {
            sorok = Files.readAllLines(Paths.get("bakancslista.txt"));
        } catch (IOException e) {
            System.out.println("sikertelen beolvasás");
        }
        for (String sor : sorok) {
            String[] listDetails = sor.split(",");
            if (listDetails[1].equals("KÖNYV")) {
                Konyv konyv = new Konyv(listDetails[0], Integer.parseInt(listDetails[4]), Integer.parseInt(listDetails[3]), listDetails[2]);
                bakancsLista.getElemek().add(konyv);
            } else if (listDetails[1].equals("HELY")) {
                Hely hely = new Hely(listDetails[0], Integer.parseInt(listDetails[5]), Integer.parseInt(listDetails[4]), listDetails[3], listDetails[2]);
                bakancsLista.getElemek().add(hely);
            } else if (listDetails[1].equals("ÉTTEREM")) {
                Etterem etterem = new Etterem(listDetails[0], Integer.parseInt(listDetails[5]), Integer.parseInt(listDetails[4]), listDetails[2], listDetails[3]);
                bakancsLista.getElemek().add(etterem);
            }
        }
        whichYearHasTheMostCompleted(bakancsLista);
        whichYearHasTheMostCompleted2(bakancsLista);
        System.out.println(" ");
        theFirstThing(bakancsLista);
        System.out.println("\n \n \n");
        System.out.println(averageCost(bakancsLista));


        System.out.println("\n");
        averageCost(bakancsLista);
        System.out.println(allItemsSorted(bakancsLista));
        System.out.println("\n\n\n\n");
        System.out.println(mostExpensive(bakancsLista));
    }
    /*
     *  Melyik évben lett a legtöbb elem teljesítve.*/

    public static Integer whichYearHasTheMostCompleted(BakancsLista bakancsLista) {

        HashMap<Integer, Integer> years = new HashMap<>();
        List<BakancsListaElem> lista = bakancsLista.getElemek();
        for (BakancsListaElem sor : lista) {

            if (sor.getEv() != 0) {
                if (years.containsKey(sor.getEv())) {
                    int a = years.get(sor.getEv());
                    a++;
                    years.put(sor.getEv(), a);
                } else years.put(sor.getEv(), 1);
            }
        }
        int most = 0;
        int max = 0;
        for (Map.Entry<Integer, Integer> entry : years.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                most = entry.getKey();
            }
        }

        return 0;
    }

    public static Integer whichYearHasTheMostCompleted2(BakancsLista bakancsLista) {
        List<BakancsListaElem> lista = bakancsLista.getElemek();

        int[] listatomb = new int[lista.size()];
        int i = 0;
        for (BakancsListaElem sor : lista) {
            listatomb[i] = sor.getEv();
            i++;
        }
        int ev = 0;
        int max = 0;
        for (int j = 0; j < lista.size(); j++) {
            if (listatomb[j] != 0) {
                int tempEv = 0, tempMax = 0;
                tempEv = listatomb[j];
                for (int k = j; k < lista.size(); k++) {

                    if (tempEv == listatomb[k]) {
                        tempMax++;
                        listatomb[k] = 0;
                    }
                }
                if (tempMax > max) {
                    max = tempMax;
                    ev = tempEv;
                }
            }

        }

        return 0;
    }
    /*A legkorábban teljesített elem szöveges formában (az elem toString metódusát felhasználva).
   Ha több is van, az ábécé sorrendben elsővel térjen vissza.*/

    public static BakancsListaElem theFirstThing(BakancsLista bakancsLista) {
        Integer first = 3000;
        int index = 0;
        for (BakancsListaElem sor : bakancsLista.getElemek()) {

            if (sor.getEv() != 0 && sor.getEv() < first) {
                first = sor.getEv();
            }
        }
        ArrayList<BakancsListaElem> firstElements = new ArrayList<>();
        for (BakancsListaElem sor : bakancsLista.getElemek()) {
            if (first == sor.getEv()) {
                firstElements.add(sor);
            }
        }
        for (int k = 0; k < firstElements.size() - 1; k++) {
            for (int i = 0; i < firstElements.size() - 1; i++) {
                String temp1 = firstElements.get(i).getNev();
                String temp2 = firstElements.get(i + 1).getNev();
                if (temp1.compareTo(temp2) == 1) {
                    BakancsListaElem temp = firstElements.get(i);
                    firstElements.set(i, firstElements.get(i + 1));
                    firstElements.set(i + 1, temp);
                }
            }
        }
        System.out.println("\n");
        System.out.println(firstElements);
        return firstElements.get(0);
    }

    /* Az eddig teljesített elemek átlagos költsége.*/
    public static double averageCost(BakancsLista bakancsLista) {
        int cost = 0;
        int piece = 0;
        for (BakancsListaElem sor : bakancsLista.getElemek()) {
            if (sor.getKoltseg() != 0) {
                cost = cost + sor.getKoltseg();
                piece++;
            }
        }
        if (piece == 0) {
            return 0;
        }

        double averageCost = (double) cost / piece;
        averageCost = averageCost * 100;
        averageCost = Math.round(averageCost);
        averageCost = averageCost / 100;
        return averageCost;
    }

    /* • Az összes teljesitett elem, a kipróbálás éve szerint rendezve.*/

    public static List<BakancsListaElem> allItemsSorted(BakancsLista bakancsLista) {
        List<BakancsListaElem> list = new ArrayList<>();
        for (BakancsListaElem row : bakancsLista.getElemek()) {
            if (row.getEv() != 0) {
                list.add(row);
            }
        }
        int b = list.size();
        for (int j = 0; j < list.size() - 1; j++) {

            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i).getEv() > list.get(i + 1).getEv()) {
                    BakancsListaElem temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);

                }
            }
        }

        return list;
    }

    /*Az eddig meglátogatott éttermek közül a legdrágább neve és költsége, vesszővel elválasztva.*/

    public static BakancsListaElem mostExpensive(BakancsLista bakancsLista) {
        BakancsListaElem mostExpensive = null;
        double temp = 0;
        for (BakancsListaElem row : bakancsLista.getElemek()) {
            if (row.getKoltseg() > temp && row instanceof Etterem && row.getEv() != 0) {
                mostExpensive = row;
                temp = row.getKoltseg();
            }
        }

        return mostExpensive;
    }

}
