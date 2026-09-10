package level4.lecture6;

public class BelarusianHen extends Hen implements Country{
    @Override
    public int getCountOfEggsPerMonth() {
        return 25;
    }

    @Override
    public String getDescription() {
        String res = super.getDescription() + " Моя страна - " + Country.BELARUS +  " Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
        return res;
    }
}
