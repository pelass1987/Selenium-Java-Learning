import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class PetlaWhile {

    @Test
    public void testPetliWhile() {

        int index = 0;
/*
        while (index<=100) {
            System.out.println(index);
            index = index + 1; //to samo co index++
       }*/
        List<String> owoce = Arrays.asList("Jabłko","Banan","Pomarańcza");

        while (index < owoce.size()) {
            System.out.println(owoce.get(index));
            index++;
        }
    }

}
