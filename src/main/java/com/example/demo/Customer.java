package com.example.demo;

public class Customer {

    private String name;
    private String phone;
    private Pet pet;

    public Customer() {
        pet = new Pet();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        /*return "Customer{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", pet=" + pet +
                '}';*/

        return name + " " + phone + " " + pet.getBreedtype();
    }
}
