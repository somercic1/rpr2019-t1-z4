package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArtiklTest {


    @Test

    void testKonstruktora() {
        Artikl a= new Artikl("Biciklo", 3, "12");
        assertEquals("Biciklo", a.getNaziv());
        assertEquals(3, a.getCijena());
        assertEquals("12", a.getKod());
    }
    @Test
    void getNaziv() {
        Artikl a= new Artikl("Biciklo", 3, "12");
        assertEquals("Biciklo", a.getNaziv());
    }

    @Test
    void setCijena() {
        Artikl a= new Artikl("Biciklo", 3, "12");
        a.setCijena(15);
        assertEquals(15, a.getCijena());
    }

    @Test
    void setNaziv() {
        Artikl a= new Artikl("Biciklo", 3, "12");
        a.setNaziv("Traktor");
        assertEquals("Traktor", a.getNaziv());
    }

    @Test
    void setKod() {
        Artikl a= new Artikl("Biciklo", 3, "12");
        a.setKod("225");
        assertEquals("225", a.getKod());
    }

    @Test
    void getKod() {
        Artikl a= new Artikl("Biciklo", 3, "12");
        assertEquals("12", a.getKod());
    }

    @Test
    void getCijena() {
        Artikl a= new Artikl("Biciklo", 3, "12");
        assertEquals(3, a.getCijena());
    }
}