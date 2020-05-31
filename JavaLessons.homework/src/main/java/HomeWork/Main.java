package HomeWork;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        maxArray ();

    }

    //Задать целочисленный массив, состоящий из элементов 0 и 1.
// Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
    private static void invertArray() {
        int[] arr = {1, 0, 1, 0, 0, 1};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.print("0 ");

            } else {
                System.out.print("1 ");
            }
        }
        System.out.println();
    }

    //Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    public static void fillArray() {
        int[] arra = new int[8];
        for (int i = 0; i < arra.length; i++) {
            arra[i] = i * 3;
            System.out.print(arra[i] + " ");

        }
        System.out.println();

    }

    //Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    public static void changeArray() {
        int[] w = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < w.length; i++) {
            if (w[i] < 6) {
                w[i] = w[i] * 2;
            } else {
                w[i] = w[i] * 1;
            }
            System.out.print(w[i] + " ");
        }
        System.out.println();
    }

    //Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
// и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
    public static void fillDiagonal() {


        int[][] arr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][i] = 1;
                arr[i][arr.length-i-1]=1;
                System.out.print(arr[i][j]+ " ");
            }

        }
    }
    //Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
    public static void maxArray (){

        int [] array = {5,6,7,8,9,10};
        int indexOfMax = 0;
        int indexOfMin = 0;
        for (int i = 1; i < array.length; i++)
        {
            if (array[i] > array[indexOfMax])
            {
                indexOfMax = i;
            }
            else if (array[i] < array[indexOfMin])
            {
                indexOfMin = i;
            }
        }
        System.out.println(indexOfMax + " " + indexOfMin);

    }

}
