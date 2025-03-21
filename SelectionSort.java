import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {
        int size = 10000;
        ArrayList<Integer> list = new ArrayList<>(size);
        Random random = new Random();


        for (int i = 0; i < size; i++) {
            list.add(random.nextInt());
        }

    
        long startTime = System.currentTimeMillis();
        int iterations = selectionSort(list);
        long endTime = System.currentTimeMillis();

        System.out.println("Number of iterations: " + iterations);
        System.out.println("Runtime: " + (endTime - startTime) + " milliseconds");
    }

    public static int selectionSort(ArrayList<Integer> list) {
        int n = list.size();
        int iterations = 0;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                iterations++;
                if (list.get(j) < list.get(minIndex)) {
                    minIndex = j;
                }
            }
            
            Collections.swap(list, minIndex, i);
        }
        return iterations;
    }
}
