import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args){
        // scanner
        Scanner scan = new Scanner(System.in);

        boolean finish = true;
        while (finish) {

            // choose test data size
            System.out.println("Please enter the size of test data you would like to test\n");
            int testSize = scan.nextInt();
            int testArray[] = new int[testSize];
            Random rand = new Random();
            System.out.println("\nThe array values are: ");
            for (int x = 0; x < testSize; x++) {
                testArray[x] = rand.nextInt(100) + 1;
                System.out.printf("%d ", testArray[x]);
            }


            // running algorithm
            System.out.println("\n\nPlease choose which algorithm you'd like to run or 0 to finish:\n\n1 (Bubble Sort)\n2 (Insertion Sort)\n3 (Selection Sort)\n4 (Shell Sort)\n5 (Merge Sort)\n6 (Heap Sort)\n7 (Quick Sort)\n8 (Quick3 Sort)\n");
            int alg = scan.nextInt();
            if (alg < 0)
                System.out.println("Invalid entry");
            else if (alg == 0)
                finish = false;
            System.out.printf("\nThe selected algorithm is %d\n", alg);

            if (alg == 1)
                runBubbleSort(testArray);

        }


    }

    private static void runBubbleSort(int[] testArray){

        int temp = 0, hold;
        boolean running = true;

        int z = 0;

        long timeStart = System.nanoTime();
        while (running){
            if (z == testArray.length)
                running = false;
            else if (temp > testArray[z]){
                hold = testArray[z];
                testArray[z] = temp;
                testArray[z-1] = hold;
                temp = 0;
                z = 0;
            }
            else {
                temp = testArray[z];
                z++;
            }
        }
        long timeEnd = System.nanoTime();
        long timeTotal = timeEnd - timeStart;
        double secondsDub = (double)timeTotal;
        double seconds = secondsDub / (Math.pow(10,9));

        System.out.println("\nPrinting the sorted array:");
        for (int k = 0; k < testArray.length; k++)
            System.out.printf("%d ", testArray[k]);

        System.out.printf("\n\nTime to run algorithm: %d nanoseconds / %.8f seconds\n\n", timeTotal, seconds);

    }

    private static void runInsertionSort(int[] testArray){

        for (int z = 1; z < testArray.length; z++){

            


        }



    }


}
