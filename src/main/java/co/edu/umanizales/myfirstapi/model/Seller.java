package co.edu.umanizales.myfirstapi.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Getter
@Setter

public class Seller {

    private String identification;
    private String name;
    private String lastName;
    private String gender;
    private String age;

    public Seller(String identification, String name, String lastName, String gender, String age) {
        this.identification = identification;
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
    }
}

@RestController
@RequestMapping(path = "/seller")
class SellerController {
    @GetMapping
    public String getSeller() {

        Seller Miguel = new Seller("1054761422", "Miguel", "Gonzales", "Male", "20");

        Seller Mario = new Seller("1054986321", "Mario", "Mendoza", "Male", "38");

        Seller Salome = new Seller("1085471246", "Salome", "Fernandez", "Femenine", "24");

        Seller Juan = new Seller("1054861471", "Juan", "Diaz", "Male", "19");

        Seller David = new Seller("105863341", "David", "Barco", "Male", "18");;

        return "sell successful";
    }
}