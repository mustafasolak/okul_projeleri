class Ogrenci{
    private String adSoyad;
    private int yas;
    private String sinifi;
    private char cinsiyet;

    Ogrenci(String adSoyad, int yas, String sinifi, char cinsiyet){
       this.adSoyad = adSoyad;
        this.yas = yas;
        this.sinifi = sinifi;
        this.cinsiyet = cinsiyet;
    }

    void setAdSoyad(String adSoyad){
        if(adSoyad.length() < 3){
            System.out.println("Ad Soyad en az 3 karakter olmalıdır.");
            return;
        }
        this.adSoyad = adSoyad;
    }

    void setYas(int yas){
        if(yas < 0 || yas > 120){
            System.out.println("Geçersiz yaş değeri.");
            return;
        }
        this.yas = yas;
    }

    void setSinifi(String sinifi){
        if(sinifi.length() < 3){
            System.out.println("Sınıf en az 3 karakter olmalıdır.");
            return;
        }
        if(!sinifi.contains("-")){
            System.out.println("Sınıf formatı geçersiz. Örnek: 9-A");
            return;
        }
        this.sinifi = sinifi;
    }

    void setCinsiyet(char cinsiyet){
        cinsiyet = Character.toUpperCase(cinsiyet);
        if(cinsiyet != 'E' && cinsiyet != 'K'){
            System.out.println("Cinsiyet sadece 'E' veya 'K' olabilir.");
            return;
        }
        this.cinsiyet = cinsiyet;
    }

    int getYas(){
        return yas;
    }

    String getAdSoyad(){
        return adSoyad;
    }

    String getSinifi(){
        return sinifi;
    }

    char getCinsiyet(){
        return cinsiyet;
    }

    void bilgiGoster(){
        System.out.println("Ad Soyad: " + adSoyad);
        System.out.println("Yaş: " + yas);
        System.out.println("Sınıf: " + sinifi);
        System.out.println("Cinsiyet: " + cinsiyet);
        System.out.println("-----------------------------");
    }


}