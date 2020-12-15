package com.company;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String text = console.nextLine();
            Pattern neededLine = Pattern.compile("(([0-2][1-9]|[3][0])([/])([0][4]|[0][6]|[0][9]|[1][1])([/])([1][9]\\d\\d|[2-9]\\d\\d\\d))|(([0-2][1-9]|[3][1])([/])([0][1]|[0][3]|[0][5]|[07]|[08]|[1][0]|[1][2])([/])([1][9]\\d\\d|[2-9]\\d\\d\\d))|([0-2][1-9])([/])([0][2])([/])(([1][9]([0]|[2]|[4]|[6]|[8])([0]|[4]|[8]))|([1][9]([1]|[3]|[5]|[7]|[9])([2]|[6]))|(([2-9]\\d([0]|[2]|[4]|[6]|[8])([0]|[4]|[8])))|([2-9]\\d([1]|[3]|[5]|[7]|[9])([2]|[6])))|([0-2][1-8])([/])([0][2])([/])(([1][9]\\d\\d)|([2-9]\\d\\d\\d))" );
            Matcher matcher = neededLine.matcher(text);
            boolean tester = matcher.matches();

            if (tester == true) {
                System.out.println("Введёная строка: " + text + " является датой в формтае dd/mm/yyyy");
            } else {
                System.out.println("Введёная строка: " + text + " не является датой нужного формата, либо такой даты не существует!");
            }
    }
}
