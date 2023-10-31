//Dallas Lawson
//October 30, 2023
//Professor Bowman
//SDEV200-1AH
//Chapter 8, Exercise 8.29: Identical Arrays

import java.util.Arrays;

public class Array {
    public static void main(String[] args)
    { 
        int m1[] = {5, 56, 99, 101};

        int m2[] = {5, 56, 99, 100};

        boolean ArrayResult = Arrays.equals(m1, m2);

        if (ArrayResult == true) {
            System.out.println("The two arrays are equal. Good job.");
        }
        else {
            System.out.println("The two arrays are not equal. Try again.");
        }
    }
}