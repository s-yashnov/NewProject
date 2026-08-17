package hw14;

public class Main {
    public static void main(String[] args) {
        Printer printer = new PrinterImpl();
        PrinterImpl.Message msg1 = new PrinterImpl.Message("Привіт, як справи?", null);
        printer.print(msg1);
        PrinterImpl.Message msg2 = new PrinterImpl.Message("Друге повідомлення", "");
        printer.print(msg2);
        PrinterImpl.Message msg3 = new PrinterImpl.Message("Тестове повідомлення", "Олег");
        printer.print(msg3);
        PrinterImpl.Message msg4 = new PrinterImpl.Message(null, null);
        printer.print(msg4);
    }
}
