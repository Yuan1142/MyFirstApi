package co.edu.umanizales.myfirstapi.controler;

import co.edu.umanizales.myfirstapi.model.Location;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "/location")
@RestController

public class LocationController {
    @GetMapping
    public String location() {
        Location manizales = new Location();
        return "manizales";
    }
}
