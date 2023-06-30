package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain extends InputMethods{
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        Scanner scanner=new Scanner(System.in);
        AddressBookMain addressBook=new AddressBookMain();
        System.out.println("How many Person you want to add in address book:");
        int input=scanner.nextInt();
        Contacts[] arr=new Contacts[input];
        for (int i = 0; i <input; i++) {
            arr[i]=addressBook.addContacts(i);
        }
        for (Contacts arr1:arr){
            System.out.println(arr1);
        }
    }
}
