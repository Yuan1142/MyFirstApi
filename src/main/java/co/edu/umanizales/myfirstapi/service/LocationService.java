package co.edu.umanizales.myfirstapi.service;

import co.edu.umanizales.myfirstapi.model.Departamentos;
import co.edu.umanizales.myfirstapi.model.Municipios;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

@Getter
@Service
public class LocationService {
    private final Map<String, Departamentos> departments = new HashMap<>();

    @co.edu.umanizales.myfirstapi.service.PostConstruct
    public void loadLocations() {
        try {
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream("Divipola.csv"); // "D" mayúscula
            if (inputStream == null) {
                throw new RuntimeException("Archivo Divipola.csv no encontrado");
            }

            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            boolean firstLine = true;

            while ((line = reader.readLine()) != null) {
                if (firstLine) { // Saltar la primera línea (encabezado)
                    firstLine = false;
                    continue;
                }
                String[] data = line.split(",");

                String departmentCode = data[0];
                String departmentName = data[1];
                String municipalityCode = data[2];
                String municipalityName = data[3];
                boolean isCapital = data[4].equals("1");

                departments.putIfAbsent(departmentCode, new Departamentos(departmentCode, departmentName));

                Municipios municipality = new Municipios(municipalityCode, municipalityName, isCapital);
                departments.get(departmentCode).addMunicipality(municipality);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
