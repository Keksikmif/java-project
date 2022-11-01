package test;
import java.util.Scanner;
public class Practical {
    private static void main (String[]args){
        Scanner num = new Scanner(System.in);
         int n = num.nextInt();
        int a = n / 10;
        int b = n - a * 10;

        System.out.println("Количество десятков: " + a);
        System.out.println("Количество единиц: " + b);




        }
    }


