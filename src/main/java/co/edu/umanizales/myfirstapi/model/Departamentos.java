package co.edu.umanizales.myfirstapi.model;

import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Departamentos {
    private String code;
    private String name;
    private List<Municipios> municipalities;

    public Departamentos(String code, String name) {
        this.code = code;
        this.name = name;
        this.municipalities = new ArrayList<>();
    }

    public void addMunicipality(Municipios municipios) {
        this.municipalities.add(municipios);
    }
}
