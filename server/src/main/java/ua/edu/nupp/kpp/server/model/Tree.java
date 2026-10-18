package ua.edu.nupp.kpp.server.model;

public class Tree {

    private Long id;
    private String inventoryNumber;
    private String species;
    private String location;

    public Tree() {
    }

    public Tree(Long id, String inventoryNumber,
                String species, String location) {
        this.id = id;
        this.inventoryNumber = inventoryNumber;
        this.species = species;
        this.location = location;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInventoryNumber() {
        return inventoryNumber;
    }

    public void setInventoryNumber(String inventoryNumber) {
        this.inventoryNumber = inventoryNumber;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}