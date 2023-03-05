package org.example.Lab4;

import java.util.Scanner;
//Вводится строка слов: целые числа и слова, составленные из букв.
//Написать программу на Java с двумя нитями процессов:
//1-ый процесс подсчитывает количество слов в строке;
//2-ой процесс подсчитывает количество цифр в строке и их сумму.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String input = scanner.nextLine();

        WordCounter wordCounter = new WordCounter(input);
        NumberCounter numberCounter = new NumberCounter(input);
        System.out.println("Количество процессоров: " + Runtime.getRuntime().availableProcessors());

        Thread t1 = new Thread(wordCounter);
        Thread t2 = new Thread(numberCounter);

        t1.start();
        t2.start();

        //даем всем потокам возможность закончить выполнение перед тем, как программа (главный поток) закончит свое выполнение
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Количество слов: " + wordCounter.getCount());
        System.out.println("Количество цифр: " + numberCounter.getCount());
        System.out.println("Сумма цифр: " + numberCounter.getSum());
    }
}