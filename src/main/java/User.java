public class User {
    private String imie;
    private String nazwisko;
    private int wiek;
    private int numer;

    public int getNumer() {
        return numer;
    }

    public void setNumer(int numer) {
        this.numer = numer;
    }

    public User(String imie, String nazwisko, int wiek, int numer) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.numer = numer;
    }

    public User() {
    }

    @Override
    public String toString() {
        return imie+" "+nazwisko+" "+wiek;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }
}
