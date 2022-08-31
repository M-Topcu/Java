package Reyonlar;


import java.util.Scanner;

public class SecimMethodlari {
    static Scanner scan=new Scanner(System.in);

    public static double secim(){
        double secim=0;
        do {
            try {
                secim =scan.nextDouble();
                break;
            } catch (Exception e) {
                System.out.println("Lutfen numara giriniz!");
            }
            if (secim<0){
                System.out.println("Lutfen gecerli bir secim giriniz!");
            }else break;

        }while (true);
      return secim;
    }
    public static int tamamDevam(){

        System.out.println("Lutfen secmek giriniz...\n" +
                "                     1- Devam\n" +
                "                     2- Bilgileri yeniden gir\n" +
                "                     3- Ana Menu");
       int donus= ucluSecim();

      return donus;

    }

    public static int ucluSecim(){
        double secim= secim();
        do {
            if (secim!=(int)secim && secim<1 && secim>3){
                System.out.println("Lutfen gecerli secimi yapiniz!!");
                secim= SecimMethodlari.secim();
            }else break;
        }while (true);

        return (int) secim;
    }

}
