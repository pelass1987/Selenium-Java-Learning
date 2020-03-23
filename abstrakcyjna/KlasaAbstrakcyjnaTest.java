package abstrakcyjna;

import org.testng.annotations.Test;

public class KlasaAbstrakcyjnaTest {
    @Test
    public void testKlasyAbstrakcyjnej() {
        Pies reksio = new Pies();
        reksio.poruszajSie();
        reksio.wypiszPrzysmak();
        reksio.napijSieWody();

        Ptak tweety = new Ptak();
        tweety.nazwa = "ptak";
        tweety.poruszajSie();
        tweety.wypiszPrzysmak();
        tweety.napijSieWody();


    }
}
// Test klasy abstrakcyjnej i jej metod