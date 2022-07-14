package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue
    private String categoryid;
    private String categoryname;

    public Category() {
    }

    public Category(String categoryid, String categoryname) {
        this.categoryid = categoryid;
        this.categoryname = categoryname;
    }

    public String getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(String categoryid) {
        this.categoryid = categoryid;
    }

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryid='" + categoryid + '\'' +
                ", categoryname='" + categoryname + '\'' +
                '}';
    }
}
