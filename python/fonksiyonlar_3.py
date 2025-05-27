# Fonksiyonlar ile hesap makinesi

sayi1 = sayi2 = 0

def menu():
    print("=== MENÜ ===")
    print("--- 1-Toplama ---")
    print("--- 2-Çıkarma ---")  
    print("--- 3-Çarpma ---")
    print("--- 4-Bölme ---")

def sayi_iste():
    global sayi1, sayi2
    sayi1 = int(input("1. Sayı = "))
    sayi2 = int(input("2. Sayı = "))
    
def sayilari_goster():
    print("Girilen 1.Sayı : ", sayi1)
    print("Girilen 2.Sayı : ", sayi2)

def toplama():
    sonuc = sayi1 + sayi2
    print("Toplama Sonucu : ", sonuc)

def cikarma():
    sonuc = sayi1 - sayi2
    print("Çıkarma Sonucu : ", sonuc)

def carpma():
    sonuc = sayi1 * sayi2
    print("Çarpma Sonucu : ", sonuc)

def bolme():
    sonuc = sayi1 / sayi2
    print("Bölme Sonucu : ", sonuc)

def mod_alma():
    sonuc = sayi1 % sayi2
    print("Mod Alma Sonucu : ", sonuc)

menu()    
sayi_iste()
sayilari_goster()
toplama()
cikarma()
carpma()
bolme()
mod_alma()