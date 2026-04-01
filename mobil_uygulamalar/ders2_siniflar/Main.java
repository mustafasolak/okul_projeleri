public class Main {
    public static void main(String[] args) {
        Ogrenci ogrenci1 = new Ogrenci("Ahmet YORULMAZ", 15, "9-A", 'E');
        ogrenci1.bilgiGoster();

        Ogrenci ogrenci2 = new Ogrenci("Ayşe KAÇAR", 14, "9-B", 'K');
        ogrenci2.bilgiGoster();

        ogrenci1.setAdSoyad("a");
        ogrenci1.bilgiGoster();

        ogrenci1.setYas(130);
        ogrenci1.bilgiGoster();

        ogrenci1.setYas(18);
        ogrenci1.bilgiGoster();

        ogrenci1.setSinifi("9-C");
        ogrenci1.bilgiGoster();

        ogrenci1.setCinsiyet('k');
        ogrenci1.bilgiGoster();

        System.out.println("Öğrenci 1'in yaşı: " + ogrenci1.getYas());
        System.out.println("Öğrenci 1'in adı soyadı: " + ogrenci1.getAdSoyad());
        System.out.println("Öğrenci 1'in sınıfı: " + ogrenci1.getSinifi()); 
        System.out.println("Öğrenci 1'in cinsiyeti: " + ogrenci1.getCinsiyet());
    }
}
