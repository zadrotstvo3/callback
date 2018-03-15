package Homework;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
//        int[] mas = new int[3];
//        Random random = new Random();
//        for (int i = 0; i < mas.length; i++) {
//            mas[i] = random.nextInt();
//        }
//        System.out.println(Arrays.toString(mas));
//        String[][] musik = new String[2][3];
//        String[][] musik = {
//                {"1","2","3"},
//                {"4","5","6"}
//        };
//        for (String[] folder : musik) {
//            for (String number : folder) {
//                System.out.println(number);
//            }
//        }
//        greeting("Vasya");
//        System.out.println(greeting(5,7));
//        public static void greeting(String name){
////      System.out.println("heloooo " + name);
////    }
////    public static int greeting(int a, int b){
////        int res = a + b;
////        return res;
////    }
//    public static int increment(int x){
//        return x=x+1;
//    }

//    Random random = new Random();
//        System.out.println(Arrays.toString(randomaizer()));
//    }
//    public static int[] randomaizer(){
//        int[] mastoreturn = new int[5];
//        for (int i = 0; i < mastoreturn.length; i++) {
//            mastoreturn[i] = new Random().nextInt();
//        }
//        return mastoreturn;
//    }
//
//        int[] x = new int[20];
//        int[] ints = increment(x);
//        System.out.println(Arrays.toString(ints));
//        Random random = new Random();
//        int[] rar = greeting();
//        int[] g = new int[1];
//        for (int i = 0; i < rar.length; i++) {
//            g[i]=rar[i]+1;
//        }
//        int[] rar = greeting();
//        System.out.println(Arrays.toString(rar));
//        int[] boltt = doping(rar);
//        System.out.println(boltt);
        System.out.println(Arrays.toString(doping()));
    }
//
//        public static int[] increment(int[] add) {
//        for (int i = 0; i < add.length; i++) {
//            add[i] = i;
//        }
//        return add;
//    }
    public static int[] greeting() {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {6, 7, 8, 9, 10};
        int[] c = new int[5];
        for (int i = 0; i < c.length; i++) {
            c[i] = a[i] + b[i];
        }
        return c;
    }

    public static int[] doping() {
        int[] rarr = greeting();
        int[] g = new int[1];
        for (int i = 0; i < g.length; i++) {
            g[i] = rarr[0] + rarr[1] + rarr[2] + rarr[3] + rarr[4];
        }
        return g;
    }
}