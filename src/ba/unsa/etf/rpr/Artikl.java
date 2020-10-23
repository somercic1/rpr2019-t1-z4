package ba.unsa.etf.rpr;

public class Artikl  {
    int cijena;
    String naziv, kod;

    public Artikl(String biciklo, int i, String s) {
        this.cijena=i;
        this.naziv=biciklo;
        this.kod=s;
    }

    public String getNaziv() {
        return this.naziv;
    }

    public String getKod() {
        return this.kod;


}

    public int getCijena() {
        return this.cijena;
    }
}
