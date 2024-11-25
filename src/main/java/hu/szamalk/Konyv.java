package hu.szamalk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Konyv {

    private String cim;
    private ArrayList<String> szerzok;
    private int ev;
    private int ar;
    private boolean kolcsonozheto;


    public Konyv(String cim, String szerzo,int ev){

        szerzok.add(szerzo);

    }
    public Konyv(String cim,ArrayList<String> szerzok, int ev, int ar) {
      this(cim,szerzok,ev,ar,true);
    }

    public Konyv(String cim,ArrayList<String> szerzok, int ev, int ar, boolean kolcsonozheto) {
        this.cim = cim;
        this.ev = ev;
        this.ar = ar;
        this.szerzok = szerzok;
        this.kolcsonozheto = kolcsonozheto;
    }

    public String getCim() {
        return cim;
    }

    public int getKiadaseve() {
        return ev;
    }

    public int getAr() {
        return ar;
    }

    //nem modosithato lista beállitása
    public List<String> getSzerzok(){
        return Collections.unmodifiableList(szerzok);
    }

    public boolean isKolcsonozheto() {
        return kolcsonozheto;
    }

    @Override
    public String toString() {
        return "Konyv{" +
                "cim='" + cim + '\'' +
                ", kiadaseve=" + ev +
                ", ar=" + ar +
                ", szerzok=" + szerzok +
                ", kolcsonozheto=" + kolcsonozheto +
                '}';
    }
}

