package co.edu.umanizales.myfirstapi.controler;

import co.edu.umanizales.myfirstapi.model.Store;
import co.edu.umanizales.myfirstapi.service.StoreService;

import java.util.List;


public class StoreController {
    private StoreService storeService = new StoreService();

    public void addStore(Store store) {
        storeService.addStore(store);
    }

    public List<Store> getStores() {
        return storeService.getStores();
    }
}
