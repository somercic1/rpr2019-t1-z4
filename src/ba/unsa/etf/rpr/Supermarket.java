package ba.unsa.etf.rpr;



public class Supermarket {
    Artikl[] artikli = new Artikl[1000];

    public Artikl[] getArtikli() {
        return this.artikli;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl izbaceni;
        for (int i = 0; i < this.artikli.length(); i++) {
            if (this.artikli[i].kod == kod)
                izbaceni=this.artikli[i];
        }
        return izbaceni;
    }

    public void dodajArtikl(Artikl biciklo) {

    }
}

