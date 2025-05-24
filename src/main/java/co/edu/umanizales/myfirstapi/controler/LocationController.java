package co.edu.umanizales.myfirstapi.controler;

import co.edu.umanizales.myfirstapi.model.Location;
import co.edu.umanizales.myfirstapi.service.LocationService;
import java.util.List;

public class LocationController {
    private LocationService locationService = new LocationService();

    public void addLocation(Location location) {
        locationService.addLocation(location);
    }

    public List<Location> getLocations() {
        return locationService.getLocations();
    }
}