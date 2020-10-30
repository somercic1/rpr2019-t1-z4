package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void getBrojUbacenih() {
        Supermarket s= new Supermarket();
        Artikl a= new Artikl("Biciklo", 3, "12");
        s.dodajArtikl(a);
        assertEquals(1, s.getBrojUbacenih());
    }

    @Test
    void setBrojUbacenih() {
        Supermarket k=new Supermarket();
        Artikl a= new Artikl("Biciklo", 3, "12");
        Artikl b= new Artikl("Traktor", 10000, "14");
        Artikl c= new Artikl("Motor", 2000, "13");
        k.dodajArtikl(a);
        k.dodajArtikl(b);

        k.setBrojUbacenih(3);
        assertEquals(3,k.getBrojUbacenih());
    }

    @Test
    void getArtikli() {
        Supermarket niz= new Supermarket();
        Supermarket k=new Supermarket();
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
        Supermarket k=new Supermarket();
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
        Supermarket k= new Supermarket();
        Artikl a= new Artikl("Biciklo", 3, "12");
        boolean b=true;
        assertEquals(b, k.dodajArtikl(a));
    }
}