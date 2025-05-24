package co.edu.umanizales.myfirstapi.model;

public class Parameter {
    private String code;
    private String description;

    public Parameter(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
