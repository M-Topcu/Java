package Overriding;

public class Araba {
    protected String hareket = "Arabalar teker ile hareket eder";
    protected String hiz = "Arabalar motor gucune gore hiz yapar";
    protected String yakit = "Arabalar farkli yakitlar kullanabilir";
    protected String marka = "Arabalar uretildikleri markaya sahiptir";

    public void motor(){
        System.out.println("Arabalar farkli markalarda motor kullanirlar");
    }

    public void yakitTukemi(){
        System.out.println("Arabalar motor gucu ve yakit turune ore yakit tuketirler");
    }

}
