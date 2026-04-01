public class Arac {
    private String marka;
    private String model;
    private int yil;
    private String renk;
    private int kilometre;
    private double genislik;

    Arac(String marka, String model, int yil, String renk, int kilometre, double genislik) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
        this.renk = renk;
        this.kilometre = kilometre;
        this.genislik = genislik;
    }

    void ileriGit(){
        System.out.println("Araç ileri gidiyor...");
    }

    void hizlan(){
        System.out.println("Araç hızlanıyor...");
    }
    
    void dur(){
        System.out.println("Araç duruyor...");
    }   

    void setMarka(String marka) {
        if (marka.length() < 2) {
            System.out.println("Marka en az 2 karakter olmalıdır.");
            return;
        }
        this.marka = marka;
    }

    void setModel(String model) {
        if (model.length() < 2) {
            System.out.println("Model en az 2 karakter olmalıdır.");
            return;
        }
        this.model = model;
    }

    void setYil(int yil) {
        if (yil < 1886 || yil > 2024) {
            System.out.println("Geçersiz yıl değeri. Araç yılı 1886 ile 2024 arasında olmalıdır.");
            return;
        }
        this.yil = yil;
    }

    void setRenk(String renk) {
        if (renk.length() < 3) {
            System.out.println("Renk en az 3 karakter olmalıdır.");
            return;
        }
        this.renk = renk;
    }

    void setKilometre(int kilometre) {
        if (kilometre < 0) {
            System.out.println("Kilometre negatif olamaz.");
            return;
        }
        this.kilometre = kilometre;
    }

    void setGenislik(double genislik) {
        if (genislik <= 0) {
            System.out.println("Genişlik sıfır veya negatif olamaz.");
            return;
        }
        this.genislik = genislik;
    }

    String getMarka() {
        return marka;
    }

    String getModel() {
        return model;
    }

    int getYil() {
        return yil;
    }

    String getRenk() {
        return renk;
    }

    int getKilometre() {
        return kilometre;
    }

    double getGenislik() {
        return genislik;
    }




}
