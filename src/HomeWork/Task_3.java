package HomeWork;

import java.util.*;

/*
Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента
с нулевым значением.
 */
public class Task_3 {
    /**
     * Точка запуска задания номер 3
     */
    public static void Start() {
        int[] arr_1 = {2, 1, 0, 0, 4, 2, 1, 2, 3, 4};
        int[] arr_2 = {2, 2, 0, 1, 0, 0, 0, 0, 1, 2};
        int[] arr_3 = {1, 3, 5};
        int[] arr_4 = {0, 0};
        int[] arr_5 = {0, 0, 0};

        System.out.println("Задание 3");


        printEmotions(arr_1);
        printEmotions(arr_2);
        printEmotions(arr_3);
        printEmotions(arr_4);
        printEmotions(arr_5);
    }

    /**
     * Функция поиска последовательности из 2-х нулей,
     *      воспринимает три и более нуля подряд как несоблюдение критерия
     * @param arr - анализируемый массив
     * @return - при выполнении условия true, при невыполнении - false.
     */
    public static boolean findTwoZero(int[] arr) {
        boolean result = false;
        boolean alarm = false;
        int limit = arr.length;

        for (int i = 0; i < limit ; i++) {
            if ((limit > 1) && ((i + 1) < limit)) { // Страхуемся на случай массива с одним элементом
                                                    // и на случай выхода за пределы массива
                if (arr[i] == 0 && arr[i + 1] == 0) { // Ищем последовательность из 2-х нулей
                    result = true;
                }
            }
            if ((i + 2) < limit) { // Страхуемся на случай выхода за пределы массива
                if (arr[i] == 0 && arr[i + 1] == 0 && arr[i + 2] == 0) {
                    alarm = true;
                }
            }
        }
        if (alarm) {
            result = false;
            System.out.println();
            System.out.println("Найдена последовательность из трех и более нулей! Невелика печаль, но - печаль...");
        }
        return result;
    }

    /**
     * Метод визуализации результатов функции findTwoZero()
     * @param arr - анализируемый массив
     */
    public static void printEmotions(int[] arr) {
        String responce = "Массив " + Arrays.toString(arr) + ".";
        if (findTwoZero(arr)) {
            responce += " Бинго!!! Два нуля подряд!";
        } else {
           responce += " На сей раз неудача, двух нулей подряд не найдено";
        }
        System.out.println(responce);
        System.out.println();
    }
}
