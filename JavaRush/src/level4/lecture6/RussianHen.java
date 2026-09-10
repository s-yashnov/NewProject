package level4.lecture6;

public class RussianHen extends Hen implements Country{
    @Override
    public int getCountOfEggsPerMonth() {
        return 1;
    }

    @Override
    public String getDescription() {
        String res = super.getDescription() + " Моя страна - " + Country.RUSSIA +  " Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
        return res;
    }
}
