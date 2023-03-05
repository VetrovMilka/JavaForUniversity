package org.example.Lab0;

/*Создать класс Matrix, содержащий двумерный массив nxm целого типа, организовать ввод-вывод массива,
 поиск минимального и максимального элементов.
 Для ввода использовать класс Scanner, а для вывода метод System.out.println().*/


public class Main {
    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        matrix.enterArr();
        matrix.showArr();
        matrix.showMin();
        matrix.showMax();
    }
}