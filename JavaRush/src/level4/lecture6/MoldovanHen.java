package level4.lecture6;

public class MoldovanHen extends Hen implements Country{
    @Override
    public int getCountOfEggsPerMonth() {
        return 30;
    }

    @Override
    public String getDescription() {
        String res = super.getDescription() + " Моя страна - " + Country.MOLDOVA +  " Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
        return res;
    }
}
