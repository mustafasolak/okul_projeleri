public class Taksi extends Arac {
    private double fiyat;
    private boolean taksimetre;

    Taksi(String marka, String model, int yil, String renk, int kilometre, double fiyat, boolean taksimetre) {
        super(marka, model, yil, renk, kilometre, 0); // Genişlik 0 olarak ayarlanıyor
        this.fiyat = fiyat;
        this.taksimetre = taksimetre;
    }

    void setFiyat(double fiyat) {
        if (fiyat < 0) {
            System.out.println("Fiyat negatif olamaz.");
            return;
        }
        this.fiyat = fiyat;
    }

    double getFiyat() {
        return fiyat;
    }

    void setTaksimetre(boolean taksimetre) {
        this.taksimetre = taksimetre;
    }

    boolean getTaksimetre() {
        return taksimetre;
    }


}