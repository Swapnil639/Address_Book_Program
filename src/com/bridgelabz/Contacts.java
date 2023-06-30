package com.bridgelabz;

public class Contacts {
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    int zip;
    long phoneNo;
    String email;

    public Contacts(String firstName, String lastName, String address, String city, String state, int zip, long phoneNo, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNo = phoneNo;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                ", phoneNo=" + phoneNo +
                ", email='" + email + '\'' +
                '}';
    }
}
