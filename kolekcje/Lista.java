package kolekcje;


import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lista {
    List<String> imiona = new ArrayList<String>();
    //nie wystarczy wpisać List. Trzeba to wybrać z opcji które się wyświetlą, inaczej nie zostanie zaimportowane
    //ta lista jest preferowana do odczytu danych i użycia get, jest wtedy szybsza od LinkedListy

    List<Integer> numery = new LinkedList<Integer>();
    //Jeśli chcemy użyć numerów w liście to nie używamy <inta> tylko <Integer>
    //Lepsza (od ArrayListy) jeśli chcemy wrzucić więcej elementów do listy


    public void dodajImiona() {
        imiona.add("Tomek");
        imiona.add("Maciek");
        imiona.add("Szymon");

    }

    public void ustawNumeryLotto() {
        numery.add(Integer.valueOf(4));
        numery.add(Integer.valueOf(16));
        numery.add(Integer.valueOf(22));
        numery.add(Integer.valueOf(23));
        numery.add(Integer.valueOf(28));
        numery.add(Integer.valueOf(29));


    }

    @Test
    public void testListy() {
        dodajImiona();
        System.out.println(imiona.get(0));
        System.out.println(imiona.get(1));
        System.out.println(imiona.get(2));
        System.out.println(imiona.size());
        imiona.remove("Tomek");
        System.out.println(imiona.size());
        System.out.println(imiona.indexOf("Maciek"));
        System.out.println(imiona.contains("Maciek"));



    }

    @Test
    public void testLinkListy() {
        ustawNumeryLotto();
        System.out.println(numery.get(0));
        System.out.println(numery.contains(16));
        System.out.println(numery.size());
        System.out.println(numery.remove(2));
        System.out.println(numery.size());
    }

}
