package liquor4k;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //задача 1
        int[] integerArray = new int[3];
        integerArray[0] = 1;
        integerArray[1] = 2;
        integerArray[2] = 3;

        double[] doubleArray = {1.57, 7.654, 9.986};
        String[] stringArray = {"Apple", "Banana", "Orange"};

        // Задача 2
        for (int i = 0; i < integerArray.length; i++) {
            if (i == integerArray.length - 1) {
                System.out.print(integerArray[i]);
            } else {
                System.out.print(integerArray[i] + ", ");
            }
        }
        System.out.println();

        for (int i = 0; i < doubleArray.length; i++) {
            if (i == doubleArray.length - 1) {
                System.out.print(doubleArray[i]);
            } else {
                System.out.print(doubleArray[i] + ", ");
            }
        }
        System.out.println();

        for (int i = 0; i < stringArray.length; i++) {
            if (i == stringArray.length - 1) {
                System.out.print(stringArray[i]);
            } else {
                System.out.print(stringArray[i] + ", ");
            }
        }
        System.out.println();

        //Задача 3
        // Первый массив в обратном порядке
        for (int i = integerArray.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(integerArray[i]);
            } else {
                System.out.print(integerArray[i] + ", ");
            }
        }
        System.out.println();

        // Второй массив в обратном порядке
        for (int i = doubleArray.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(doubleArray[i]);
            } else {
                System.out.print(doubleArray[i] + ", ");
            }
        }
        System.out.println();

        // Третий массив в обратном порядке
        for (int i = stringArray.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(stringArray[i]);
            } else {
                System.out.print(stringArray[i] + ", ");
            }
        }
        System.out.println();

        //Задача 4
        // Преобразование нечетных чисел в четные
        for (int i = 0; i < integerArray.length; i++) {
            if (integerArray[i] % 2 != 0) {
                integerArray[i] += 1;
            }
        }

        // Вывод результата
        System.out.println(Arrays.toString(integerArray));
    }
}