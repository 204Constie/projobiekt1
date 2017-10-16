package com.company;

public class Main {

    public static void main(String[] args) {
	    Client client = new Client();
	    Flight fl1 = client.makeReservation("Singapore");
        System.out.println("fl1: " + fl1.getWhere());
        Flight fl2 = client.makeReservation("Sri Lanka");
        System.out.println("fl2: " + fl2.getWhere());
    }
}
