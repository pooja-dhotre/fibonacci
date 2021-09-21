package com.company;
import java.util.Scanner;

class Fibonacci
{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number :");

        //take input from user
        int n = sc.nextInt();

        // generate fibonacci series
        int finalSum = generate(n);
        // check number exist condition in fibonacci series
        checknum(finalSum, n);
    }
//  generate fibonacci series up to given number
    public static int generate(int num) {
        //first number
        int i = 0;

        //second number
        int j = 1;

        //third number
        int sum = 0;


        //calculate fibonacci series
        while (sum < num) {
            sum = i + j;

            i = j;

            j = sum;
        }
        return sum;
    }
        public static void checknum(int sum, int num)
        {
            //check whether number is present or not
            if (sum == num) {
                System.out.println("Number belongs to Fibonacci series");
            } else {
                System.out.println("Number doesn't belongs to Fibonacci series");
            }
        }
    }
