import org.testng.annotations.Test;

public class OperatoryMatematyczne {

    @Test
    public void testOperatorzy(){
        int pierwszaLiczba = 22;
        int drugaliczba = 56;

        int suma = pierwszaLiczba + drugaliczba;

        int roznica = pierwszaLiczba - drugaliczba;

        int iloczyn = pierwszaLiczba * drugaliczba;

        int iloraz = pierwszaLiczba / drugaliczba;

        //reszta z dzielenia
        int modulo = drugaliczba%pierwszaLiczba;

        System.out.println(suma);
        System.out.println(roznica);
        System.out.println(iloczyn);
        System.out.println(iloraz);
        System.out.println(modulo);
    }
}
