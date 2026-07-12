package hw4.app;

import java.time.LocalDate;

public class Sale {
    private Product product;
    private int quantity;
    private LocalDate date;

    public Sale(Product product, int quantity, LocalDate date) {
        this.product = product;
        this.quantity = quantity;
        this.date = date;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getTotal() {
        return quantity * product.getPrice();
    }
}
