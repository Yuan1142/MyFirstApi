package co.edu.umanizales.myfirstapi.service;

import co.edu.umanizales.myfirstapi.model.Location;
import jakarta.annotation.PostConstruct;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Service
@Getter
public class LocationService {

    private List<Location> locations;
    private List<Location> departmentLocation;

    @Value("${locations_filename}")
    private String locationsFilename;

    @PostConstruct
    public void readLocationsFromCSV() throws IOException, URISyntaxException {
        locations = new ArrayList<>();
        departmentLocation = new ArrayList<>();
        locations.add(new Location("05", "ANTIOQUIA"));
        locations.add(new Location("17", "CALDAS"));
        locations.add(new Location("66", "RISARALDA"));

        Path pathFile = Paths.get(ClassLoader.getSystemResource(locationsFilename).toURI());

        try (BufferedReader br = new BufferedReader(new FileReader(pathFile.toString()))) {

            String[] data;
            String code, description;

            String DepartmentCode, DepartmentDescription;

            String line;
            boolean firstLine = true;


            while ((line = br.readLine()) != null) {
                if (firstLine) {
                    firstLine = false;
                    continue;
                }

                data = line.split(",");
                code = data[2];
                description = data[3];
                locations.add(new Location(code, description));

                DepartmentCode = data[0];
                DepartmentDescription = data[1];
                departmentLocation.add(new Location(DepartmentCode, DepartmentDescription));

            }
        } catch (IOException e) {
            e.printStackTrace();
            throw e;  // Lanza la excepción para que pueda manejarse en la capa superior si es necesario
        }
    }

    public Location getLocationByCode(String code) {
        for (Location location : locations) {
            if (location.getCode().equals(code)) {
                return location;
            }
        }
        return null;
    }

    public List<Location> getStates() {
        List<Location> states = new ArrayList<>();
        for (Location location : locations) {
            if (location.getCode().length() == 2) {
                states.add(location);
            }
        }
        return states;
    }

    public List<Location> GetLocations() {
        return locations;
    }

    public List<Location> getLocationsByName(String name) {
        List<Location> results = new ArrayList<>();
        for (Location location : locations) {
            if (location.getDescription().equalsIgnoreCase(name)) {
                results.add(location);
            }
        }
        return results;
    }

    public List<Location> getAllDepartments() {
        List<Location> results = new ArrayList<>();
        for (Location dLocation : departmentLocation) {
            if (dLocation.getCode().length() == 2) {
                results.add(dLocation);
            }

        }
        return results;
    }

    public List<Location> getAllLocations() {
        List<Location> results = new ArrayList<>();
        for (Location location : locations) {
            results.add(location);
        }
        return results;
    }

    public List<Location> getLocationByDepartmentCode(String departmentCode) {
        List<Location> results = new ArrayList<>();
        for (Location dlocation : departmentLocation) {
            results.add(dlocation);
        }
        return results;
    }

    public List<Location> getLocationsByDepartment(String department) {
        List<Location> results = new ArrayList<>();
        for (Location location : locations) {
            if (location.getDescription().equalsIgnoreCase(department)) {
                results.add(location);
            }
        }
        return results;
    }
}