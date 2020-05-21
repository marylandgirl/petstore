package com.example.demo;

public class Pet {
    private String name;
    private int age;
    private String gender;
    private String petType;
    private String breedtype;

    public Pet() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public String getBreedtype() {
        return breedtype;
    }

    public void setBreedtype(String breedtype) {
        this.breedtype = breedtype;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", petType='" + petType + '\'' +
                ", breedtype='" + breedtype + '\'' +
                '}';
    }
}
