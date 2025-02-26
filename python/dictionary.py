# Sözlük veri tipi
# Sözlük içinde veriler anahtar : değer şeklinde tutulur
bilgiler = {
    "ad"    : "Mustafa", 
    "soyad" : "SOLAK", 
    "yas"   : 18,
    "sehir" : "Manisa"
}

print(bilgiler)

print(bilgiler["ad"])

print(bilgiler["soyad"])

print(bilgiler["yas"])

# Sözlüğün içindeki anahtarları yazdırma
print(bilgiler.keys())

# Sözlüğün içindeki değerleri yazdırma
print(bilgiler.values())

print(bilgiler["sehir"])

print("Önce", bilgiler)

# Manisa değerini İzmir olarak değiştirelim
bilgiler["sehir"] = "İzmir"

print("Sonra", bilgiler)
print(bilgiler["sehir"])

# in kullanımı
# soyad anahtarı bilgiler sözlüğünde var mı ?
print("soyad" in bilgiler)

# meslek anahtarı bilgiler sözlüğünde var mı ?
print("meslek" in bilgiler)

# Sözlüğün eleman sayısını bulma
print(len(bilgiler))

# Yeni eleman ekleme
bilgiler["meslek"] = "Öğretmen"
bilgiler["cinsiyet"] = "E"
print(bilgiler)

# Eleman silme
bilgiler.pop("cinsiyet")
print("Silmeden sonra :",bilgiler)

# Sözlüğü kopyalama
kopyalanan_bilgiler = bilgiler.copy()

# Sözlüğün içindeki tüm elemanları silme
bilgiler.clear()
print("Clear işleminden sonra :", bilgiler)

print(kopyalanan_bilgiler)