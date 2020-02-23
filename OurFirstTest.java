import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class OurFirstTest {

    @Test
    public void sayHellp() {
        System.out.println("Hello World");
        WebDriver driver = new FirefoxDriver();

    }
}
