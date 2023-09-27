package com.capgemini.clone;

import java.util.Scanner;

public class ProgramForClone {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your name:");
        Cricketer c=new Cricketer(scanner.next());
        System.out.println(c.name);
        Cricketer c2=new Cricketer(scanner.next());
        System.out.println(c2.name);

    }
}
