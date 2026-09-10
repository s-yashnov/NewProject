package level4.lecture6;

public class UkrainianHen extends Hen implements Country{
    @Override
    public int getCountOfEggsPerMonth() {
        return 100;
    }

    @Override
    public String getDescription() {
        String res = super.getDescription() + " Моя страна - " + Country.UKRAINE +  " Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
        return res;
    }
}
