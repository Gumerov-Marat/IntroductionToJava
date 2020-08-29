package com.Epam.part_one_basics_of_software.linear_programs;

import java.io.IOException;
import java.util.Scanner;

/**
 * task #5
 *
 * Given a natural number T, which represents the elapsed time in seconds. Withdraw
 *The given duration in hours, minutes and seconds in the following form:
 * NNch MMmin SSc.

 *Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
 * данное значение длительности в часах, минутах и секундах в следующей форме:
 * ННч ММмин SSc.
 *

 */
class ExampleFive {

    @SuppressWarnings("recource")
    public static void main(String[] args) throws IOException {

        ExampleFive example = new ExampleFive();

        Scanner s = null;

        try {

            s = new Scanner(System.in);

            System.out.println("Enter value count / Введите значение в секундах");   // Введите значение числа

            long x = s.nextLong();



            // block with solution
            String solutionTask = example.solutionToString(x);

            System.out.println("Solution example   = " + solutionTask);

        } catch (Exception e) {

            System.out.println("Error in the input / output data!"); // Ошибка данных ввода вывода.

            e.printStackTrace();

        } finally {

            if (s != null) {

                s.close();
            }
        }
    }


    /**
     *The solutionToString method takes the number of seconds into a variable,
     *  and divides them into hours, minutes, seconds.
     * @param x
     * @return
     */
    static String solutionToString (long x){

        int h = (int) (x / 3600);
        int m = (int) (x / 60) % 60;  //  например 1 210 секунд  делим на 60 = 20  |  20 % 60 = 20
        int s = (int) (x % 60);

        String answer = (h +"ч"+" "+ m+"мин"+" "+s+"с");

        return answer;
    }
}