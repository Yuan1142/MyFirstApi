package co.edu.umanizales.myfirstapi.service;

import co.edu.umanizales.myfirstapi.model.Store;
import java.util.*;

public class StoreService {
    private List<Store> stores = new ArrayList<>();

    public void addStore(Store s) {
        stores.add(s);
    }

    public List<Store> getStores() {
        return stores;
    }
}