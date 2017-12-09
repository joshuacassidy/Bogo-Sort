import java.util.Random;

public class BogoSort<T extends Comparable<T>> {

    private T[] listOfItems;

    public BogoSort(T[] listOfItems) {
        this.listOfItems = listOfItems;
    }

    public T[] sort() {
        while (!isSorted()){
            shuffle();
        }
        return listOfItems;
    }

    public void shuffle() {
        for(int i = listOfItems.length-1; i >=0; i--){
            int j = new Random().nextInt(i+1);
            T temp = listOfItems[i];
            listOfItems[i] = listOfItems[j];
            listOfItems[j] = temp;
        }
    }

    public boolean isSorted() {
        for (int i = 0; i < listOfItems.length-1; i++){
            if(listOfItems[i].compareTo(listOfItems[i+1]) >0 ){
                return false;
            }
        }
        return true;
    }


    public void showArray(T[] listOfItems) {
        for (T i : listOfItems) {
            System.out.print(i + " ");
        }
    }

}
