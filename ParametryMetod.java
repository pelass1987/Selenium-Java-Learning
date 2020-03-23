import org.testng.annotations.Test;

public class ParametryMetod {

    public int suma(int pierwszaLiczba, int drugaLiczba) {
        // suma = pierwszaLiczba + drugaLiczba
        return pierwszaLiczba + drugaLiczba;
    }

    public void przywitajSie(String imie) {
        System.out.println("Witaj " + imie);
    }
    @Test
    public void testParametrow() {

    }

}
