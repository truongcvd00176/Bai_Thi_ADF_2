/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thi;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
class PassengercController {

    static PriorityQueue<Passenger> listPassenger = new PriorityQueue<>();

    public void addReservation() {
        System.out.println("Add Reservation");
        Scanner scanner = new Scanner(System.in);

        int id1;

        System.out.println("ID");
        String id = scanner.nextLine();

        try {
            id1 = Integer.parseInt(id);
            System.out.println("Name");
            String name = scanner.nextLine();
            System.out.println("Address");
            String address = scanner.nextLine();
            System.out.println("Phone");
            String phone = scanner.nextLine();
            System.out.println("Date Departure");
            String dateDeparture = scanner.nextLine();
            System.out.println("Date Return");
            String dateReturn = scanner.nextLine();
            System.out.println("You Want Add This Passenger???\nY/N:");
            String choice = scanner.nextLine();
            switch (choice) {
                case "Y":
                case "y":
                    Passenger passenger = new Passenger();
                    passenger.setId(id1);
                    passenger.setName(name);
                    passenger.setAddress(address);
                    passenger.setPhone(phone);
                    passenger.setDateDeparture(dateDeparture);
                    passenger.setDateReturn(dateReturn);

                    listPassenger.add(passenger);
                    break;
                case "N":
                case "n":
                    System.out.println("..Back To Menu..");
            }

        } catch (java.lang.NumberFormatException e) {
            System.err.println("Please enter a number.");

        }

    }

    public void modifyPassenger() {
        Scanner scanner = new Scanner(System.in);
        int id2;
        System.out.println("ID");
        String id = scanner.nextLine();
        try {
            id2 = Integer.parseInt(id);

            for (Passenger passenger : listPassenger) {
                if (passenger.getId() == id2) {
                    System.out.println("ID: " + passenger.getId());
                    System.out.println("Name: " + passenger.getName());
                    System.out.println("Address: " + passenger.getAddress());
                    System.out.println("Phone: " + passenger.getPhone());
                    System.out.println("Date Departure:" + passenger.getDateDeparture());
                    System.out.println("Date Return: " + passenger.getDateReturn());
                    System.out.println("You Want Edit This Passenger???\nY/N:");
                    String choice = scanner.nextLine();
                    switch (choice) {
                        case "Y":
                        case "y":
                            System.out.println("Name");
                            String name = scanner.nextLine();
                            System.out.println("Address");
                            String address = scanner.nextLine();
                            System.out.println("Phone");
                            String phone = scanner.nextLine();
                            System.out.println("Date Departure");
                            String dateDeparture = scanner.nextLine();
                            System.out.println("Date Return");
                            String dateReturn = scanner.nextLine();
                            Passenger p = new Passenger();
                            p.setId(id2);
                            p.setName(name);
                            p.setAddress(address);
                            p.setPhone(phone);
                            p.setDateDeparture(dateDeparture);
                            p.setDateReturn(dateReturn);
                            listPassenger.remove(passenger);
                            listPassenger.add(p);
                            break;
                        case "N":
                        case "n":
                            System.out.println("..Back To Menu..");
                    }
                }
            }

        } catch (java.lang.NumberFormatException e) {
            System.err.println("Please enter a number.");

        }
    }

    public void displayPassenger() {
        System.out.println("--------------List Passenger--------------");
        for (Passenger passenger : listPassenger) {
            System.out.println("ID: " + passenger.getId());
            System.out.println("Name: " + passenger.getName());
            System.out.println("Address: " + passenger.getAddress());
            System.out.println("Phone: " + passenger.getPhone());
            System.out.println("Date Departure:" + passenger.getDateDeparture());
            System.out.println("Date Return: " + passenger.getDateReturn());
        }

    }

}
