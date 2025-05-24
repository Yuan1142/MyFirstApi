package co.edu.umanizales.myfirstapi.model;

public class Seller {
    private String identification;
    private TypeDoc typeDoc;
    private String name;
    private String lastName;
    private byte age;
    private Location city;

    public Seller(String identification, TypeDoc typeDoc, String name, String lastName, byte age, Location city) {
        this.identification = identification;
        this.typeDoc = typeDoc;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.city = city;
    }

    public String getIdentification() {
        return identification;
    }

    public TypeDoc getTypeDoc() {
        return typeDoc;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public byte getAge() {
        return age;
    }

    public Location getCity() {
        return city;
    }
}
