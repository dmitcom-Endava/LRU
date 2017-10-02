package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LRU lru= new LRU();
        lru.getRandomAccess();
        System.out.println(" print LRU after accessing to elements 6,7,8,9");
        lru.printUlrCash();
        System.out.println("add new user 200 ");
        lru.addUser();
        System.out.println("---------");
        lru.printUlrCash();
    }
}
