package com.lahey;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author jack lahey
 *
 * Assignment
 *
 * Create a new Java project which prompts the user for their favorite movies.
 * Add the items to an ArrayList.
 * Allow the user to enter as many movies as they wish.
 * When when they are done entering items then print a sorted list of their movies using an enhanced for loop.
 *
 *  Hint: Make the movies a String so you don't have to create a movie class.
 */
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String sInput = "";
        char chInput = ' ';
        ArrayList<String> list = new ArrayList<String>();
        boolean bContinue = true;

    do{
            System.out.println("Enter the name of a movie: ");
            sInput = scan.nextLine();
            System.out.println("The movie name is " + sInput);
            list.add(sInput);

            do{
               System.out.println("Enter \"A\" to add another movie or \"Q\" to quit");
               chInput = scan.next().toLowerCase().charAt(0);
               scan.nextLine();

            }while( !(chInput == 'a') && !(chInput == 'q'));

            if ( chInput == 'q' ){

                bContinue = false;

            }else if( chInput == 'a'){

                bContinue = true;
            }

        }while(bContinue);

        System.out.println("\nHere is the sorted list of movies:");

        //sort movie list
        Collections.sort(list);

        for(String temp : list )
        {
            System.out.println(temp);

        }

    }//end public static void main(String[] args)

}//end class Main
