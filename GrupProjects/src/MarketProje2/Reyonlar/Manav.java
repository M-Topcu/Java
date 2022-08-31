package Reyonlar;

import java.util.HashMap;
import java.util.Map;

public class Manav implements Market{
    static Manav obj=new Manav();
    Map<Integer,Map<String,String>> manav=new HashMap<>();
    Map<String,String> domates=new HashMap<>();
    Map<String,String> biber=new HashMap<>();
    Map<String,String> sogan=new HashMap<>();
    Map<String,String> patlican=new HashMap<>();
    Map<String,String> elma=new HashMap<>();
    Map<String,String> armut=new HashMap<>();
    Map<String,String> muz=new HashMap<>();
    Map<String,String> patetes=new HashMap<>();
    Map<String,String> karpuz=new HashMap<>();
    Map<String,String> limon=new HashMap<>();
    Map<String,String> pirasa=new HashMap<>();
    Map<String,String> ananas=new HashMap<>();
    Map<String,String> pepino=new HashMap<>();
    Map<String,String> avakado=new HashMap<>();

    @Override
    public void urunBilgiMapOlustur() {
        domates.put("isim","Domates");
        domates.put("fiyat","2.5");

        biber.put("isim","Biber");
        biber.put("fiyat","3.5");

        sogan.put("isim","Sogan");
        sogan.put("fiyat","1.0");

        patlican.put("isim","Patlican");
        patlican.put("fiyat","1.5");

        elma.put("isim","Elma");
        elma.put("fiyat","1.5");

        armut.put("isim","Armut");
        armut.put("fiyat","3.5");

        muz.put("isim","Muz");
        muz.put("fiyat","1.6");

        patetes.put("isim","Patetes");
        patetes.put("fiyat","0.9");

        karpuz.put("isim","Karpuz");
        karpuz.put("fiyat","0.85");

        limon.put("isim","Limon");
        limon.put("fiyat","2.5");

        pirasa.put("isim","Pirasa");
        pirasa.put("fiyat","1.2");

        ananas.put("isim","Ananas");
        ananas.put("fiyat","2.2");

        pepino.put("isim","Pepino");
        pepino.put("fiyat","1.70");

        avakado.put("isim","Avakado");
        avakado.put("fiyat","2.10");

      manav.put(1001,domates);
      manav.put(1002,biber);
      manav.put(1003,patlican);
      manav.put(1004,elma);
      manav.put(1005,armut);
      manav.put(1006,muz);
      manav.put(1007,patetes);
      manav.put(1008,karpuz);
      manav.put(1009,limon);
      manav.put(1010,pirasa);
      manav.put(1011,ananas);
      manav.put(1012,pepino);
      manav.put(1013,avakado);



    }

    @Override
    public void listeYazdir() {
        System.out.println("URUN ID     FIYAT     ISIM\n=====================================");
        for (Map.Entry<Integer,Map<String,String>> each : manav.entrySet()) {

            System.out.println(each);
        }
    }
}
