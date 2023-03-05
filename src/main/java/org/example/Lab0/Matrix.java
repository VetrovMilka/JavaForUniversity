package org.example.Lab0;

import java.util.IntSummaryStatistics;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Matrix {
    int n;
    int m;
    int[][] array;
    Scanner scanner = new Scanner(System.in);
    public Matrix(){

        System.out.println("Enter n dimension: ");
        n = scanner.nextInt();
        System.out.println("Enter m dimension: ");
        m = scanner.nextInt();
        array = new int[n][m];

    }
    public void enterArr(){

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                System.out.printf("\nArray[%d][%d] = ", i, j);
                array[i][j] = scanner.nextInt();
            }
        }
    }
    public void showArr(){
        System.out.println("\nYour array is:");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println("\n");
        }
    }

    public void showMin(){
        IntSummaryStatistics stats = Stream.of(array)
                .flatMapToInt(IntStream::of)
                .summaryStatistics();
        System.out.println("Min = " + stats.getMin());
    }

    public void showMax(){
        IntSummaryStatistics stats = Stream.of(array)
                .flatMapToInt(IntStream::of)
                .summaryStatistics();
        System.out.println("Max = " + stats.getMax());
    }
}
