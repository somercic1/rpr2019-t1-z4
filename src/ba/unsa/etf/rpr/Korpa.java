package ba.unsa.etf.rpr;



public class Korpa  {
    private Artikl[] korpa = new Artikl[50];
    private int ubacenih=0;

    public int getUbacenih() {
        return ubacenih;
    }

    public void setUbacenih(int ubacenih) {
        this.ubacenih = ubacenih;
    }

    public Artikl[] getArtikli() {
        return korpa;
    }



    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl nePostoji=null;
        for (int i = 0; i < getUbacenih(); i++) {
            if (korpa[i].getKod().equals(kod))
                return korpa[i];

        }


    return nePostoji;
    }


    public boolean dodajArtikl(Artikl biciklo) {
        if(getUbacenih() < korpa.length){
            korpa[getUbacenih()]=biciklo;
            setUbacenih(getUbacenih()+1);
            return true;
            }
        return false;
    }

    public int dajUkupnuCijenuArtikala() {
        int ukCijena=0;
        for(int i=0; i < getUbacenih(); i++){
                ukCijena=ukCijena+korpa[i].getCijena();
        }

        return ukCijena;
    }
}
