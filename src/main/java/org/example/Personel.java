package org.example;

public class Personel {
    String personelAdi;
    int calistigiGunSayisi;
    int gunlukUcret;

    public Personel(String personelAdi, int calistigiGunSayisi, int gunlukUcret) {
        this.personelAdi = personelAdi;
        this.calistigiGunSayisi = calistigiGunSayisi;
        this.gunlukUcret = gunlukUcret;
    }


    public int maasHesapla() {
        return (calistigiGunSayisi > 25) ? (gunlukUcret * 25) + (calistigiGunSayisi - 25) * 1000 : calistigiGunSayisi * gunlukUcret;
    }

    public void printDetails() {
        System.out.println(personelAdi);
        System.out.println(maasHesapla());
    }
}
