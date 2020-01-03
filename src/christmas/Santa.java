package christmas;

import javax.swing.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

//Create a new Java package called Christmas.
//        Create a new Java class called Santa.
//        Create your main method. Using Console IO, allow him to ask the user what they want for Christmas.
//        Store the response in a String variable.
//        Bonus: Continue to ask if the user enters an empty String

//Going back into your Santa class, create a public static Array property that stores 9 (or 10) instances of Reindeer objects.
//        go back into your main method and give each Reindeer instance a position in the Array you just created.
//        December 31st
//        What if we want to hire more Reindeer in the future and add them to our Array?
//        In your Santa class, create a pubilc static addReindeer method that would allow us to add to our Array.
//        Remember that Arrays in Java have a set length, so this method will actually need to create a copy with a different lenght.
//        Need a hint? Go back to our ArraysExercises from Java II.

//In your Santa Class, create an ArrayList of Strings called 'wishlist'
//        Each time Santa asks what you want for Christmas, add the user response into the ArrayList. Keep adding presents!
//        Go into the main method to check if your wishlist has been stored in the ArrayList.



public class Santa {
    public static ArrayList<String> wishlist = new ArrayList<>();




    public static void ask() {
        Scanner scan = new Scanner(System.in);
        System.out.println("What would you like for Christmas?");
        String gift = scan.nextLine();
        if (gift.length() == 0) {
            System.out.println("You don't wan't anything!? That can't be right!");
            ask();
        } else {
            System.out.println("Oh... you'd like " + gift);
            wishlist.add(gift);
        }
    }


    public static Reindeer[] addReindeer(Reindeer[] currentArr, Reindeer ReindeerName){
            Reindeer[] tempArr = Arrays.copyOf(currentArr, currentArr.length+1);
            tempArr[currentArr.length] = ReindeerName;
            return tempArr;
        }




    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);


//       Reindeer[] daDeers = new Reindeer[10];
//
//       daDeers[0] = new Reindeer("Dasher");
//       daDeers[1] = new Reindeer("Dancer");
//       daDeers[2] = new Reindeer("Prancer");
//       daDeers[3] = new Reindeer("Vixen");
//       daDeers[4] = new Reindeer("Comet");
//       daDeers[5] = new Reindeer("Cupid");
//       daDeers[6] = new Reindeer("Donner");
//       daDeers[7] = new Reindeer("Blitzen");
//       daDeers[8] = new Reindeer("Rudolph");
//       daDeers[9] = new Reindeer("Olive");
//
//       daDeers = addReindeer(daDeers, new Reindeer("Bill"));
//       daDeers = addReindeer(daDeers, new Reindeer("Ted"));
//
//        for (Reindeer deer : daDeers){
//            System.out.println(deer.getName());
//        }

        ask();


        System.out.println("would you like something else? yes/no");
        String resp = scan.nextLine();
        if (resp.equalsIgnoreCase("yes")){
            ask();
        }

        for(String gift : wishlist) {
            System.out.println(gift);
        }

    }

}
