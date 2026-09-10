package level4.lecture6;


public class HenFactory {

    public static void main(String[] args) {
        UkrainianHen ukrainianHen = new UkrainianHen();
        System.out.println(ukrainianHen.getDescription());

        MoldovanHen moldovanHen = new MoldovanHen();
        System.out.println(moldovanHen.getDescription());

        BelarusianHen belarusianHen = new BelarusianHen();
        System.out.println(belarusianHen.getDescription());

        RussianHen russianHen = new RussianHen();
        System.out.println(russianHen.getDescription());
    }
}
