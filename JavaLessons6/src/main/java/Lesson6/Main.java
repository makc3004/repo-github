package Lesson6;


import java.io.*;


public class Main {

    public static void main(String[] args) {

        InputStream is;
        OutputStream os;


        byte[] chars = {'h', 'e', 'l', 'l', 'o'};
        String s = new String("Создать 2 текстовых файла, примерно по 50-100 символов в каждом (особого значения не имеет)");
        String d = new String("Написать программу, «склеивающую» эти файлы, то есть вначале идет текст из первого файла, потом текст из второго в новый файл");
        String p = s + d;

        try {
            PrintStream ps = new PrintStream(new FileOutputStream("test.txt", true));

            ps.println(s);

            ps.close();
        } catch (
                IOException e) {
            e.printStackTrace();
        }
        try {
            PrintStream ps = new PrintStream(new FileOutputStream("test1.txt", true));
            ps.println(d);
            ps.close();
        } catch (
                IOException e) {
            e.printStackTrace();
        }
        try {
            PrintStream ps = new PrintStream(new FileOutputStream("test2.txt", true));
            ps.println(p);
            ps.close();
        } catch (
                IOException e) {
            e.printStackTrace();

        }
        System.out.println("Слово \"программист\" есть в строке p? Ответ: " + p.contains("склеивающую"));
    }
}



