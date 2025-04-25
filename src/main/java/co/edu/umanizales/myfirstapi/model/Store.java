package co.edu.umanizales.myfirstapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
public class Store {
    private String nombreTienda;
    private String codigoTienda;
    private String direccionTienda;
    private Location Ciudad;
}