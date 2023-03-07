package com.petNameGenerator.model;

public class Pet {

    private String house;
    private String name;
    private String gender;
    private String personality;

    public Pet() {
    }

    public Pet(String name, String gender, String personality) {
        this.name = name;
        this.gender = gender;
        this.personality = personality;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPersonality() {
        return personality;
    }

    public void setPersonality(String personality) {
        this.personality = personality;
    }
}
