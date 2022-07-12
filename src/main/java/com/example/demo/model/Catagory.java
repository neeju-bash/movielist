package com.example.demo.model;


public class Catagory {
    private int cid;
    private String name;
    private String description;

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Catagory [cid=" + cid + ", name=" + name + ", description=" + description + "]";
    }
}