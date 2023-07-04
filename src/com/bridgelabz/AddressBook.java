package com.bridgelabz;

import java.util.Scanner;

public class AddressBook extends InputMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AddressBook addressBook=new AddressBook();
        System.out.println("Welcome to the address Book Program!!");
        addressBook.add();
        boolean result =true;
        while(result==true) {
            System.out.println();
            System.out.println("Select the option from following Menu");
            System.out.println("1.Add \n2.Edit \n3.Print \n4.Delete \n5.Stop");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    addressBook.addMultipleContact();
                    result=true;
                    break;
                case 2:
                    addressBook.edit();
                    result=true;
                    break;
                case 3:
                    addressBook.print();
                    result=true;
                    break;
                case 4:
                    addressBook.delete();
                    result=true;
                    break;
                case 5:
                    System.out.println("Thank You!!");
                    result=false;
                    break;
                default:
                    System.out.println("Invalid input!!");
                    System.out.println("Please choose  correct option");
                    result=true;
            }
        }
    }
}