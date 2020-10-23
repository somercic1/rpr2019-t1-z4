package ba.unsa.etf.rpr;



public class Supermarket {
    Artikl[] artikli = new Artikl[1000];

    public Artikl[] getArtikli() {
        return this.artikli;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl prazan=null;
        for (int i = 0; i < this.artikli.length; i++) {
            if (this.artikli[i].kod.equals(kod))
                return this.artikli[i];
        }
        return prazan;
    }

    public boolean dodajArtikl(Artikl biciklo) {
        for(int i=0;i<artikli.length; i++){
            if(artikli[i]==null) {
                artikli[i] = biciklo;
                return true;
            }
        }
        return false;
    }
}

