package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        Scanner scanner = new Scanner(System.in);
        Contacts person = new Contacts();
        System.out.println("Enter First name:");
        person.firstName = scanner.next();
        System.out.println("Enter Last name:");
        person.lastName = scanner.next();
        System.out.println("Enter Address:");
        person.address = scanner.next();
        System.out.println("Enter City:");
        person.city = scanner.next();
        System.out.println("Enter State:");
        person.state = scanner.next();
        System.out.println("Enter Zip:");
        person.zip = scanner.nextInt();
        System.out.println("Enter Phone Number:");
        person.phoneNo = scanner.nextLong();
        System.out.println("Enter Email Id:");
        person.email = scanner.next();

        System.out.println(person);

    }
}
