import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args){
        // scanner
        Scanner scan = new Scanner(System.in);


        // choose test data size
        System.out.println("Please enter the size of test data you would like to test\n");
        int testSize = scan.nextInt();
        int testArray[] = new int[testSize];
        Random rand = new Random();
        for (int x = 0; x < testSize; x++){
            testArray[x] = rand.nextInt(testSize) + 1;
            System.out.printf("\nThe value of the array at %d is %d", x, testArray[x]);
        }


        // running algorithm
        System.out.println("\n\nPlease choose which algorithm you'd like to run:\n\n1 (Bubble Sort)\n2 (Insertion Sort)\nOther\n");
        int alg = scan.nextInt();
        if (alg <= 0)
            System.out.println("Invalid entry");
        System.out.printf("\nThe selected algorithm is %d\n", alg);


    }


}
