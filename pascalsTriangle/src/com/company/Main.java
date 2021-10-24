package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //creates object for Scanner
        Scanner in = new Scanner(System.in);
        //prompts user to decide how long our program will run for
        System.out.print("How many rows would you like to display: ");
        //creates loop so while the user enters anything other than an integer they are re-prompted to enter an integer
        while (!in.hasNextInt()){
            in.next();
            System.out.print("Please enter an integer: ");
        }
        //stores the users integer value in the variable rows
        int rows = in.nextInt();
        //while i is less than the value the user input the program continue to produce rows
        for(int i = 0; i < rows; i++){
            System.out.println(" ");
            for(int j = 0; j <= i; j++){
                //while j is less than or equal to i the method binomial(i,j) will be called to work out the values within that row of pascals triangle
                //i is the row number, j is the position along that row
                System.out.print(" "+binomial(i, j));
            }
        }

    }

    static int binomial(int i, int j){
        //declares and assigns variable num the value 1
        int num = 1;

        //resets j to 0 every time theres a new row as k = n - k
        if(j > (i - j)){
            j = i - j;
        }

        for (int x = 0; x < j; x++){
            //binomial equation to work out the values within pascals triangle
            num *= (i - x);
            num /= (x + 1);
        }
        return num;
    }
}
