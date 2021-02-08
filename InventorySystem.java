package com.inventering;

import java.util.ArrayList;
import java.util.Scanner;

public class InventorySystem {
    public ArrayList<String> fruitsList = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        Items items = new Items();
        FruitsList fruitsList = new FruitsList();
        VegetablesList vegetablesList = new VegetablesList();

        ///Inventory System
        boolean runProgram = true;
        int choice = 0;
        printInstructions();//Startar menu
        System.out.println(" ");
        while (runProgram) {

            System.out.println("Var god och välj alternativ:");
            System.out.println("============================");

            //Menulistan
            System.out.println("Ange 0 Huvud Meny" +
                    "\nAnge 1 Skriv ut listan på varorna" +
                    "\nAnge 2 Lägg till en vara" +
                    "\nAnge 3 Modifiera en vara i listan" +
                    "\nAnge 4 Ta bort en vara ur listan" +
                    "\nAnge 5 Leta efter en vara" +
                    "\nAnge 6 Avsluta programmet");

            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    fruitsList.printfruitList();
                    scanner.nextLine();
                    vegetablesList.printVegetableList();
                    break;
                case 2:
                    System.out.print("Skriv in frukt:");
                    fruitsList.addfruitItem(scanner.nextLine());



                    System.out.print("Skriv in grönsak:");
                    vegetablesList.addVegetableItem(scanner.nextLine());

                    vegetablesList.addVegetableItem(scanner.nextLine());




                    break;
                case 3:
                    items.modifyItem();

                    break;
                case 4:
                    items.removeItem();
                    break;
                case 5:
                    items.searchForItem();
                    break;
                case 6:
                    runProgram = false;
                    break;

            }
        }

    }

    //metod för att skriva ut menulistan
   static void printInstructions() {

    }
}



