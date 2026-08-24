package hw15.model;

import hw15.service.Advice;

public enum Day implements Advice {
    MONDAY("Понеділок", "понеділок"),
    TUESDAY("Вівторок", "вівторок"),
    WEDNESDAY("Середа", "середу"),
    THURSDAY("Четвер", "четвер"),
    FRIDAY("П'ятниця", "п'ятницю"),
    SATURDAY("Субота", "суботу"),
    SUNDAY("Неділя", "неділю");

    private final String nominative;
    private final String accusative;

    Day(String nominative, String accusative) {
        this.nominative = nominative;
        this.accusative = accusative;
    }

    public String getNominative() {
        return nominative;
    }

    public String getAccusative() {
        return accusative;
    }

    @Override
    public void advice() {

        switch (this) {
            case MONDAY -> {
                    System.out.println("Порада на " + MONDAY.getAccusative() + ":");
                    System.out.println("Почніть тиждень із чіткого плану. " +
                    "Визначте 3 головні цілі на ці дні та беріться за найскладнішу задачу прямо зараз, поки у вас найбільше енергії!");
            }
            case TUESDAY -> {
                System.out.println("Порада на " + WEDNESDAY.getAccusative() + ":");
                System.out.println("Час для глибокого фокусу. " +
                    "Спробуйте застосувати техніку Pomodoro (25 хвилин роботи, 5 хвилин відпочинку) та вимкніть усі сповіщення в месенджерах.");
            }
            case WEDNESDAY -> {
                System.out.println("Порада на " + WEDNESDAY.getAccusative() + ":");
                System.out.println("Екватор тижня! Зберегти темп допоможе зміна діяльності. " +
                    "Розімніться, випийте води та зробіть 10-хвилинну перерву далеко від екрана монітора.");
            }
            case THURSDAY -> {
                System.out.println("Порада на " + THURSDAY.getAccusative() + ":");
                System.out.println("Запобігаємо вигоранню перед вихідними. " +
                    "Перегляньте свої завдання, закрийте дрібні «хвости» та не забувайте делегувати те, що можливо.");
            }
            case FRIDAY -> {
                System.out.println("Порада на " + FRIDAY.getAccusative() + ":");
                System.out.println("Happy Friday! " +
                    "Час завершувати останні таски та готуватися до відпочинку.");
            }
            case SATURDAY -> {
                System.out.println("Порада на " + SATURDAY.getAccusative() + ":");
                System.out.println("Чудовий час для активного відпочинку та тривалих прогулянок. " +
                    "Рекомендуємо завітати до яхт-клубу «Січ», щоб відпочити біля води та поспостерігати за птахами, " +
                    "або влаштувати променад Січеславською набережною.");
            }
            case SUNDAY -> {
                System.out.println("Порада на " + SUNDAY.getAccusative() + ":");
                System.out.println("день для спокійного перезавантаження. " +
                    "Випийте смачної кави на Катеринославському бульварі, підніміться на оглядовий майданчик центру «Менора», " +
                    "або просто насолодіться тишею та краєвидами в парку Шевченка.");
            }
            default -> System.out.println("Такого дня тижня не існує"); }
    }
}
