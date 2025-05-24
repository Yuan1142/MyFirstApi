package co.edu.umanizales.myfirstapi.model;

public class Product {
    private double price;
    private int stock;

    public Product(double price, int stock) {
        this.price = price;
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }
}
