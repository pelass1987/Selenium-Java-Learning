package abstrakcyjna;

public class Ptak extends Zwierzatko{
    @Override
    public void poruszajSie() {
        System.out.println("Latam");
    }

    @Override
    public void wypiszPrzysmak() {
        System.out.println("Lubię ziarno");

    }
}
// Pobiera metody z klasy abstrakcyjnej i dodaje do nich kolejną treść