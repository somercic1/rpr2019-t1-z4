package ba.unsa.etf.rpr;



public class Korpa  {
    Artikl[] korpa = new Artikl[50];



    public Artikl[] getArtikli() {
        return this.korpa;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl izbaceni=null;
        for (int i = 0; i < this.korpa.length; i++) {
            if (this.korpa[i].kod.equals(kod))
                return this.korpa[i];
        }
        return izbaceni;
    }

    public boolean dodajArtikl(Artikl biciklo) {
        for(int i=0; i < this.korpa.length; i++){
            if(this.korpa[i]==null) {
                this.korpa[i] = biciklo;
                return true;
            }
        }
        return false;
    }

    public int dajUkupnuCijenuArtikala() {
        int ukCijena=0;
        for(int i=0; i < this.korpa.length; i++){
            if(this.korpa[i]!=null)
                ukCijena=ukCijena+korpa[i].cijena;
        }

        return ukCijena;
    }
}
