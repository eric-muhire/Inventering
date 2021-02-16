
import java.util.ArrayList;

public class FruitsList {

    public static ArrayList<String> fruitsList = new ArrayList<>();

    public void addfruitItem(String item) {
        fruitsList.add(item);

}
        public void printfruitList () {
            System.out.println("Du har " + fruitsList.size() + " Frukter i din listan");
           for (int i = 0; i < fruitsList.size(); i++) {
               System.out.println((i + 1) + "."+ fruitsList.get(i));
           }
        }

        public void modifyfruitList ( int position, String newItem){
            fruitsList.set(position, newItem);
            System.out.println("frukt list" + (position) + "har ändrat");

        }
        public void removefruitList ( int position){
            String theItem = fruitsList.get(position);
            fruitsList.remove(position);
        }
        public String findItem (String searchItem){
            int position = fruitsList.indexOf(searchItem);
            if (position >= 0) {
                return fruitsList.get(position);
            }
            return null;
        }


    }

