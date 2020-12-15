package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String text = console.nextLine();
	    Pattern neededLine = Pattern.compile("abcdefghijklmnopqrstuv18340");
	    Matcher matcher = neededLine.matcher(text);
	    boolean tester = matcher.matches();
	    if(tester == true)
        {
            System.out.println("Введёная строка: " + text + " является искомой строкой: abcdefghijklmnopqrstuv18340");
        }
	    else
        {
            System.out.println("Введёная строка: " + text + " не является искомой!");
        }
    }
}
