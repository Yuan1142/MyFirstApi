package co.edu.umanizales.myfirstapi.model;

import java.time.LocalDate;
import java.util.List;

public class Sale {
    private Store store;
    private Seller seller;
    private LocalDate dateSale;
    private int quantity;
    private List<Product> products;

    public Sale(Store store, Seller seller, LocalDate dateSale, int quantity, List<Product> products) {
        this.store = store;
        this.seller = seller;
        this.dateSale = dateSale;
        this.quantity = quantity;
        this.products = products;
    }

    public Store getStore() {
        return store;
    }

    public Seller getSeller() {
        return seller;
    }

    public LocalDate getDateSale() {
        return dateSale;
    }

    public int getQuantity() {
        return quantity;
    }

    public List<Product> getProducts() {
        return products;
    }
}
