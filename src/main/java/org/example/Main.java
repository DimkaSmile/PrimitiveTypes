package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double d1 = 0.9;
        double d2 = 0.3 + 0.3 + 0.3;

        System.out.println(d1 == d2);
        System.out.println(d1 + " / " + d2);

        // Условные операторы

        int x = -5;
        if (x > 0) {
            System.out.println("x - Положительный");
        } else {
            System.out.println("x - НЕ положительный");
        }


        /*
        Задача
        Протестировать часть бонусной системы одного из онлайн-магазинов.
        Работает она так:
        * Для зарегистрированного пользователя за покупку начисляется бонусный балл в размере 3% от суммы покупки.
        * Для незарегистрированного пользователя за покупку начисляется бонусный балл в размере 1% от суммы покупки.
        * Бонусный балл не может превышать 500 за одну покупку.
        * Бонусный балл измеряется в целых числах и округляется в меньшую сторону
        */

        int amount = 10_000;
        boolean registeredUser = true;
        //boolean unregisteredUser = false;

        int percent;
        if (registeredUser) {
            percent = 3;
        } else {
            percent = 1;
        }

        // int percent = registeredUser ? 3 : 1; тернарный условный оператор. строки 35-40 в одну.

        int bonus = amount * percent / 100;
        if (bonus > 500) {
            bonus = 500;
        }

        System.out.println(bonus);

    }

}




