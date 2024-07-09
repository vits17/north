package com.todo.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name="todo" )
//if we dont add @table for table name then jpa will by default make entity table as classname
public class todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "state")
    //if we dont prove @column name jpa will provide colname
    private String state;
    @Column(name = "city")
    private String city;
    @Column(name = "shop_name",nullable = false)
    private String shopname;

    public todo()// hibernate  creates objects dynamically so creates default contructor
    {

    }
    public todo( String shopname,String state, String city) {

        this.state = state;
        this.city = city;
        this.shopname = shopname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }


}
