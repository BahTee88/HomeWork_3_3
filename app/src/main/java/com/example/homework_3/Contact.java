package com.example.homework_3;

public class Contact {
    private String age;
    private String name;
    private String surname;

    public Contact(String age, String name, String surname) {
        this.age = age;
        this.name = name;
        this.surname = surname;
    }
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}