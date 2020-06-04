package Lessons3;

import java.util.Random;
import java.util.Scanner;

public class Main { //крестики нолики
    // Заведение констант на допустимый ввод
    // Какими символами (фигками) играет игрок
    private static final char DOT_HUMAN = 'X'; //челоывек ходит с "X"
    // Что вводит компьютер
    private static final char DOT_AI = 'O';  //компьютер ходит с "Y"
    // Символ пустой клетка
    private static final char DOT_EMPTY = ' ';

    // final - константа (не изменяемая) для этого класса

    // Упрощения вместо использования field.length
    private static int fieldSizeX; //размер по "Х"
    private static int fieldSizeY; //размер по "Y"
    // Игровое поля
    private static char[][] field;

    private static final int fieldSize = 3;

    private static final Scanner SCANNER = new Scanner(System.in); //сканер принимает входную очередь в консоле
    private static final Random RANDOM = new Random();

    //initField
    //printField
    //humanTurn
    //aiTurn
    //isNotEmptyField
    //checkWin
    //isValidField
    //isDraw

    //main
    public static void main(String[] args) {
        //int fieldSize = 3;
        while (true) {
            init(fieldSize);
            printField();
            playOnce(fieldSize);
            System.out.println("Играть сначала?");
            if (SCANNER.next().equals("no")) {
                break;
            }
        }
    }

    private static void playOnce(int fieldSize) {
        while (true) {
            humanTurn();
            printField();
            if (isWinnerExists(DOT_HUMAN)) {
                System.out.println("Победил Игрок!");
                break;
            }
            if (isDraw()) {
                System.out.println("Ничья!");
                break;
            }

            aiTurn();
            printField();
            if (isWinnerExists(DOT_AI)) {
                System.out.println("Победил Компьютер!");
                break;
            }
            if (isDraw()) {
                System.out.println("Ничья!");
                break;
            }

        }
    }

    //initField
    private static void init(int fieldSize) {
        fieldSizeX = fieldSize;
        fieldSizeY = fieldSize;

        field = new char[fieldSizeY][fieldSizeX];

        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                field[y][x] = DOT_EMPTY;
            }
        }
    }

    //printField
    private static void printField() {
        System.out.println("=============");

        for (int y = 0; y < fieldSizeY; y++) {
            System.out.print("| ");
            for (int x = 0; x < fieldSizeX; x++) {
                System.out.print(field[y][x] + " | ");
            }
            System.out.println();
        }
    }

    //isValidField
    // Проврека, что координаты находятся в допустимом диапазоне
    private static boolean isValidField(int x, int y) {
        return x >= 0 && x < fieldSizeX && y >= 0 && y < fieldSizeY;
    }

    //isNotEmptyField
    // Проврека, что поле занято (знак в поле не соответствует DOT_EMPTY);
    private static boolean isNotEmptyField(int x, int y) {
        return field[y][x] != DOT_EMPTY;
    }

    //humanTurn
    // Проврека, что поле занято (знак в поле не соответствует DOT_EMPTY);
    private static void humanTurn() {
        // 3 1
        int x;
        int y;
        do {
            System.out.print("Введите координаты хода X и Y (от 1 до " + fieldSizeY + ") через пробел >>> ");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        } while (!isValidField(x, y) || isNotEmptyField(x, y));
        field[y][x] = DOT_HUMAN;
    }

    //aiTurn
    private static void aiTurn() {

        //Пытался сделать блокировку хода пользователя, если он побеждает на следующем ходу. Не понимаю где ошибся
//        int x = -1;
//        int y = -1;
//        boolean ai_win = false;
//        boolean user_win = false;
//
//        if (!ai_win) {
//            for (int i = 0; i < fieldSize; i++) {
//                for (int j = 0; j < fieldSize; j++) {
//                    if (!isNotEmptyField(i, j)) {
//                        field[i][j] = DOT_HUMAN;
//                        if (isWinnerExists(DOT_HUMAN)) {
//                            x = i;
//                            y = j;
//                            user_win = true;
//                        }
//                        field[i][j] = DOT_EMPTY;
//                    }
//                }
//            }
//        }
//        if (!ai_win && !user_win) {
//            do {
//            x = RANDOM.nextInt(fieldSizeX);
//            y = RANDOM.nextInt(fieldSizeY);
//        } while (isNotEmptyField(x, y));
//        field[y][x] = DOT_AI;
////
//        }
//
//    }


        int x;
        int y;
        do {
            x = RANDOM.nextInt(fieldSizeX);
            y = RANDOM.nextInt(fieldSizeY);
        } while (isNotEmptyField(x, y));
        field[y][x] = DOT_AI;
    }


    //isDraw
    private static boolean isDraw() {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                if (field[y][x] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    //checkWin
    private static boolean isWinnerExists(char symb) {

        for (int i = 0; i < 3; i++)
            if ((field[i][0] == symb && field[i][1] == symb && field[i][2] == symb) || (field[0][i] == symb && field[1][i] == symb && field[2][i] == symb))
                return true;
        if ((field[0][0] == symb && field[1][1] == symb && field[2][2] == symb) || (field[2][0] == symb && field[1][1] == symb && field[0][2] == symb))
            return true;

//        if (field[0][0] == symb && field[0][1] == symb && field[0][2] == symb) return true;
//        if (field[1][0] == symb && field[1][1] == symb && field[1][2] == symb) return true;
//        if (field[2][0] == symb && field[2][1] == symb && field[2][2] == symb) return true;
//
//        if (field[0][0] == symb && field[1][0] == symb && field[2][0] == symb) return true;
//        if (field[0][1] == symb && field[1][1] == symb && field[2][1] == symb) return true;
//        if (field[0][2] == symb && field[1][2] == symb && field[2][2] == symb) return true;
//
//        if (field[0][0] == symb && field[1][1] == symb && field[2][2] == symb) return true;
//        if (field[2][0] == symb && field[1][1] == symb && field[0][2] == symb) return true;
        return false;
    }


}

