package abstrakcyjna;

public abstract class Zwierzatko {

    public String nazwa = "Ssak";

    public abstract void poruszajSie();

    public abstract void wypiszPrzysmak();

    public void napijSieWody() {
        System.out.println("Piję wodę");
    }
}

// Tutaj dodajemy klasę abstrakcyjną i tworzymy metody