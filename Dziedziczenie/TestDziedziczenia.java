package Dziedziczenie;

import org.testng.annotations.Test;

public class TestDziedziczenia {

    @Test
    public void testDziedziczenia() {
        Dziecko dziecko = new Dziecko();
        dziecko.wypiszMojKolorOczu();
        dziecko.wypiszMojKolorWlosow();
        dziecko.probujePlywac(); //to zostało nadpisane w pliku dziecko, w pliku Rodzic jest iina wartość
        if(dziecko.sklonnoscDoTycia) {
            System.out.println("Ma skłonności do tycia po rodzicu");
        }else {
            System.out.println("Nie ma sklonnosci do tycia po rodzicu");
        }
    }
}

