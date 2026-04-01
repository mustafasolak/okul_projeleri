public class Kamyon extends Arac {
    private double yuk;
    
    Kamyon(String marka, String model, int yil, String renk, int kilometre, double yuk) {
        super(marka, model, yil, renk, kilometre , 0); // Genişlik 0 olarak ayarlanıyor
        this.yuk = yuk;
    }

    void setYuk(double yuk) {
        if (yuk < 0) {
            System.out.println("Yük negatif olamaz.");
            return;
        }
        this.yuk = yuk;
    }

    double getYuk() {
        return yuk;
    }
}