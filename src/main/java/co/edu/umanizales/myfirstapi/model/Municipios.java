package co.edu.umanizales.myfirstapi.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Municipios {
    private String code;
    private String name;
    private boolean isCapital;

    public Municipios(String code, String name, boolean isCapital) {
        this.code = code;
        this.name = name;
        this.isCapital = isCapital;
    }
}
