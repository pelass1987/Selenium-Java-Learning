import org.testng.annotations.Test;

public class InstrukcjaIfElse {

    //instrukcja warukowa

    @Test
    public void testInstrukcja() {
        sprawdzWiek(17);
        sprawdzWiek(20);

    }

    public void sprawdzWiek(int wiek) {

        if(wiek < 18) {
            System.out.println("Zapomnij o alko gówniarzu");
        } else {
            System.out.println("Możesz się uchlać");
        }
    }
}
