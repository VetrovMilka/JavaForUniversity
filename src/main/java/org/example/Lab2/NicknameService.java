package org.example.Lab2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NicknameService {
    private static final List<String> listOfNicknames = new ArrayList<>(Arrays.asList("Lebron", "Milka", "Ronaldo"));
    private static final List<String> getListOfNicknames = new ArrayList<>();
    public void enterNicknames() throws NotNicknameException {
        System.out.println("Enter nicknames:");
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String nickname = scanner.next();
            if (listOfNicknames.contains(nickname)) {
                getListOfNicknames.add(nickname);
            } else {
                throw new NotNicknameException(nickname);
            }

        }
        scanner.close();
        System.out.println("The result list contains: ");
        getListOfNicknames.forEach(System.out::println);
    }
}
