package ba.unsa.etf.rpr;

public class Artikl  {
    private int cijena;
    private String naziv;
    private String kod;

    public Artikl(String biciklo, int i, String s) {
        setCijena(i);
        setNaziv(biciklo);
        setKod(s);
    }

    public String getNaziv() {

        return naziv;
    }

    public void setCijena(int cijena) {
        this.cijena = cijena;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public String getKod() {
        return kod;
    }


    public int getCijena() {

        return cijena;
    }
}
