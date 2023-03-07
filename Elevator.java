package Lesson7.HW;

import java.util.Random;
import java.util.concurrent.Callable;

public class Elevator {


    public static void main(String[] args) {
        //Лифт, находящийся на первом этаже здания высотой H, должен подняться на последний этаж.
        //Лифт сломан. Каждый раз он поднимается на N этажей и спускается на M этажей.
        //Если на последнем подьеме лифт превысил количество этажей, то считается что лифт
        //поднялся на самый верх. Найдите количество подьемов, которые понадобятся лифту.
        //numberOfLifts(int floors, int stepUp, int stepDown)
       int floors = 0;
       int stepUp = 0;
       int stepDown =0;

            //private static int numberOfLifts(int floors, int stepUp, int stepDown) {

                int R;
                int Count = 0;
                int result = stepUp - stepDown;


            do {
                    R = result + (stepUp - stepDown);
                    result++;
                    Count++;
                System.out.println(Count);
                } while (floors <= R);}



        //return;





    }











