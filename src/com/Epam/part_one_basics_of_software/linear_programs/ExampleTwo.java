package com.Epam.part_one_basics_of_software.linear_programs;

import java.io.IOException;
import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.StrictMath.sqrt;


/**
 * task # 2. Linear programs:
 * Task description:
 *
 *   Calculate the value of the expression by the formula (all variables take real values)
 *   Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 *   (там здоровенная дробь)
 */
class ExampleTwo {

    @SuppressWarnings("recource")
    public static void main(String[] args) throws IOException {

        ExampleTwo example = new ExampleTwo();

        Scanner s = null;

        try {

            s = new Scanner(System.in);

            System.out.println("Enter value a ");   // Введите значение a

            double a = s.nextDouble();

            System.out.println("Enter value b "); // Введите значение b

            double b = s.nextDouble();

            System.out.println("Enter value с "); // Введите значение с

            double c = s.nextDouble();

            double solutionTask = example.solution(a, b, c);

            System.out.println(" \n" +
                    "Solution example  = " + solutionTask);

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
     *
     the method takes three variables as
     parameters and solves the expression
     * @param a
     * @param b
     * @param c
     * @return
     */
    private static double solution (double a, double b, double c){

        double expression = ((b+sqrt(pow(b,2.0)+4*a*c))/2*a);

        double secondExpression = (pow(a,3.0)*c) + pow(b,-2.0);

        double answer = expression - secondExpression;

        return answer;
    }

}