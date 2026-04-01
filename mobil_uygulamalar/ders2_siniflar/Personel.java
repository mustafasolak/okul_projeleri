class Personel {
    private String ad;
    private String soyad;
    private int yas;
    private int maas;
    private String departman;
    private int mesaaiSaati;

    private static final int UCRET_PER_SAAT = 150;
    private static final int SABIT_MAAS = 28000;

    Personel(String ad, String soyad, int yas, String departman, int mesaaiSaati) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
        this.departman = departman;
        this.mesaaiSaati = mesaaiSaati;
    }

    int maasHesapla() {
        return maas = SABIT_MAAS + (mesaaiSaati * UCRET_PER_SAAT);
    }

    void setAd(String ad) {
        if (ad.length() < 2) {
            System.out.println("Ad en az 2 karakter olmalıdır.");
            return;
        }
        this.ad = ad;
    }

    void setSoyad(String soyad) {
        if (soyad.length() < 2) {
            System.out.println("Soyad en az 2 karakter olmalıdır.");
            return;
        }
        this.soyad = soyad;
    }

    void setYas(int yas) {
        if (yas < 18 || yas > 65) {
            System.out.println("Geçersiz yaş değeri. Personel yaşı 18 ile 65 arasında olmalıdır.");
            return;
        }
        this.yas = yas;
    }

    void setDepartman(String departman) {
        if (departman.length() < 3) {
            System.out.println("Departman adı en az 3 karakter olmalıdır.");
            return;
        }
        this.departman = departman;

    }

    void setCalismaSaati(int calismaSaati) {
        if (calismaSaati < 0 || calismaSaati > 24) {
            System.out.println("Çalışma saati 0 ile 24 arasında olmalıdır.");
            return;
        }
        this.mesaaiSaati = mesaaiSaati;
    }

    String getAd() {
        return ad;
    }

    String getSoyad() {
        return soyad;
    }

    int getYas() {
        return yas;
    }

    int getMaas() {
        return maas;
    }

    String getDepartman() {
        return departman;
    }

    int getMesaaiSaati() {
        return mesaaiSaati;
    }

    void bilgiGoster() {
        System.out.println("Ad: " + ad);
        System.out.println("Soyad: " + soyad);
        System.out.println("Yaş: " + yas);
        System.out.println("Maaş: " + maas);
        System.out.println("Departman: " + departman);
        System.out.println("Mesaai Saati: " + mesaaiSaati);
        System.out.println("-----------------------------");
    }

}