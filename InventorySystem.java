
import java.util.Scanner;
public class InventorySystem {

    public static void main(String[] args) {
      FruitsList fruitsList = new FruitsList();
        VegetablesList vegetablesList = new VegetablesList();
        Items display = new Items();
        Scanner Input = new Scanner(System.in);
            ///Inventory System
            boolean runProgram = true;
            int choice;
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

                choice = Input.nextInt();
                Input.nextLine();
                switch (choice) {
                    case 0:
                        display.printInstructions();
                        break;
                    case 1:

                        fruitsList.printfruitList();

                        vegetablesList.printVegetableList();

                        break;
                    case 2:
                        display.addFruitItem();

                        display.addVegetableItem();

                        break;
                    case 3:
                        display.modifyFruit();
                        display.modifyVegetable();
                        break;
                    case 4:
                        display.removeItem();
                        break;
                    case 5:
                        Items.searchForItem();
                        break;
                    case 6:
                        runProgram = false;
                        break;
                    default:
                        System.out.println("Error:fel val.");
                        break;
                }
            }
        }
    }









