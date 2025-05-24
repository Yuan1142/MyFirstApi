package co.edu.umanizales.myfirstapi.service;

import co.edu.umanizales.myfirstapi.model.Location;
import java.util.*;

public class LocationService {
    private List<Location> locations = new ArrayList<>();

    public void addLocation(Location l) {
        locations.add(l);
    }

    public List<Location> getLocations() {
        return locations;
    }
}