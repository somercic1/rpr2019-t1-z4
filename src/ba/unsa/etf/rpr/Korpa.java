package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Korpa extends Supermarket {
    Artikl[] korpa = new Artikl[50];

    public boolean dodajArtikl(Artikl a) {


       if()
            return true;
        else
            return false;
    }

    public Artikl[] getArtikli() {
        return this.korpa;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl izbaceni;
        for (int i = 0; i < this.korpa.length(); i++) {
            if (this.korpa[i].kod == kod)
                izbaceni=this.korpa[i];
        }
        return izbaceni;
    }

    public int dajUkupnuCijenuArtikala() {
        int ukCijena=0;
        for(int i=0; i< korpa.length(); i++)
            ukCijena=ukCijena+korpa[i].cijena;
        return ukCijena;
    }
}
