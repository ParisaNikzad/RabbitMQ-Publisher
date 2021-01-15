package com.pn.rabbitmq;

import java.io.Serializable;

public class Employee implements Serializable {

    private String name;
    private String title;

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
