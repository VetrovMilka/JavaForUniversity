package org.example.Lab1;
//Создайте иерархию классов Сторона - Шестиугольник - Карандаш.
// Карандаш может быть мягким и твердым. Класс Карандаш должен содержать метод, определяющий объём карандаша.
// Кроме того, класс должен содержать метод, который определяет,
// как быстро списывается карандаш в зависимости от твердости.
// Мягкий списывается со скоростью 3 мм в день, а твердый - 2 мм.
// Создать метод MAIN, в котором создается 3 карандаша: 1 твердый и 2 мягких.
// Определить какой из них спишется быстрее.

public class Main {
    public static void main(String[] args) {
        Pencil pencil1 = new Pencil(3, 9, true);
        Pencil pencil2 = new Pencil(2, 5, false);
        Pencil pencil3 = new Pencil(5, 12, false);

        pencil1.getVolume();
        pencil1.grindingSpeed();

        pencil2.getVolume();
        pencil2.grindingSpeed();

        pencil3.getVolume();
        pencil3.grindingSpeed();

    }
}
