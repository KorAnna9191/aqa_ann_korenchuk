package com.hillel;

public class MainString {

    public static void main(String[] args) {
        char o = 'u';
        char[] arr = {'H', 'e', 'l', 'l'};
        String str = new String(arr);
        System.out.println(str.length());
        System.out.println(arr.length);
        System.out.println(str + " World!");
        System.out.println(str);

        System.out.println(str.concat("World!"));



    }
}