package com.company;

public class Ejercicio1 {

    public static void main(String[] args) {

            for (int i = 0; i <= 100; i++) {
                if (i % 3 == 0) {
                    System.out.println(i + ": mare");
                }
                if (i % 5 == 0) {
                    System.out.println(i + ": igual");
                }
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println(i + ": mareigua");
                }
            }
        }
    }

