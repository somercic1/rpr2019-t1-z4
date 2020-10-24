package ba.unsa.etf.rpr;


import java.util.Arrays;

public class Korpa  {
    private Artikl[] korpa = new Artikl[50];
    private Artikl[] novaKorpa= new Artikl[50];

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
        int j=0;
        Artikl izbaceni=null;
        for (int i = 0; i < getUbacenih(); i++) {
            if (korpa[i].getKod().equals(kod)) {
                izbaceni = korpa[i];
                continue;
            }
            novaKorpa[j++]=korpa[i];


        }
        korpa= Arrays.copyOf(novaKorpa, novaKorpa.length);
        setUbacenih(getUbacenih()-1);

    return izbaceni;
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
