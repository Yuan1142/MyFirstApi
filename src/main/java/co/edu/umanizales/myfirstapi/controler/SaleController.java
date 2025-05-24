package co.edu.umanizales.myfirstapi.controler;

import co.edu.umanizales.myfirstapi.model.Product;
import co.edu.umanizales.myfirstapi.model.Sale;
import co.edu.umanizales.myfirstapi.model.Seller;
import co.edu.umanizales.myfirstapi.model.Store;
import co.edu.umanizales.myfirstapi.service.SaleService;

import java.time.LocalDate;
import java.util.List;

public class SaleController {
    private SaleService saleService = new SaleService();

    public void crearVenta(Sale venta) {
        saleService.crearVenta(venta);
    }

    public List<Sale> listarVentas() {
        return saleService.listarVentas();
    }

    public Store tienda(Sale venta) {
        return saleService.tienda(venta);
    }

    public Seller vendedor(Sale venta) {
        return saleService.vendedor(venta);
    }

    public List<Product> producto(Sale venta) {
        return saleService.producto(venta);
    }

    public LocalDate fecha(Sale venta) {
        return saleService.fecha(venta);
    }
}

