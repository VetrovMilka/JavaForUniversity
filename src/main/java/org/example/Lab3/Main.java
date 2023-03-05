package org.example.Lab3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
1) класс String, StringBuffer
2) коллекции,
3) регулярные выражения (www.regexr.com)
4) избегать, по возможности, работы на уровне отдельных символов.

Дан набор файлов.
В файле query1 выбрать все строки, в которых фамилия сотрудника начинается на букву 'M'.
В файле query4 выбрать все строки, в которых сумма не имеет копеек.
В файле query3 выбрать все строки, в которых минимальная цена меньше 10, а максимальная цена не меньше 10.
Создать и отсортировать коллекцию на основе информации (по вашему выбору) из данного файла.*/
public class Main {
    public static void main(String[] args) throws IOException {
        query1Method();
        System.out.println();
        query2Method();
        System.out.println();
        query3Method();
        System.out.println();
        query2SortMethod();
    }
    public static void query1Method() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("Lab3Java_FILES/query1.txt"));
        String data;
        ArrayList<String> query1Array =  new ArrayList<>();

        while((data = reader.readLine()) != null) {
            data = data.replaceAll("\\p{C}", "");
            data = data.replaceAll("\\s+", " ");
            query1Array.add(data);
        }

        List<String> resultList = query1Array.stream()
                .filter(x -> {
                    String[] words = x.split(" ");
                    return words[3].startsWith("M");
                })
                .toList();
        resultList.forEach(System.out::println);
    }
    public static void query2Method() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("Lab3Java_FILES/query4.txt"));
        String data;
        ArrayList<String> query1Array =  new ArrayList<>();

        while((data = reader.readLine()) != null) {
            data = data.replaceAll("\\p{C}", "");
            data = data.replaceAll("\\s+", " ");
            query1Array.add(data);
        }

        List<String> resultList = query1Array.stream()
                .filter(x -> {
                    String[] words = x.split(" ");
                    return !words[4].contains(".");
                })
                .toList();
        resultList.forEach(System.out::println);
    }
    public static void query3Method() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("Lab3Java_FILES/query3.txt"));
        String data;
        ArrayList<String> query1Array =  new ArrayList<>();

        while((data = reader.readLine()) != null) {
            data = data.replaceAll("\\p{C}", "");
            data = data.replaceAll("\\s+", " ");
            query1Array.add(data);
        }

        List<String> resultList = query1Array.stream()
                .filter(x -> {
                    x = x.replaceAll("\\s+", "");
                    String[] words = x.split("!");
                    return Float.parseFloat(words[2])>=10 && Float.parseFloat(words[3])<10;
                })
                .toList();
        resultList.forEach(System.out::println);
    }
    public static void query2SortMethod() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("Lab3Java_FILES/query2.txt"));
        String data;
        ArrayList<String> query1Array =  new ArrayList<>();

        while((data = reader.readLine()) != null) {
            data = data.replaceAll("\\p{C}", "");
            data = data.replaceAll("\\s+", " ");
            query1Array.add(data);
        }

        List<String> resultList = query1Array.stream()
                .sorted(Comparator.comparing(x -> {
                    x = x.replaceAll("\\s+", "");
                    String[] words = x.split(":");
                    return Integer.parseInt(words[7]);
                }))
                .toList();
        resultList.forEach(System.out::println);
    }

}
