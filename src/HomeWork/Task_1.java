package HomeWork;

/*
Написать метод, возвращающий количество чётных элементов массива.
countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0
 */
public class Task_1 {

    /**
     * Точка запуска задания номер 1
     */
    public static void Start() {
        int[] arr_1 = {2, 1, 2, 3, 4};
        int[] arr_2 = {2, 2, 0};
        int[] arr_3 = {1, 3, 5};
        System.out.println("Задание 1");

        printResult(arr_1);
        printResult(arr_2);
        printResult(arr_3);
    }

    /**
     * Функция определения четности/нечетности чисел
     * @param number - анализируемое число
     * @return - true для четного, false для нечетного числа.
     */
    public static boolean evenOrNot(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Функция подсчета количества четных чисел массива
     * @param arr - переданный массив
     * @return - количество четных чисел
     */
    public static int countEvens(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (evenOrNot(arr[i])) {
                result++;
            }
        }
        return result;
    }

    /**
     * Метод вывода результатов работы функции countEvens()
     * @param arr - исследуемый массив
     */
    public static void printResult(int[] arr) {
        String result = "Массив {";
        int count = countEvens(arr); // число четных чисел
        // вывод массива в консоль
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                result = result + ", ";
            }
            result += arr[i];
        }
        result += "} содержит " + count;
        String str = String.valueOf(count); // перевод количества в строковый тип
        str = String.valueOf(str.charAt(str.length()-1)); // получение последнего знака строки
        // орфографическое буквоедство для выведения результата в соответствии
        // с правилами русского языка
        switch (str) {
            case "1" : {
                result += " чётный элемент";
                break;
            }
            case "2", "3", "4":  {
                result += " чётных элемента";
                break;
            }
            case "0", "5", "6", "7", "8", "9" : {
                result += " чётных элементов";
                break;
            }
        }
        System.out.println(result);
    }
 }
