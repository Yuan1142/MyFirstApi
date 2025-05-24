package co.edu.umanizales.myfirstapi.controler;

import co.edu.umanizales.myfirstapi.model.Seller;
import co.edu.umanizales.myfirstapi.service.SellerService;

import java.util.List;

public class SellerController {
    private SellerService sellerService = new SellerService();

    public void addSeller(Seller seller) {
        sellerService.addSeller(seller);
    }

    public List<Seller> getSellers() {
        return sellerService.getSellers();
    }
}
