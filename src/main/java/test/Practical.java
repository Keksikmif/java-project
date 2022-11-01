package test;
public class Practical {
    public static void main (String[]args){
        int x = 189;
        int a = 0;
        for (int i = 0; i < 3; i++) {
            a *= 10;
            a += x % 10;
            x /= 10;
        }
        System.out.println(a);

        }
    }


