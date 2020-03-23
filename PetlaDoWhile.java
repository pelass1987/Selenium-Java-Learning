import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class PetlaDoWhile {

    @Test
    public void testPetliDoWhile() {

        int index = 0;

       /* do {
            System.out.println(index);
            index++;
        }
        while (index < 5);*/
// kod zawarty w "do" zawsze wykona się conajmniej jeden raz
        List<String> rzeczy = Arrays.asList("Lampa","auto","Sofa");
        do{
            System.out.println(rzeczy.get(index));
            index++;
        }while (index<rzeczy.size());


        }
    }

