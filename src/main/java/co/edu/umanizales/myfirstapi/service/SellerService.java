package co.edu.umanizales.myfirstapi.service;

import co.edu.umanizales.myfirstapi.model.Seller;
import java.util.*;

public class SellerService {
    private List<Seller> sellers = new ArrayList<>();

    public void addSeller(Seller s) {
        sellers.add(s);
    }

    public List<Seller> getSellers() {
        return sellers;
    }
}
