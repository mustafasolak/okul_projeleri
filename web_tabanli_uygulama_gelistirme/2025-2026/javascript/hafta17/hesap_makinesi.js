var sayi = "";
var islem = "";
var sayi1 = 0;

function hesapla(gelen) {

    console.log("Gelen: " + gelen);
    console.log("Tipi :", typeof gelen);

    if (gelen === "C") {
        sayi = "";
        islem = "";
        document.getElementById("girilenSayi").value = "0";
        return;
    }

    if (gelen == "+") {
        sayi1 = parseInt(document.getElementById("girilenSayi").value)
        document.getElementById("girilenSayi").value = "0";
        sayi = "";
    } 
    else if (gelen == "=") {
        var sayi2 = parseInt(document.getElementById("girilenSayi").value);
        var sonuc = sayi1 + sayi2;
        document.getElementById("girilenSayi").value = sonuc;
        sayi = "";
        islem = "";
        return;
    }
    else {
        sayi = sayi + gelen;
        document.getElementById("girilenSayi").value = sayi;
    }


}