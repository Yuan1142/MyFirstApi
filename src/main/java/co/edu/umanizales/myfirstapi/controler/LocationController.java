package co.edu.umanizales.myfirstapi.controler;

import co.edu.umanizales.myfirstapi.model.Location;
import co.edu.umanizales.myfirstapi.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path = "/location")
@RestController

public class LocationController {

   /*
    @GetMapping
    public String location() {
        Location manizales = new Location();
        return "manizales";
    }

    */

    @Autowired
    private LocationService locationService;

    @GetMapping
    public List<Location> getLocations() {
        return locationService.getAllLocations();

    }

    @GetMapping(path = "/code/{code}")
    public Location getLocationByCode(@PathVariable String code) {
        return locationService.getLocationByCode(code);
    }

    @GetMapping(path = "/states")
    public List<Location> getStates() {
        return locationService.getStates();
    }

    @GetMapping(path = "/department/{department}")
    public List<Location> getLocationsByDepartment(@PathVariable String department) {
        return locationService.getLocationsByDepartment(department);
    }

    @GetMapping(path = "/location")
    public List<Location> getLocationsByLocation(String location) {
        return locationService.getAllLocations();
    }

    @GetMapping(path = "/departmentcode/{departmentCode}")
    public List<Location> getLocationByDepartmentCode(@PathVariable String departmentCode) {
        return locationService.getLocationByDepartmentCode(departmentCode);
    }
    @GetMapping(path = "/alldepartment")
    public List<Location> getAllDepartments() {
        return locationService.getAllDepartments();
    }
}
