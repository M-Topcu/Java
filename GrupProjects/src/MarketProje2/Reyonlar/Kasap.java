package Reyonlar;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Kasap implements Market{

    static Kasap obj=new Kasap();

   Map<Integer,Map<String,String>> kasap=new HashMap<>();

    Map<String,String> incik=new HashMap<>();
    Map<String,String> kiyma=new HashMap<>();
    Map<String,String> butunTavuk=new HashMap<>();
    Map<String,String> kusbasiDana=new HashMap<>();
    Map<String,String> kusbasiKuzu=new HashMap<>();



    @Override
    public void urunBilgiMapOlustur() {
        incik.put("isim","Incik");
        incik.put("fiyat","4.85");

        kiyma.put("isim","Kiyma");
        kiyma.put("fiyat","12.5");

        butunTavuk.put("isim","Butun Tavuk");
        butunTavuk.put("fiyat","6.0");

        kusbasiDana.put("isim","Kusbasi Dana");
        kusbasiDana.put("fiyat","13.99");

        kusbasiKuzu.put("isim","Kusbasi Kuzu");
        kusbasiKuzu.put("fiyat","14.45");

        kasap.put(3001,incik);
        kasap.put(3002,kiyma);
        kasap.put(3003,butunTavuk);
        kasap.put(3004,kusbasiDana);
        kasap.put(3005,kusbasiKuzu);


    }

    @Override
    public void listeYazdir() {

        System.out.println("URUN ID     FIYAT     ISIM\n=====================================");
        for (Map.Entry<Integer,Map<String,String>> each : kasap.entrySet()) {

            System.out.println(each);
        }



    }


}
