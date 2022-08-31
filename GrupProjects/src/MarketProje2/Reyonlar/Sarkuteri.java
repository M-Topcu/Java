package Reyonlar;

import java.util.HashMap;
import java.util.Map;

public class Sarkuteri implements Market{

    static Sarkuteri obj=new Sarkuteri();
    Map<Integer,Map<String,String>> sarkuteri=new HashMap<>();
    Map<String,String> yumurta=new HashMap<>();
    Map<String,String> kasar=new HashMap<>();
    Map<String,String> beyazPeynir=new HashMap<>();
    Map<String,String> zeytin=new HashMap<>();
    Map<String,String> salam=new HashMap<>();
    Map<String,String> sucuk=new HashMap<>();


    @Override
    public void urunBilgiMapOlustur() {
        yumurta.put("isim","Yumurta");
        yumurta.put("fiyat","2.9");

        kasar.put("isim","Kasar");
        kasar.put("fiyat","5.5");

        beyazPeynir.put("isim","Beyaz Peynir");
        beyazPeynir.put("fiyat","6.0");

        zeytin.put("isim","Zeytin");
        zeytin.put("fiyat","1.99");

        salam.put("isim","Salam");
        salam.put("fiyat","2.45");

        sucuk.put("isim","Sucuk");
        sucuk.put("fiyat","9.99");



        sarkuteri.put(2001,yumurta);
        sarkuteri.put(2002,kasar);
        sarkuteri.put(2003,beyazPeynir);
        sarkuteri.put(2004,zeytin);
        sarkuteri.put(2005,salam);
        sarkuteri.put(2006,sucuk);



    }

    @Override
    public void listeYazdir() {

        System.out.println("URUN ID     FIYAT     ISIM\n=====================================");
        for (Map.Entry<Integer,Map<String,String>> each : sarkuteri.entrySet()) {

            System.out.println(each);
        }

    }
}
