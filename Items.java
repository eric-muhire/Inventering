
import java.util.Scanner;
public class Items {
    public static FruitsList fruitsList=new FruitsList();
    public static VegetablesList vegetablesList=new VegetablesList();
    public static Scanner scanner=new Scanner(System.in);

    public static void printInstructions() {

            //metod för att skriva ut
    }

    public static void addFruitItem() {
        System.out.println("Skriv in din frukt");
        fruitsList.addfruitItem(scanner.nextLine());
    }
        public static void addVegetableItem(){
            System.out.println("Skriv in din grönsak");
            vegetablesList.addVegetableItem(scanner.nextLine());

        }


    public static void modifyItem(){
        System.out.println("Skriv in vara nr");
        int itemNo=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Skriv in ersättninsvara");
        String newItem=scanner.nextLine();
        fruitsList.modifyfruitList(itemNo -1, newItem);
    }
    public static void removeItem(){
        System.out.println("Skriv in vara nr");
        int itemNo=scanner.nextInt();
        scanner.nextLine();
        fruitsList.removefruitList(itemNo -1);
    }
    public static void searchForItem(){
        System.out.println("Vara att leta efter ");
        String searchItem=scanner.nextLine();
        if (fruitsList.findItem(searchItem)!=null) {
            System.out.println(searchItem +", hittades " + " i listan med varor");
        }else if(vegetablesList.findItem(searchItem)!=null){
            System.out.println(searchItem +", hittades " + " i listan med varor");

        }else{
            System.out.println(searchItem + " vara är inte med i listan");
        }
    }


}

