package com.polhdez.m14.Beans;

import javax.persistence.*;

@Entity
@Table(name="paintings")
public class Painting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String author;
    private int shopid;

    public Painting() {}

    public Painting(String name, String author, int shopid) {
        this.name = name;
        this.author = author;
        this.shopid = shopid;
    }

    public long getId() {
        return this.id;
    }

    public String getName()  {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor()  {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getShopid() {
        return this.shopid;
    }

    public void setShopid(int shop_id)  {
        this.shopid = shopid;
    }
}
