package kolekcje;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class Mapa {

    Map<Integer,String> dziennik = new HashMap<Integer, String>();

    public void dodajUczniow() {
        dziennik.put(1,"Kowalski");
        dziennik.put(2,"Nowak");
        dziennik.put(3,"Pelka");
        dziennik.put(4,"Dudek");
    }
    @Test
    public void testMapy() {
        dodajUczniow();
        System.out.println("=============Początek testu:===============");
        System.out.println(dziennik.size());
        dziennik.remove(1);
        System.out.println(dziennik.size());
        System.out.println(dziennik.get(2));
        dziennik.put(2, "Nowy user");
        System.out.println(dziennik.containsKey(2));
        System.out.println(dziennik.size());
        System.out.println(dziennik.get(2));
        System.out.println("=================Koniec testu==================");
    }
}
