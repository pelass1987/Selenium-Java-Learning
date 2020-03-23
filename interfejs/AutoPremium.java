package interfejs;

public class AutoPremium implements Auto {



    @Override
    public void jedz() {
        System.out.println("Jedziesz autem premium na wypasie");

    }

    @Override
    public void zatrzymaj() {
        System.out.println("Hamujesz zajebistymi hamulcami");

    }

    @Override
    public void otworzSzybe() {
        System.out.println("otwierasz szybę jednym przyciskiem");


    }

    @Override
    public void zmienBieg() {
        System.out.println("Biegi zmieniają się same");

    }

    public void specyficznaMetodaPremium() {
        System.out.println("Jako posiadacz auta premium masz dodatkowe zniżki");
    }
}

