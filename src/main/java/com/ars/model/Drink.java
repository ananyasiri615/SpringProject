package com.ars.model;

public class Drink {

    private int id;
    private String name;
    private String type;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public Drink(int id, String name, String type) {
        super();
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public Drink() {
        super();
    }
    @Override
    public String toString() {
        return "Drink [id=" + id + ", name=" + name + ", type=" + type + "]";
    }


}