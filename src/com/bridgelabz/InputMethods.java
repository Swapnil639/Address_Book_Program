package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputMethods {
    Scanner scanner = new Scanner(System.in);
    List<Contacts> contactsList = new ArrayList<>();

    public void add() {
        Contacts person = new Contacts();
        System.out.println("Enter person firstname : ");
        person.firstName = scanner.next();

        System.out.println("Enter person lastname : ");
        person.lastName = scanner.next();

        System.out.println("Enter person address : ");
        person.address = scanner.next();

        System.out.println("Enter person city : ");
        person.city = scanner.next();

        System.out.println("Enter person state : ");
        person.state = scanner.next();

        System.out.println("Enter person email : ");
        person.email = scanner.next();

        System.out.println("Enter person phoneNo : ");
        person.phoneNo = scanner.nextLong();

        System.out.println("Enter person zip : ");
        person.zip = scanner.nextInt();

        contactsList.add(person);
        System.out.println(contactsList);
    }

    public void print() {
        System.out.println();
        System.out.println("*******Address Book************");
        for (int i = 0; i < contactsList.size(); i++) {
            System.out.println(contactsList.get(i).firstName + " " + contactsList.get(i).lastName + " " + contactsList.get(i).address + " "
                    + contactsList.get(i).phoneNo + " " + contactsList.get(i).state + " " + contactsList.get(i).city + " " + contactsList.get(i).zip);
        }
    }

    public void edit() {
        System.out.println("What you want to Edit, select from following menu :");
        System.out.println("1.firstName \n2.lastName \n3.address \n4.city \n5.state \n6.zip \n7.phoneNo \n8.email");
        String toEdit = scanner.next();

        switch (toEdit) {
            case "1":
                System.out.println("whose name you want to Edit");
                String oldName = scanner.next();
                for (int j = 0; j < contactsList.size(); j++) {
                    if (oldName.equals(contactsList.get(j).getFirstName())) {
                        System.out.println("enter new firstname :");
                        String newName = scanner.next();
                        contactsList.get(j).setFirstName(newName);
                    }
                }
                System.out.println("Successfully done");
                break;
            case "2":
                System.out.println("whose lastname you want to Edit");
                String oldLastname = scanner.next();
                for (int j = 0; j < contactsList.size(); j++) {
                    if (oldLastname.equals(contactsList.get(j).getLastName())) {
                        System.out.println("enter new lastname :");
                        String newName = scanner.next();
                        contactsList.get(j).setLastName(newName);
                    }
                }
                System.out.println("Successfully done");
                break;

            case "3":
                System.out.println("whose address you want to Edit");
                String oldAddress = scanner.next();
                for (int j = 0; j < contactsList.size(); j++) {
                    if (oldAddress.equals(contactsList.get(j).getAddress())) {
                        System.out.println("enter new address :");
                        String newAddress = scanner.next();
                        contactsList.get(j).setAddress(newAddress);
                    }
                }
                System.out.println("Successfully done");
                break;
            case "4":
                System.out.println("whose city you want to Edit");
                String oldCity = scanner.next();
                for (int j = 0; j < contactsList.size(); j++) {
                    if (oldCity.equals(contactsList.get(j).getCity())) {
                        System.out.println("enter new City :");
                        String newCity = scanner.next();
                        contactsList.get(j).setCity(newCity);
                    }
                }
                System.out.println("Successfully done");
                break;
            case "5":
                System.out.println("whose state you want to Edit");
                String oldState = scanner.next();
                for (int j = 0; j < contactsList.size(); j++) {
                    if (oldState.equals(contactsList.get(j).getState())) {
                        System.out.println("enter new state :");
                        String newState = scanner.next();
                        contactsList.get(j).setState(newState);
                    }
                }
                System.out.println("Successfully done");
                break;
            case "6":
                System.out.println("whose zip you want to Edit");
                int oldZip = scanner.nextInt();
                for (int j = 0; j < contactsList.size(); j++) {
                    if (oldZip == contactsList.get(j).getZip()) {
                        System.out.println("enter new zip :");
                        int newZip = scanner.nextInt();
                        contactsList.get(j).setZip(newZip);
                    }
                }
                System.out.println("Successfully done");
                break;
            case "7":
                System.out.println("whose phone number you want to Edit");
                long oldPhone = scanner.nextLong();
                for (int j = 0; j < contactsList.size(); j++) {
                    if (oldPhone == contactsList.get(j).getPhoneNo()) {
                        System.out.println("enter new phone number :");
                        long newPhone = scanner.nextLong();
                        contactsList.get(j).setPhoneNo(newPhone);
                    }
                }
                System.out.println("Successfully done");
                break;
            case "8":
                System.out.println("whose email you want to Edit");
                String oldEmail = scanner.next();
                for (int j = 0; j < contactsList.size(); j++) {
                    if (oldEmail.equals(contactsList.get(j).getEmail())) {
                        System.out.println("enter new email :");
                        String newEmail = scanner.next();
                        contactsList.get(j).setEmail(newEmail);
                    }
                }
                System.out.println("Successfully done");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
        System.out.println(contactsList);
    }

    public void delete() {
        System.out.println("Enter name you want to delete:");
        String deleteName = scanner.next();
        for (int i = 0; i < contactsList.size(); i++) {
            if (deleteName.equals(contactsList.get(i).getFirstName())) {
                contactsList.remove(i);
            }
        }
        for (int i = 0; i < contactsList.size(); i++) {
            System.out.println(contactsList.get(i).getFirstName() + " " + contactsList.get(i).getLastName() + " " + contactsList.get(i).getAddress() + " "
                    + contactsList.get(i).getCity() + " " + contactsList.get(i).getState() + " " + contactsList.get(i).getEmail() + " " + contactsList.get(i).getZip() + " " + contactsList.get(i).getPhoneNo());
        }
    }

    public void addMultipleContact() {
        System.out.println("Enter Number of Contacts to Add into Contact Book");
        int number=scanner.nextInt();
        for (int i = 0; i <number; i++) {
            add();
            System.out.println(i + 1 + " Contact added successfully");
        }
    }
}