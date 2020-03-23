package Dziedziczenie;

public class Dziecko extends Rodzic {
// słowo extends oznacza że to co jest za nim, w tym przypadku "Rodzic" jest classa po której
    // aktualna classa dziedziczy, w tym przypadku "Dziecko"


    protected String kolorOczu = "piwne";

    public void wypiszMojKolorOczu() {
        System.out.println("To jest moj kolor oczu: "+kolorOczu);
    }

    public void wypiszMojKolorWlosow() {
        System.out.println("To jest moj kolor wlosow: " + kolorWlosow);

    }


    @Override
    public void probujePlywac() {
    System.out.println("Byc może mam talent po rodzicach ale jeszcze nie potrafie plywac");
}

}
