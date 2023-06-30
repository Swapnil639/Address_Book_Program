package com.bridgelabz;

import java.util.Scanner;

public class InputMethods {
    Scanner scanner = new Scanner(System.in);

    public void addContacts(int input, Contacts[] arr) {
        for (int i = 0; i < input; i++) {
            System.out.println("Enter " + (i + 1) + " person First name:");
            String firstName = scanner.next();
            System.out.println("Enter " + (i + 1) + " person Last name:");
            String lastName = scanner.next();
            System.out.println("Enter " + (i + 1) + " person Address:");
            String address = scanner.next();
            System.out.println("Enter " + (i + 1) + " person City:");
            String city = scanner.next();
            System.out.println("Enter " + (i + 1) + " person State:");
            String state = scanner.next();
            System.out.println("Enter " + (i + 1) + " person Zip:");
            int zip = scanner.nextInt();
            System.out.println("Enter " + (i + 1) + " person Phone Number:");
            long phoneNo = scanner.nextLong();
            System.out.println("Enter " + (i + 1) + " person Email Id:");
            String email = scanner.next();

            Contacts person = new Contacts(firstName, lastName, address, city, state, zip, phoneNo, email);
            arr[i] = person;
            System.out.println(arr[i]);
        }
    }

    public void editContact(int person, Contacts[] array) {
        System.out.println("What you want to Edit, select from following menu :");
        System.out.println("firstName, lastName, address, city, state, zip, phoneNo, email");
        String toEdit = scanner.next();

        switch (toEdit) {
            case "firstName":
                System.out.println("whose name you want to Edit");
                String oldName = scanner.next();
                for (int j = 0; j < person; j++) {
                    if (oldName.equals(array[j].getFirstName())) {
                        System.out.println("enter new firstname :");
                        String newName = scanner.next();
                        array[j].setFirstName(newName);
                    }
                }
                System.out.println("Successfully done");
                break;
            case "lastName":
                System.out.println("whose lastname you want to Edit");
                String oldLastname = scanner.next();
                for (int j = 0; j < person; j++) {
                    if (oldLastname.equals(array[j].getLastName())) {
                        System.out.println("enter new lastname :");
                        String newName = scanner.next();
                        array[j].setLastName(newName);
                    }
                }
                System.out.println("Successfully done");
                break;

            case "address":
                System.out.println("whose address you want to Edit");
                String oldAddress = scanner.next();
                for (int j = 0; j < person; j++) {
                    if (oldAddress.equals(array[j].getAddress())) {
                        System.out.println("enter new address :");
                        String newAddress = scanner.next();
                        array[j].setAddress(newAddress);
                    }
                }
                System.out.println("Successfully done");
                break;
            case "city":
                System.out.println("whose City you want to Edit");
                String oldCity = scanner.next();
                for (int j = 0; j < person; j++) {
                    if (oldCity.equals(array[j].getCity())) {
                        System.out.println("enter new City :");
                        String newCity = scanner.next();
                        array[j].setCity(newCity);
                    }
                }
                System.out.println("Successfully done");
                break;
            case "state":
                System.out.println("whose State you want to Edit");
                String oldState = scanner.next();
                for (int j = 0; j < person; j++) {
                    if (oldState.equals(array[j].getState())) {
                        System.out.println("enter new state :");
                        String newState = scanner.next();
                        array[j].setState(newState);
                    }
                }
                System.out.println("Successfully done");
                break;
            case "zip":
                System.out.println("whose zip you want to Edit");
                int oldZip = scanner.nextInt();
                for (int j = 0; j < person; j++) {
                    if (oldZip == array[j].getZip()) {
                        System.out.println("enter new zip :");
                        int newZip = scanner.nextInt();
                        array[j].setZip(newZip);
                    }
                }
                System.out.println("Successfully done");
                break;
            case "phoneNo":
                System.out.println("whose phone number you want to Edit");
                long oldPhone = scanner.nextLong();
                for (int j = 0; j < person; j++) {
                    if (oldPhone == array[j].getPhoneNo()) {
                        System.out.println("enter new phone number :");
                        long newPhone = scanner.nextLong();
                        array[j].setPhoneNo(newPhone);
                    }
                }
                System.out.println("Successfully done");
                break;
            case "email":
                System.out.println("whose email you want to Edit");
                String oldEmail = scanner.next();
                for (int j = 0; j < person; j++) {
                    if (oldEmail.equals(array[j].getEmail())) {
                        System.out.println("enter new Email :");
                        String newEmail = scanner.next();
                        array[j].setEmail(newEmail);
                    }
                }
                System.out.println("Successfully done");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
        for (int i = 0; i < person; i++) {
            System.out.println(array[i]);
        }
    }

    public void deleteContact(int person, Contacts[] array) {
        System.out.println("Enter name you want to delete:");
        String deleteName = scanner.next();
        for (int i = 0; i < person; i++) {
            if (deleteName.equals(array[i].getFirstName())) {
                for (int j = i; j < person - 1; j++) {
                    array[j] = array[j + 1];
                }
            }
        }
        for (int i = 0; i < person; i++) {
            System.out.println(array[i]);
        }

    }
}