package ba.unsa.etf.rpr;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


import static org.junit.jupiter.api.Assertions.assertEquals;


class KorpaTest {

    @Test
    void getUbacenih() {
        Korpa k = new Korpa();
        Artikl a= new Artikl("Biciklo", 3, "12");
        Artikl b= new Artikl("Traktor", 10000, "14");
        k.dodajArtikl(a);
        k.dodajArtikl(b);
        assertEquals(2, k.getUbacenih());

    }

    @Test
    void setUbacenih() {
        Korpa k=new Korpa();
        Artikl a= new Artikl("Biciklo", 3, "12");
        Artikl b= new Artikl("Traktor", 10000, "14");
        Artikl c= new Artikl("Motor", 2000, "13");
        k.dodajArtikl(a);
        k.dodajArtikl(b);

        k.setUbacenih(3);
        assertEquals(3,k.getUbacenih());
    }

    @Test
    void getArtikli() {
        Korpa niz= new Korpa();
        Korpa k=new Korpa();
        Artikl a= new Artikl("Biciklo", 3, "12");
        Artikl b= new Artikl("Traktor", 10000, "14");
        Artikl c= new Artikl("Motor", 2000, "13");
        k.dodajArtikl(a);
        k.dodajArtikl(b);
        k.dodajArtikl(c);
        niz.dodajArtikl(a);
        niz.dodajArtikl(b);
        niz.dodajArtikl(c);
        assertArrayEquals(niz.getArtikli(), k.getArtikli());
    }

    @Test
    void izbaciArtiklSaKodom() {
        Korpa k=new Korpa();
        Artikl a= new Artikl("Biciklo", 3, "12");
        Artikl b= new Artikl("Traktor", 10000, "14");
        Artikl c= new Artikl("Motor", 2000, "13");
        k.dodajArtikl(a);
        k.dodajArtikl(b);
        k.dodajArtikl(c);
        assertEquals(a,k.izbaciArtiklSaKodom("12"));

    }

    @Test
    void dodajArtikl() {
        Korpa k= new Korpa();
        Artikl a= new Artikl("Biciklo", 3, "12");
        boolean b=true;
        assertEquals(b, k.dodajArtikl(a));

    }

    @Test
    void dajUkupnuCijenuArtikala() {
        int ukupna=3;
        Korpa k= new Korpa();
        Artikl a= new Artikl("Biciklo", 3, "12");
        k.dodajArtikl(a);
        assertEquals(3,k.dajUkupnuCijenuArtikala());


    }
}