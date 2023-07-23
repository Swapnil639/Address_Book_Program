package com.bridgelabz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapClass {
    Scanner scanner = new Scanner(System.in);
    InputMethods inputMethods = new InputMethods();
    public void addBook(HashMap<String, ArrayList<Contacts>> hashMap) {
        InputMethods inputMethods = new InputMethods();
        ArrayList<Contacts> array = new ArrayList<>();
        System.out.println("Enter name of the Address Book : ");
        String bookName = scanner.next();
        if (hashMap.containsKey(bookName)){
            System.out.println("Address Book name already exist" );
            System.out.println("Entered to " +bookName + " book");
            inputMethods.add(hashMap.get(bookName));
        }else{
            int choice = 0 ;
            while(choice!=5){
                System.out.println("What do you want to perform inside " + bookName+ " book:");
                System.out.println("1.Add\n2.Edit\n3.Delete\n4.Print\n5.Search\n6.Stop");
                try {
                    choice=scanner.nextInt();
                }catch (Exception e){
                    System.out.println("Input mismatch Exception : "+e);
                    break;
                }
                switch (choice){ 
                    case 1 : inputMethods.add(array);
                        break;
                    case 2 : inputMethods.edit(array);
                        break;
                    case 3 : inputMethods.delete(array);
                        break;
                    case 4:  inputMethods.print(array);
                        break;
                    case 5: inputMethods.searchContactOrState(array);
                        break;
                    case 6:  System.out.println("\nThank You for " + bookName + " Book \n");
                        break;
                }
                hashMap.put(bookName,array);
            }
        }
    }

    public void toEdit(HashMap<String, ArrayList<Contacts>> hashMap) {
        System.out.println("Enter the name of the Address Book : ");
        String bookName = scanner.next();
        if (!hashMap.containsKey(bookName)){
            System.out.println("Address Book " + bookName + " which you are looking for does not exist!!");
        }else {
            ArrayList<Contacts> array = hashMap.get(bookName);
            inputMethods.edit(array);
        }
    }

    public void toDeleteBook(HashMap<String, ArrayList<Contacts>> hashMap){
        System.out.println("Enter the name of the Address Book : ");
        String bookName = scanner.next();
        if (!hashMap.containsKey(bookName)){
            System.out.println("Address Book " + bookName + " which you are looking for does not exist!!");
        }else {
            ArrayList<Contacts> array = hashMap.get(bookName);
            inputMethods.delete(array);
        }
    }

    public void listOfBookNames(HashMap<String, ArrayList<Contacts>> hashMap) {
        System.out.println("List of all the Address Books : ");
        for (Map.Entry<String, ArrayList<Contacts>> entry : hashMap.entrySet()){
            System.out.println(entry.getKey()+ " Address Book :");
            for (int  i =0; i< entry.getValue().size(); i++){
                System.out.println(entry.getValue().get(i).getFirstName()+ " "+
                        entry.getValue().get(i).getLastName()+ " "+
                        entry.getValue().get(i).getAddress()+ " "+
                        entry.getValue().get(i).getCity()+ " "+
                        entry.getValue().get(i).getState()+ " "+
                        entry.getValue().get(i).getPhoneNo()+ " "+
                        entry.getValue().get(i).getZip());
            }
            System.out.println();
        }
        System.out.println();
    }

    public void particularBookName(HashMap<String, ArrayList<Contacts>> hashMap) {
        System.out.println("Enter the name of the Address Book : ");
        String bookName = scanner.next();
        if (!hashMap.containsKey(bookName)){
            System.out.println("Address Book " + bookName + " which you are looking for does not exist!!");
        }else {
            ArrayList<Contacts> array = hashMap.get(bookName);
            inputMethods.print(array);
        }
    }

    public void searchBookWithName(HashMap<String, ArrayList<Contacts>> hashMap) {
        System.out.println("Enter the name you want to search : ");
        String contactName = scanner.next();//Swapnil
        int count=0;
        for (Map.Entry<String, ArrayList<Contacts>> entry : hashMap.entrySet()){
            for(int i = 0; i< entry.getValue().size(); i++){
                if(entry.getValue().get(i).getFirstName().equalsIgnoreCase(contactName)){
                    System.out.println(entry.getKey()+ " ");
                    count++;
                }
            }
        }
        if (count>=1){
            System.out.println("total no of times "+contactName+ "occurred : "+count);
        }else {
            System.out.println("Name "+contactName+ " does not exit");
        }
    }

    public void printMap(HashMap<String, ArrayList<Contacts>> hashMap) {
        for (Map.Entry<String,ArrayList<Contacts>> entry : hashMap.entrySet()){
            System.out.println(entry.getKey()+ " -> ");
            for (int i = 0; i<entry.getValue().size();i++){
                System.out.println(entry.getValue().get(i).getFirstName()+ " "+
                        entry.getValue().get(i).getLastName()+ " "+
                        entry.getValue().get(i).getAddress()+ " "+
                        entry.getValue().get(i).getCity()+ " "+
                        entry.getValue().get(i).getState()+ " "+
                        entry.getValue().get(i).getPhoneNo()+ " "+
                        entry.getValue().get(i).getZip());
            }
        }
    }
}
