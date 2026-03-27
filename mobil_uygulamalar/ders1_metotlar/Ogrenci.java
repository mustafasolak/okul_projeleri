public class Ogrenci {
    String ad;
    String soyad;
    int yas;
    String sinif;

    Ogrenci(String ad,String soyad, int yas, String sinif){
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
        this.sinif = sinif;
    }

    void bilgiYazdir(){
        System.out.println("------------------------------");
        System.out.println("Öğrenci Bilgileri:");
        System.out.println("Ad: " + ad);
        System.out.println("Soyad: " + soyad);
        System.out.println("Yaş: " + yas);
        System.out.println("Sınıf: " + sinif);
        System.out.println("------------------------------");
    }

}
