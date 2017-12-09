public class BogoSort {

    private int[] listOfItems;

    public BogoSort(int[] listOfItems) {
        this.listOfItems = listOfItems;
    }

    public int[] sort() {
        while (!isSorted()){
            shuffle();
        }
        return listOfItems;
    }

    public void shuffle() {
        for(int i = listOfItems.length-1; i >=0; i--){
            int j = (int) (Math.random() * i);
            int temp = listOfItems[i];
            listOfItems[i] = listOfItems[j];
            listOfItems[j] = temp;
        }
    }

    public boolean isSorted() {
        for (int i = 0; i < listOfItems.length-1; i++){
            if(listOfItems[i] > (listOfItems[i+1]) ){
                return false;
            }
        }
        return true;
    }


    public void showArray(int[] listOfItems) {
        for (int i : listOfItems) {
            System.out.print(i + " ");
        }
    }

}
