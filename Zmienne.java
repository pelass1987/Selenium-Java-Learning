import org.testng.annotations.Test;

@Test
public class Zmienne {

    //deklaracje zmiennych

    int pierwszaLiczba;
    int drugaLiczba;
    String suma;

    //deklaracjai inicjalizacja w jednej lini
    int trzeciaLiczba = 3;

    String naszeImie = "Dawid";

    public void suma() {
        //inicjalizacja zmiennej
        pierwszaLiczba = 2;
        drugaLiczba = 3;
        suma = naszeImie + ", wynik dodawania = " + pierwszaLiczba + drugaLiczba + trzeciaLiczba;
        System.out.println(suma);
    }
}
