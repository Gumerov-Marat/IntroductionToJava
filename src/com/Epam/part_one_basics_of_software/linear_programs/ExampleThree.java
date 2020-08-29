package com.Epam.part_one_basics_of_software.linear_programs;

import java.io.IOException;
import java.util.Scanner;


/**
 * Task #3:
 *
 *Calculate the value of the expression by the formula:
 * Вычислить значение выражения по формуле ( 𝑠𝑖𝑛 𝑥 + 𝑐𝑜𝑠 𝑦 / 𝑐𝑜𝑠 𝑥 − 𝑠𝑖𝑛 𝑦) * ∗ 𝑡𝑔 xy
 * (все переменные принимают действительные значения):
 */
class ExampleThree {

    @SuppressWarnings("recource")
    public static void main(String[] args) throws IOException {

        ExampleThree example = new ExampleThree();

        Scanner s = null;


        //try
        try {

            s = new Scanner(System.in);

            System.out.println("Enter value x ");   // Введите значение x

            double x = s.nextDouble();

            System.out.println("Enter value y "); // Введите значение y

            double y = s.nextDouble();


            double solutionTask = example.solution(x, y);

            System.out.println(" \n" +
                    "Solution example  = " + solutionTask);

            //catch
        } catch (Exception e) {

            System.out.println("Error in the input / output data!"); // Ошибка данных ввода вывода.

            e.printStackTrace();

            //finaly
        } finally {

            if (s != null) {

                s.close();
            }
        }
    }

    /**
     * the method takes three variables at the input
     * and inserts it into the formula
     * @param x
     * @param y
     * @return
     */
    private static double solution(double x, double y) {

        double sinX = Math.sin(Math.toRadians(x));
        double sinY = Math.sin(Math.toRadians(y));

        double cosX = Math.cos(Math.toRadians(x));
        double cosY = Math.cos(Math.toRadians(y));

        double tgXY = Math.tan(Math.toRadians(x * y));


        double answer = (sinX + cosY) / (cosX - sinY) * tgXY;

        return answer;
    }
}