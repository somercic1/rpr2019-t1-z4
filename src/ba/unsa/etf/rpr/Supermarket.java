package ba.unsa.etf.rpr;


import java.util.Arrays;

public class Supermarket {
    private Artikl[] artikli = new Artikl[1000];
    private Artikl[] pomocniArtikli= new Artikl[1000];
    private int brojUbacenih = 0;


    public int getBrojUbacenih() {
        return brojUbacenih;
    }

    public void setBrojUbacenih(int brojUbacenih) {
        this.brojUbacenih = brojUbacenih;
    }

    public Artikl[] getArtikli() {

        return artikli;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        int j=0;
        Artikl izbaceni=null;
        for (int i = 0; i < getBrojUbacenih(); i++) {
            if (artikli[i].getKod().equals(kod)) {
                izbaceni = artikli[i];
                continue;
            }
            pomocniArtikli[j++]=artikli[i];


        }
        artikli= Arrays.copyOf(pomocniArtikli, pomocniArtikli.length);
        setBrojUbacenih(getBrojUbacenih()-1);

        return izbaceni;
    }

    public boolean dodajArtikl(Artikl biciklo) {
        if (brojUbacenih < artikli.length) {
            artikli[brojUbacenih] = biciklo;
            setBrojUbacenih(brojUbacenih + 1);
            return true;
        }
        return false;
    }
}

