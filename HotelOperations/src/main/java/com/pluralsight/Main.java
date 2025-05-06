package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        Room room112 = new Room(1,189, true, true);
        System.out.println(room112.isAvailable());

        Room room113 = new Room(1,189, false, true);
        System.out.println(room113.isAvailable());

        Room room114 = new Room(1,189, false, false);
        System.out.println(room114.isAvailable());

    }
}
