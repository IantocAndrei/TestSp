public class Developer extends Angajat {
    private TipDeveloper tip;

    public Developer(String nume, int salar, String vechime, TipDeveloper tip) {
        super(nume, salar, vechime);
        this.tip = tip;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "tip=" + tip +
                '}';
    }

    public TipDeveloper getTip() {
        return tip;
    }

    public void setTip(TipDeveloper tip) {
        this.tip = tip;
    }
}
