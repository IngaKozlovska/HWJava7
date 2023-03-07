package Lesson7.HW;

import java.util.concurrent.atomic.AtomicInteger;

public class Sum {
    //Вывести в консоль сумму всех нечётных чисел от 20 до 60 включительно.
    public static void main(String[] args) {


        int Sum = 0;
        int i = 0;
        for (i = 21; i <= 60; i = i + 2) {
Sum += i;
            //System.out.println(i);

        }
        System.out.println(Sum);
    }


    }



