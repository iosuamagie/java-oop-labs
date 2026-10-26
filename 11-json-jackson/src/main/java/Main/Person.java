package Main;

public class Person {
    private String nume;
    private int varsta;

    // Getters și Setters
    public String getNume() { return nume; }
    public void setNume(String nume) { this.nume = nume; }

    public int getVarsta() { return varsta; }
    public void setVarsta(int varsta) { this.varsta = varsta; }

    @Override
    public String toString() {
        return nume + " (" + varsta + " ani)";
    }
}

