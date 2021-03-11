
import java.util.ArrayList;
public class FruitsList {
    static ArrayList<String> fruitsList = new ArrayList<>();

    //metod för att lägga till en frukt
    public void addfruitItem(String item) {
       fruitsList.add(item);

    }
    //method för att spara in frukt in i Array
    public void printfruitList() {
            System.out.println("Du har " + fruitsList.size() + " Frukter i din listan");
            for (int i = 0; i < fruitsList.size(); i++) {
                System.out.println((i + 1) + "." + fruitsList.get(i));
            }

        }
    //method för att modifiera Array
    public void modifyfruitList ( int position, String newItem){
            fruitsList.set(position, newItem); //modifiera index
            System.out.println("frukt list " + (position) + " har ändrat");
        }
    //method för att ta bort en vara i Array
        public void removeItemFruitList(int position){
         fruitsList.get(position);
            fruitsList.remove(position);

        }
    //method för att hitta frukt i Array
        public String findItem (String searchItem){
            int position = fruitsList.indexOf(searchItem);
            if (position >= 0) {
                return fruitsList.get(position);
            }
            return null;
        }
    }


