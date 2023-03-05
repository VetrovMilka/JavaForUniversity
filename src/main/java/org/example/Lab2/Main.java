package org.example.Lab2;

//1.     Создать собственное исключение (class).
//2.     Создать метод (throw), который может возбуждать это исключение(throws).
//3.     Написать метод, перехватывающий и обрабатывающий исключение (try-catch), возбуждаемое другим методом.
//Исключение: с консоли вводятся имена членов клуба. Добиться ввода только кличек из заранее подготовленного списка.
public class Main {
    public static void main(String[] args) {
        NicknameService nicknameService = new NicknameService();
        try {
            nicknameService.enterNicknames();
        }
        catch (NotNicknameException e){
            System.out.println("Exception handled: " +
                    e.getClass() +
                    " with parameter \"" +
                    e.getLocalizedMessage() +
                    "\"");
        }
    }
}
