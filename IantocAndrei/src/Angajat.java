public class Angajat {
    private String nume;
    private int salar;
    private String vechime;

    public Angajat(String nume, int salar, String vechime) {
        this.nume = nume;
        this.salar = salar;
        this.vechime = vechime;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getSalar() {
        return salar;
    }

    public void setSalar(int salar) {
        this.salar = salar;
    }

    public String getVechime() {
        return vechime;
    }

    public void setVechime(String vechime) {
        this.vechime = vechime;
    }

    @Override
    public String toString() {
        return "Angajat{" +
                "nume='" + nume + '\'' +
                ", salar=" + salar +
                ", vechime='" + vechime + '\'' +
                '}';
    }
}
