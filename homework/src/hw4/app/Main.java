package hw4.app;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.GERMANY);

        Product product1 = new Product(1, "smartphone", 520.40);
        Product product2 = new Product(2, "laptop", 980.75);
        Product product3 = new Product(3, "TV", 710.30);

        List<Sale> sales = new ArrayList<>();

        sales.add(new Sale(product1, 2, LocalDate.of(2026, 7, 1)));
        sales.add(new Sale(product1, 1, LocalDate.of(2026, 7, 3)));
        sales.add(new Sale(product1, 3, LocalDate.of(2026, 7, 5)));
        sales.add(new Sale(product1, 1, LocalDate.of(2026, 7, 8)));
        sales.add(new Sale(product1, 2, LocalDate.of(2026, 7, 10)));

        sales.add(new Sale(product2, 1, LocalDate.of(2026, 7, 2)));
        sales.add(new Sale(product2, 2, LocalDate.of(2026, 7, 4)));
        sales.add(new Sale(product2, 1, LocalDate.of(2026, 7, 6)));
        sales.add(new Sale(product2, 1, LocalDate.of(2026, 7, 9)));
        sales.add(new Sale(product2, 3, LocalDate.of(2026, 7, 12)));
        sales.add(new Sale(product2, 1, LocalDate.of(2026, 7, 15)));
        sales.add(new Sale(product2, 2, LocalDate.of(2026, 7, 18)));

        sales.add(new Sale(product3, 2, LocalDate.of(2026, 7, 1)));
        sales.add(new Sale(product3, 1, LocalDate.of(2026, 7, 7)));
        sales.add(new Sale(product3, 4, LocalDate.of(2026, 7, 14)));

        List<Sale> monthSales = SalesService.getSalesByMonth(sales, 2026, 7);

        SalesService.printProductReport(product1, monthSales);
        SalesService.printProductReport(product2, monthSales);
        SalesService.printProductReport(product3, monthSales);
    }
}
