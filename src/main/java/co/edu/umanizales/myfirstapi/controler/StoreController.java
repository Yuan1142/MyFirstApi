package co.edu.umanizales.myfirstapi.controler;

import co.edu.umanizales.myfirstapi.model.Store;
import co.edu.umanizales.myfirstapi.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stores")
public class StoreController {

    @Autowired
    private StoreService storeService;

    @GetMapping
    public List<Store> getAllStores() {
        return storeService.getAllStores();
    }

    @GetMapping(path = "/name/{name}")
    public Store getStoreByName(@PathVariable String name) {
        return storeService.getStoreByName(name);
    }
}