/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thi;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.createMenu();
        // TODO code application logic here
    }

    public void createMenu() {
        PassengercController passengercController = new PassengercController();
        while (true) {
            System.out.println("Menu");
            System.out.println("1.Add reservation");
            System.out.println("2.Modify passenger records");
            System.out.println("3.Display passenger records");
            System.out.println("4.Exit");
            Scanner scanner = new Scanner(System.in);
            String strChoice = scanner.nextLine();
            int choice;
            try {
                choice = Integer.parseInt(strChoice);
            } catch (java.lang.NumberFormatException e) {
                System.err.println("Please enter a number.");
                continue;
            }
            if (choice == 4) {
                System.out.println("GoodBye!!!");
                break;
            } else {
                switch (choice) {
                    case 1:
                        passengercController.addReservation();
                        break;
                    case 2:
                        passengercController.modifyPassenger();
                        break;
                    case 3:
                        passengercController.displayPassenger();
                        break;
                    default:
                        System.err.println("Please Enter Number From 1 to 4.");
                        break;
                }
            }
        }
    }
}
