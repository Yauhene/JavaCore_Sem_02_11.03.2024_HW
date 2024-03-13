package HomeWork;

import java.util.*;

/*
Написать функцию, возвращающую разницу между самым большим и самым маленьким элементами
переданного не пустого массива.
 */
public class Task_2 {

    /**
     * Точка запуска задания номер 2
     */
    public static void Start() {
        int[] arr_1 = {2, 1, 2, 3, 4};
        int[] arr_2 = {2, 2, 0};
        int[] arr_3 = {1, 3, 5};
        System.out.println("Задание 2");
        System.out.println();
        System.out.println("Разница = " + getDifference(arr_1));
        System.out.println("Разница = " + getDifference(arr_2));
        System.out.println("Разница = " + getDifference(arr_3));
    }

    /**
     * Функция, возвращающая разницу между минимальным и максимальным элементами массива
     * @param arr - анализируемый массив
     * @return - целочисленное значение разницы
     */
    public static int getDifference(int[] arr) {
        int minValue = arr[0];
        int maxValue = arr[0];
        int difference;

        for (int i = 1; i < arr.length; i++) {
            if (minValue > arr[i]) {
                minValue = arr[i];
            }
            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }
        }
        System.out.println();
        System.out.println("Массив " + Arrays.toString(arr) + ": " +
                                        "минимальное значение " + minValue + ", " +
                                        "максимальное значение " + maxValue);
        difference = maxValue - minValue;
        return difference;
    }
}
