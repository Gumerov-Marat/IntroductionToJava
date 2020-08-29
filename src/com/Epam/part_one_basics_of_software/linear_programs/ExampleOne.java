package com.Epam.part_one_basics_of_software.linear_programs;

import java.io.IOException;
import java.util.Scanner;

/**
 * task # 1. Linear programs:
 * Task description:
 * find the value of the function:
 *  Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.
 */
class ExampleOne {
    static String task_info = "task # 1. Linear programs";

    public static void main(String[] args) throws IOException {
        System.out.println(task_info);

        ExampleOne example = new ExampleOne();

        Scanner s = null;

        try {

            s = new Scanner(System.in);

            System.out.println("Enter value a ");   // Введите значение a

            int a = s.nextInt();

            System.out.println("Enter value b "); // Введите значение b

            int b = s.nextInt();

            System.out.println("Enter value с "); // Введите значение с

            int c = s.nextInt();

            //block formula
            int solutionTask = example.solution(a, b, c);

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
     *
     the method substitutes input values
     ​​in the formula and solves an example
     * @param a
     * @param b
     * @param c
     * @return
     */
    private static int solution (int a, int b, int c){

        int answer  = ((a - 3)* b)/2 + c;

        return answer;
    }

}
