import java.util.List;

public class Manager extends Angajat {
    private List<Angajat> angajati;

    public Manager(String nume, int salar, String vechime, List<Angajat> angajati) {
        super(nume, salar, vechime);
        this.angajati = angajati;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "angajati=" + angajati +
                '}';
    }

    public List<Angajat> getAngajati() {
        return angajati;
    }

    public void setAngajati(List<Angajat> angajati) {
        this.angajati = angajati;
    }
}
