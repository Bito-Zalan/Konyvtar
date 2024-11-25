package hu.szamalk;

import java.util.ArrayList;

public class Konyvtar {
    private ArrayList<Konyv> konyvek = new ArrayList<>();

    public Konyvtar(){
        this(new ArrayList<>());
    }
    public Konyvtar(ArrayList<Konyv> konyvek) {
        this.konyvek = konyvek;
    }

    public void ujKonyv(Konyv konyv){
        konyvek.add(konyv);
    }

    //melyik a legdrágább könyv?
    //progtétellel:
    public Konyv legdragabb(){
        int legdragabb = 0;
        //for (Konyv konyv : konyvek)
        for (int i = 0; i < konyvek.size(); i++){
            if(konyvek.get(legdragabb).getAr() < konyvek.get(i).getAr());
            legdragabb = i;
        }
        return konyvek.get(legdragabb);
    }

    //van köztük kölcsönözhető 2000-es kiadású?
    public Konyv kolcsonozhetoKetezres(){
        boolean van;
        for (Konyv konyv : konyvek){
            //if (konyv.isKolcsonozheto() = true && konyv.getKiadaseve() = 2000)
        }
        return null;
    }


}
