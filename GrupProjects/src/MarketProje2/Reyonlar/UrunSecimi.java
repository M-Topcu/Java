package Reyonlar;

public class UrunSecimi {

    static String isim;
    static double fiyat;

    public static void urunSecimi(int secim) throws InterruptedException {

        System.out.println("=============================");
        Thread.sleep(2000);
        System.out.println("Secmek istediginiz urun id sini giriniz");

        double urunId = SecimMethodlari.secim();

        while (true) {
            if (urunId != (int) urunId) {
                System.out.println("Lutfen gecerli id giriniz!!");
                urunId = SecimMethodlari.secim();
            } else break;
        }

        Integer IdSecim = (int) urunId;

        try {
            switch (secim) {
                case 1:
                    isim = Manav.obj.manav.get(IdSecim).get("isim");
                    fiyat = Double.parseDouble(Manav.obj.manav.get(IdSecim).get("fiyat"));
                    break;
                case 2:
                    isim = Kasap.obj.kasap.get(IdSecim).get("isim");
                    fiyat = Double.parseDouble(Kasap.obj.kasap.get(IdSecim).get("fiyat"));
                    break;
                case 3:
                    isim = Sarkuteri.obj.sarkuteri.get(IdSecim).get("isim");
                    fiyat = Double.parseDouble(Sarkuteri.obj.sarkuteri.get(IdSecim).get("fiyat"));
                    break;
            }
        } catch (Exception e) {
            System.out.println("gecersiz id girdiniz");
            urunSecimi(secim);
        }

        System.out.println("Kac kilo/adet istersiniz ");
        double kiloAdet = SecimMethodlari.secim();
        double toplam = fiyat * kiloAdet;
        String secilenUrunBilgisi = isim + " ==> " + kiloAdet + " kilo/adet x " + fiyat + " Euro = " + toplam+" Euro";
        System.out.println(secilenUrunBilgisi);




    }
}
