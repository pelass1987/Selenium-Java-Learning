package kolekcje;

import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;

public class Sety {

    Set<String> nicks = new HashSet<String>();
    public void dodajNickiUzytkownikow() {
        nicks.add("andrzej666");
        nicks.add("wesoly romek");
        nicks.add("dewastator");
    }
    @Test
    public void testSetow() {
        dodajNickiUzytkownikow();
        nicks.add("Kolejny nick");
        System.out.println(nicks.size());
        System.out.println(nicks.contains("andrzej666"));
        nicks.remove("andrzej666");
        System.out.println(nicks.size());
    }

}
