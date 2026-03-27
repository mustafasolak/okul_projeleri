public class Main {

    public static void main(String[] args) {
        System.out.println("Main metodu calisti");

        Ogrenci ogrenci1 = new Ogrenci("Ahmet", "YILMAZ", 18, "12-A");
        ogrenci1.bilgiYazdir();

        Ogrenci ogrenci2 = new Ogrenci("Ayşe", "KAYA", 17, "11-B");
        ogrenci2.bilgiYazdir();

        // Araba sınıfından bir nesne oluşturuyoruz
        Araba araba1 = new Araba();
        araba1.marka = "Toyota";
        araba1.renk = "Kırmızı";
        araba1.yil = 2020;
        araba1.kilometre = 13814.5;
        araba1.bilgiYazdir();

        Araba araba2 = new Araba();
        araba2.marka = "Volkswagen";
        araba2.renk = "Beyaz";
        araba2.yil = 2019;
        araba2.kilometre = 20000.0;
        araba2.bilgiYazdir();

    }
}
