

import java.util.Scanner;

public class InventorySystem {
    public static FruitsList fruitsList = new FruitsList();
    public static Scanner scanner = new Scanner(System.in);
    public static Items items = new Items();
    public static VegetablesList vegetablesList = new VegetablesList();

    public static void main(String[] args) {

        ///Inventory System
        boolean runProgram = true;
        int choice = 0;
        items.printInstructions();//Startar menu
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
                    items.printInstructions();
                    break;
                case 1:                                 //Skriva ut listan
                   fruitsList.printfruitList();

                    vegetablesList.printVegetableList();

                    break;
                case 2:
                    items.addFruitItem();
                   // System.out.println("Skriv in frukt");
                    //fruitsList.addfruitItem(scanner.nextLine());
                    items.addVegetableItem();

                    /*System.out.println("Skriv in frukt");

                    fruitsList.addfruitItem(scanner.nextLine());
                    fruitsList.addfruitItem(scanner.nextLine());

                    System.out.println("Skriv in grönsak");
                    vegetablesList.addVegetableItem(scanner.nextLine());

                    vegetablesList.addVegetableItem(scanner.nextLine());*/

                    break;
                case 3:
                    items.modifyItem();

                    break;
                case 4:
                    items.removeItem();
                    break;
                case 5:

                    Items.searchForItem();
                    break;
                case 6:
                    runProgram = false;
                    break;

            }
        }

    }
}







