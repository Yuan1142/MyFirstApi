package co.edu.umanizales.myfirstapi.model;

public class Store {
    private String code;
    private String name;
    private String address;
    private Location city;

    public Store(String code, String name, String address, Location city) {
        this.code = code;
        this.name = name;
        this.address = address;
        this.city = city;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Location getCity() {
        return city;
    }
}
