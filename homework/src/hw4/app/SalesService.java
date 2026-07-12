package hw4.app;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public class SalesService {

    public static List<Sale> getSalesByMonth(List<Sale> sales, int year, int month) {
        List<Sale> result = new ArrayList<>();

        for (Sale sale : sales) {
            if (sale.getDate().getYear() == year && sale.getDate().getMonthValue() == month) {
                result.add(sale);
            }
        }
        return result;
    }

    public static List<Sale> getSalesByWeek(List<Sale> sales, LocalDate startDate, LocalDate endDate) {
        List<Sale> result = new ArrayList<>();

        for (Sale sale : sales) {
            if (!sale.getDate().isBefore(startDate) && !sale.getDate().isAfter(endDate)) {
                result.add(sale);
            }
        }
        return result;
    }

    public static List<Sale> getSalesBySelectedDays(List<Sale> sales, int year, int month, int... days) {
        List<Sale> result = new ArrayList<>();
        YearMonth yearMonth = YearMonth.of(year, month);
        int maxDays = yearMonth.lengthOfMonth();

        Set<Integer> selectedDays = new HashSet<>();
        for (int day : days) {
            if (day >= 1 && day <= maxDays) {
                selectedDays.add(day);
            }
        }

        for (Sale sale : sales) {
            if (sale.getDate().getYear() == year
                    && sale.getDate().getMonthValue() == month
                    && selectedDays.contains(sale.getDate().getDayOfMonth())) {
                result.add(sale);
            }
        }

        return result;
    }

    public static List<Sale> getSalesByProduct(List<Sale> sales, Product product) {
        List<Sale> result = new ArrayList<>();

        for (Sale sale : sales) {
            if (sale.getProduct().getId() == product.getId()) {
                result.add(sale);
            }
        }

        return result;
    }

    public static double calculateTotalSales(List<Sale> sales) {
        double total = 0;

        for (Sale sale : sales) {
            total += sale.getTotal();
        }
        return total;
    }

    public static int countTradingDays(List<Sale> sales) {
        Set<LocalDate> uniqueDays = new HashSet<>();

        for (Sale sale : sales) {
            uniqueDays.add(sale.getDate());
        }

        return uniqueDays.size();
    }

    public static double calculateAverageSalesPerDay(List<Sale> sales) {
        double total = calculateTotalSales(sales);
        int tradingDays = countTradingDays(sales);

        if (tradingDays == 0) {
            return 0;
        }

        return total / tradingDays;
    }

    public static void printProductReport(Product product, List<Sale> sales) {
        List<Sale> productSales = getSalesByProduct(sales, product);

        double totalSales = calculateTotalSales(productSales);
        int tradingDays = countTradingDays(productSales);
        double averageSales = calculateAverageSalesPerDay(productSales);

        System.out.printf("Product No %d: %s,%n", product.getId(), product.getName());
        System.out.printf(Locale.GERMANY,
                "total sales for %d days is EUR %.2f,%n",
                tradingDays, totalSales);
        System.out.printf(Locale.GERMANY,
                "sales by day is EUR %.2f.%n",
                averageSales);

        System.out.println("---------------------------");
    }
}
