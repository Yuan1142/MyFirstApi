package co.edu.umanizales.myfirstapi.service;

import co.edu.umanizales.myfirstapi.model.Location;
import co.edu.umanizales.myfirstapi.model.Store;
import jakarta.annotation.PostConstruct;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Getter
public class StoreService {


    private final LocationService locationService;

    private List<Store> stores;

    @Value("${stores_filename}") // Define esto en application.properties
    private String storesFilename;

    public StoreService(LocationService locationService) {
        this.locationService = locationService;
    }

    @PostConstruct
    public void loadStoresFromCSV() throws IOException, URISyntaxException {
        stores = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(
                Paths.get(ClassLoader.getSystemResource(storesFilename).toURI()).toFile()
        ))) {
            String line;
            boolean firstLine = true;
            while ((line = br.readLine()) != null) {
                if (firstLine) {
                    firstLine = false;
                    continue;
                }
                String[] data = line.split(",");
                if (data.length == 4) {

                    Location ciudad = locationService.getLocationByCode(data[3]);
                    stores.add(new Store(
                            data[0].trim(), // Nombre Tienda
                            data[1].trim(), // Codigo Tienda
                            data[2].trim(),
                            ciudad
                             // Codigo Ciudad
                    ));
                }
            }
        } catch (NumberFormatException e) {
            System.err.println("Error al convertir números en el archivo de tiendas: " + e.getMessage());
            throw e;
        }
    }

    public List<Store> getAllStores() {
        return stores;
    }

    public Store getStoreByName(String name) {
        for (Store store : stores) {
            if (store.getNombreTienda().equals(name)) {
                return store;
            }
        }
        return null;
    }
}