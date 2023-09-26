package com.capgemini.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args){
        //declare an arraylist and create an object of class Arraylist
        ArrayList<Object> a= new ArrayList<>();//<Object> is for all types

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=scanner.next();
        //add name element to the arraylist
        a.add(name);
System.out.println(a);

        System.out.println("Enter your date of birth: ");
        String dob=scanner.next();
        //add dob element to the arraylist
        a.add(dob);
        System.out.println(a);

       System.out.println("Enter your address: ");
        String address=scanner.next();
        //add address element to the arraylist
        a.add(address);

        System.out.println("Are you married? :");
        boolean status=scanner.nextBoolean();
        //add status element to the arraylist
        a.add(status);
//print a
        System.out.println(a);

        System.out.println("Enter your phone number :");
        String phoneNumber=scanner.next();
        //add status element to the arraylist
        a.add(phoneNumber);
        //print a
        System.out.println(a);



    }
}
