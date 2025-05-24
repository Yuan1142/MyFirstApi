package co.edu.umanizales.myfirstapi.service;

import co.edu.umanizales.myfirstapi.model.*;
import java.time.LocalDate;
import java.util.*;

public class SaleService {
    private List<Sale> sales = new ArrayList<>();

    public void crearVenta(Sale venta) {
        sales.add(venta);
    }

    public List<Sale> listarVentas() {
        return sales;
    }

    public Store getTienda(Sale venta) {
        return venta.getStore();
    }

    public Seller getVendedor(Sale venta) {
        return venta.getSeller();
    }

    public List<Product> getProductos(Sale venta) {
        return venta.getProducts();
    }

    public LocalDate getFecha(Sale venta) {
        return venta.getDateSale();
    }

    public Store tienda(Sale venta) {
        return null;
    }

    public Seller vendedor(Sale venta) {
        return null;
    }

    public List<Product> producto(Sale venta) {
        return List.of();
    }

    public LocalDate fecha(Sale venta) {
        return null;
    }
}