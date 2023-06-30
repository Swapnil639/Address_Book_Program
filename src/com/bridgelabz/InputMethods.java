package com.bridgelabz;

import java.util.Scanner;

public class InputMethods {
    public static Contacts addContacts(int i) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter "+(i+1)+" person First name:");
        String firstName = scanner.next();
        System.out.println("Enter "+(i+1)+" person Last name:");
        String lastName = scanner.next();
        System.out.println("Enter "+(i+1)+" person Address:");
        String address = scanner.next();
        System.out.println("Enter "+(i+1)+" person City:");
        String city = scanner.next();
        System.out.println("Enter "+(i+1)+" person State:");
        String state = scanner.next();
        System.out.println("Enter "+(i+1)+" person Zip:");
        int zip = scanner.nextInt();
        System.out.println("Enter "+(i+1)+" person Phone Number:");
        long phoneNo = scanner.nextLong();
        System.out.println("Enter "+(i+1)+" person Email Id:");
        String email = scanner.next();

        Contacts person = new Contacts(firstName,lastName,address,city,state,zip,phoneNo,email);

        return person;
    }
}
