package level4.lecture8.task_3;

public enum Key {
    USER("user"),
    LOSER("loser"),
    CODER("coder"),
    PROGER("proger");

    private final String person;

    Key (String person){
        this.person = person;
    }

    public String getPerson(){
        return person;
    }

}
