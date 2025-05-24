package co.edu.umanizales.myfirstapi.service;

import co.edu.umanizales.myfirstapi.model.Parameter;
import co.edu.umanizales.myfirstapi.model.TypeDoc;
import co.edu.umanizales.myfirstapi.model.TypeProduct;
import java.util.*;

public class ParameterService {
    private List<TypeDoc> typeDocs = new ArrayList<>();
    private List<TypeProduct> typeProducts = new ArrayList<>();

    public void addParameter(Parameter p) {
        if (p instanceof TypeDoc) {
            typeDocs.add((TypeDoc) p);
        } else if (p instanceof TypeProduct) {
            typeProducts.add((TypeProduct) p);
        }
    }

    public List<Parameter> getAllParameters() {
        List<Parameter> all = new ArrayList<>();
        all.addAll(typeDocs);
        all.addAll(typeProducts);
        return all;
    }

    public List<Parameter> getParameterByType(String type) {
        switch (type.toLowerCase()) {
            case "typedoc":
                return new ArrayList<>(typeDocs);
            case "typeproduct":
                return new ArrayList<>(typeProducts);
            default:
                return new ArrayList<>();
        }
    }

    public Parameter getParameterByCode(String code) {
        return getAllParameters().stream()
                .filter(p -> p.getCode().equals(code))
                .findFirst()
                .orElse(null);
    }
}