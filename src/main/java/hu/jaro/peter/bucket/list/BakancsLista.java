package hu.jaro.peter.bucket.list;

import java.util.ArrayList;
import java.util.List;

/**
 * 3. Hozzon létre egy BakancsLista osztályt, melynek mezői:
 *    
 *    megnevezes (szöveges)
 *    
 *    elemek (BakancsListaElem objektumok listája)
 *    A megnevezés legyen csak olvasható, a konstruktorban kapjon értéket!
 *    A lista az objektum létrehozásakor jöjjön létre, de később is legyen lehetőség az elemek megtekintésére
 *    és a lista tartalmának módosítására, kívülről is!*/
public class BakancsLista {

    private final String megnevezes;

    private List<BakancsListaElem> elemek;

    public BakancsLista(String megnevezes) {
        this.megnevezes = megnevezes;
        this.elemek = new ArrayList<>();
     }

    public String getMegnevezes() {
        return megnevezes;
    }

    public List<BakancsListaElem> getElemek() {
        return elemek;
    }

    public void setElemek(ArrayList<BakancsListaElem> elemek) {
        this.elemek = elemek;

    }

    @Override
    public String toString() {
        return   megnevezes + " " + elemek +" \n"
                ;
    }
}
