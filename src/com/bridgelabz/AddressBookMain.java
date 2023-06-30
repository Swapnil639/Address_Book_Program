package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain extends InputMethods {
    public static void main(String[] args) {
        String s;
        System.out.println("Welcome to Address Book Program");
        Scanner scanner = new Scanner(System.in);
        AddressBookMain addressBook = new AddressBookMain();
        System.out.println("How many Person you want to add in address book:");
        int input = scanner.nextInt();
        Contacts[] arr = new Contacts[input];
        do {
            System.out.println("1.Add Contact \n2.Edit Contact");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    addressBook.addContacts(input, arr);
                    break;
                case 2:
                    addressBook.editContact(input,arr);
                    break;
                default:
                    System.out.println("Invalid Option");
            }
            System.out.println("if you want to continue press (y/Y) otherwise press n) ");
            s = scanner.next();
        } while (s.equals("y") || s.equals("Y"));
    }
}
