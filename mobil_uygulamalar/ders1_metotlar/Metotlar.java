class Metotlar {
    
    public static void main(String[] args) {
        System.out.println("main metodu calisti");
        yazdir();
        topla();
        System.out.println( "Sonuc : " + toplaDondur() );
    }
    
    public static int toplaDondur(){
        int sayi1 = 9;
        int sayi2 = 12;
        int sonuc = sayi1 + sayi2;
        return sonuc;
    }
   
    public static void topla(){
        int sayi1 = 5;
        int sayi2 = 8;
        int sonuc = sayi1 + sayi2;
        System.out.println("Toplam :" + sonuc);
    }
    
     public static void yazdir(){
        System.out.println("Merhabalar, ben geriye deger dondurmeyen void tipinde bir fonksiyonum.");
    }
    
}

