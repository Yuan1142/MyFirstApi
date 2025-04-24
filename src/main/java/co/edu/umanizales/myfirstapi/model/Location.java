package co.edu.umanizales.myfirstapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@AllArgsConstructor

public class Location {
    private String code;
    private String description;

    public Location() {

    }
}