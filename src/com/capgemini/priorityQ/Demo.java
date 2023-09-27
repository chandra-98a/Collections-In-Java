package com.capgemini.priorityQ;

import java.util.PriorityQueue;

public class Demo {
    public static void main(String [] args){
        PriorityQueue priorityQueue=new PriorityQueue<>();
        priorityQueue.add(100);
        priorityQueue.add(20);
        priorityQueue.add(34);
        priorityQueue.add(40);
        //order of insertion can never retain ,
       // priorityQueue.add("samu"); priority queue cannot cast Strings
        System.out.println(priorityQueue);

    }
}
