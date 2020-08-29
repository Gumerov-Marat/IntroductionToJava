package com.Epam.part_one_basics_of_software.linear_programs;

import java.io.IOException;
import java.util.Scanner;

/**
 * task #4
 *
 * Given a real number R of the form nnn.ddd (three digital digits in the fractional and integer parts). Swap
 * fractional and integer parts of a number and output the resulting value of a number.
 *
 *  Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
 * дробную и целую части числа и вывести полученное значение числа.
 */

class ExampleFour {

    @SuppressWarnings("recource")
    public static void main(String[] args) throws IOException {

        ExampleFour example = new ExampleFour();

        Scanner s = null;

        try {

            s = new Scanner(System.in);

            System.out.println("Enter value count ");   // Введите значение числа

            double x = s.nextDouble();



            // block with solution
            double solutionTask = example.solution(x);

            System.out.println("Solution example  = " + solutionTask);

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
     * metod solution take x,
     divide the number by integer and fractional, then swap
     * @param x
     * @return
     */
    static   double solution (double x){

        double iCount =  (int) x;

        double remainder = x % 1;

        double answer = (remainder + (iCount / 1000));

        return  answer;
    }

}