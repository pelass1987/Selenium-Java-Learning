package interfejs;

public class PodstawoweAuto implements Auto {

    private String model = "Agila";
    private String marka = "Opel";


    public void toJestMetodaSpecyficzna() {
        System.out.println("Metoda dla posiadaczy auta w wersji podstawowej - "+ model );
    }


    @Override
    public void jedz() {
        System.out.println("Jedziesz podstawowtym modelem auta");
    }

    @Override
    public void zatrzymaj() {
        System.out.println("Zatrzymujesz auto uzywajac hamulcow bebnowych");

    }

    @Override
    public void otworzSzybe() {
        System.out.println("Krecisz korba aby otworzyc szybe");
    }

    @Override
    public void zmienBieg() {
        System.out.println("zmieniasz bieg uzywajac skrzyni manualnej");

    }
}
