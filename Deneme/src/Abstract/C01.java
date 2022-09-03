package Abstract;

public abstract class C01 {

    void toplama(){
        // abstract olmayan methodlara concrete method denir
        System.out.println("Bu method toplama yapar");
    }

    abstract void carpma();
    /*
    Bir methodun basina abstract yazarsak bu methodun child classlar icin bir standart oldugunu deklare ederiz
    ve method bodysine gerek olmaz, body koyarsak altini cizer
     */


}
