
import java.util.Scanner;
public class Items {
    static FruitsList fruitsList = new FruitsList();
    public static VegetablesList vegetablesList = new VegetablesList();
    public static Scanner Input = new Scanner(System.in);

    //metod för att skriva ut
    public void printInstructions() {
    }
    //metod för att få input från användare gällande registrering av frukter
    public static void addFruitItem() {
        System.out.println("Skriv in din frukt");
        fruitsList.addfruitItem(Input.nextLine());

    }
    //metod för att få input från användare gällande registrering av grönsaker
    public static void addVegetableItem() {
        System.out.println("Skriv in din grönsak");
        vegetablesList.addVegetableItem(Input.nextLine());
    }
    public static void modifyFruit() {
        System.out.println("Skriv in vara nr");
        int itemNo = Input.nextInt();
        Input.nextLine();
        System.out.println("Skriv in ersättninsvara");
        String newItem = Input.nextLine();
        fruitsList.modifyfruitList(itemNo - 1, newItem);
    }
    public static void modifyVegetable() {
        System.out.println("Skriv in vara nr");
        int itemNo = Input.nextInt();
        Input.nextLine();
        System.out.println("Skriv in ersättninsvara");
        String newItem = Input.nextLine();

        vegetablesList.modifyVegetableList(itemNo - 1, newItem);
    }

    public static void removeItem(){
        System.out.println("Skriv in vara nr");
        int itemNo= Input.nextInt();
        Input.nextLine();
        fruitsList.removeItemFruitList(itemNo -1);
        vegetablesList.removeItemVegetableList(itemNo -1);
    }
    public static void searchForItem(){
        System.out.println("Vara att leta efter ");
        String searchItem= Input.nextLine();
        if (fruitsList.findItem(searchItem)!=null) {
            System.out.println(searchItem +", hittades " + " i listan med varor");
        }else if(vegetablesList.findItem(searchItem)!=null){
            System.out.println(searchItem +", hittades " + " i listan med varor");

        }else{
            System.out.println(searchItem + " vara är inte med i listan");
        }
    }
}

