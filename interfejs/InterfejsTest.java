package interfejs;

import org.testng.annotations.Test;

public class InterfejsTest {

    @Test
    public void interfejsTest() {
        Auto autoPremium = new AutoPremium();
        zaprezentujAuto(autoPremium);

        Auto auto = new PodstawoweAuto();
        zaprezentujAuto(auto);
    }
    /*{
        PodstawoweAuto auto = new PodstawoweAuto();
        auto.jedz();
        auto.zmienBieg();
        auto.zatrzymaj();
        auto.toJestMetodaSpecyficzna();


        AutoPremium autoPremium = new AutoPremium();
        autoPremium.jedz();
        autoPremium.zmienBieg();
        autoPremium.otworzSzybe();
        autoPremium.zatrzymaj();
        autoPremium.specyficznaMetodaPremium();

    }*/
    public void zaprezentujAuto(Auto autoPremium) {
            //System.out.println("Prezentuje auto premium");
            autoPremium.jedz();
            autoPremium.zatrzymaj();
        }
/*
        public void zaprezentujAuto(PodstawoweAuto auto) {
            System.out.println("Prezentuje auto podstawowe");
            auto.jedz();
            auto.otworzSzybe();
            auto.zatrzymaj();

        }*/




    }



