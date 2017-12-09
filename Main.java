public class Main {
    public static void main(String[] args) {
        BogoSort<Integer> bogoSort = new BogoSort(new Integer[] {32,234,13,22,88,44,33,1});
        bogoSort.showArray(bogoSort.sort());
    }
}
