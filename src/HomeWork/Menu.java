package HomeWork;

import java.util.*;

public class Menu {
    /**
     * Метод вывода приглашения к выбору
     * @param onceMore - флаг ошибочного ввода, при true добавляется строка о повторной попытке ввода
     */
    public static void printPrompt(boolean onceMore) {
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println("Задание 1:");
        System.out.println("Написать метод, возвращающий количество чётных элементов массива.\n" +
                "countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0");
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println("Задание 2:");
        System.out.println("Написать функцию, возвращающую разницу между самым большим и самым маленьким элементами\n" +
                "переданного не пустого массива.");
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println("Задание 3:");
        System.out.println("Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента\n" +
                "с нулевым значением.");
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println();
        if (onceMore) {
            System.out.println("Некорректный ввод, попробуем еще?");
            System.out.println();
        }
        System.out.println("Введите номер задания или нажмите 'Enter' для выхода: ");
    }

    /**
     * Метод приостановки программы
     */
    public static void pause() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Press any key");
        String answ = scanner.nextLine();
    }

    /**
     * Меню выбора задания
     */
    public static void startMenu() {
        String answer; // Ответ пользователя
        boolean getOut = false; // флаг выхода из цикла меню
        boolean onceMore = false; // Сообщение о неверном вводе
        Scanner scanner = new Scanner(System.in);
        while (!getOut) {
            clearScreen();
            printPrompt(onceMore);
            onceMore = false;
            answer = scanner.nextLine();
            switch (answer) {
                case "1" : {
                    Task_1.Start(); // Запуск задачи 1
                    pause();
                    break;
                }
                case "2" : {
                    Task_2.Start(); // Запуск задачи 2
                    pause();
                    break;
                }
                case "3" : {
                    Task_3.Start(); // Запуск задачи 3
                    pause();
                    break;
                }
                case "" : {
                    System.out.println("До свидания!");
                    getOut = true;
                    break;
                }
                default: {
                    onceMore = true;
                    break;
                }
            }
        }
    }

    /**
     * Метод очистки экрана
     */
    public static void clearScreen() {
        for (int i = 0; i < 40; i++) {
            System.out.println();
        }
    }
}
