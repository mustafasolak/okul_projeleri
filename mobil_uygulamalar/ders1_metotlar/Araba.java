public class Araba{

    // Bunlar araba sınıfının özellikleri -değişkenleri
    String marka;
    String renk;
    int yil;
    double kilometre;

    // Bunlar araba sınıfının davranışları -metotları
    void bilgiYazdir(){
        System.out.println("------------------------------");
        System.out.println("Araba Bilgileri:");
        System.out.println("Araba Markası: " + marka);
        System.out.println("Araba Rengi: " + renk);
        System.out.println("Araba Yılı: " + yil);
        System.out.println("Araba Kilometresi: " + kilometre);
        System.out.println("------------------------------");
    }
    
    void calistir(){
        System.out.println("Araba çalıştı.");
    }

    void durdur(){
        System.out.println("Araba durdu.");
    }

    void ileriGit(){
        System.out.println("Araba ileri gitti.");
    }

    void geriGit(){
        System.out.println("Araba geri gitti.");
    }

    void hizlan(){
        System.out.println("Araba hızlandı.");
    }

    void yavasla(){
        System.out.println("Araba yavaşladı.");
    }

}