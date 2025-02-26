# Burada bir kitap listesi tanımlayın
kitaplar = []

while True :
    print("\t\t\t===== MENÜ =====")
    print("\t\t\t==> 1-Kitap Ekle")
    print("\t\t\t==> 2-Kitap Ara")
    print("\t\t\t==> 3-Kitap Listele")
    print("\t\t\t==> 4-Kitap Sil")
    print("\t\t\t==> 5-Çıkış")

    secim = int(input("\n\t\t\tSeçiminiz : "))

    if secim == 1:
        print("\t\t\t==> Kitap ekleme işlemi")
        kitapAdi = input("\t\t\t==> Kitabın adı = ")
        kitaplar.append(kitapAdi)
        print("\t\t\t==> Kitap başarıyla eklendi.\n\n")
        #kodlarınız buraya yazılacak
    elif secim == 2:
        print("Kitap arama işlemi")
        #kodlarınız buraya yazılacak
    elif secim == 3:
        print("\t\t\t==> Kitap listeleme işlemi")
        print("\t\t\t==> ==== TÜM KİTAPLAR ===")
        for kitap in kitaplar:
            print("\t\t\t==>",kitap)
        print("\n")
        #kodlarınız buraya yazılacak
    elif secim == 4:
        print("Kitap silme işlemi")
        #kodlarınız buraya yazılacak
    elif secim == 5:
        print("Çıkış yapılıyor...")
        break # Programı durdur
    else:
        print("1/2/3/4 dışında bir değer girdiniz !")