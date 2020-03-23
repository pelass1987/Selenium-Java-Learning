package abstrakcyjna;

public class Pies extends Zwierzatko {

    @Override
    public void poruszajSie() {
        System.out.println("Biegam!");
    }

    @Override
    public void wypiszPrzysmak() {
        System.out.println("Lubię kości!");
    }
}
// Pobiera metody z klasy abstrakcyjnej i dodaje do niej ciało (co mają robić)
