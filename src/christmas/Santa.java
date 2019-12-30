package christmas;

import java.util.Scanner;

//Create a new Java package called Christmas.
//        Create a new Java class called Santa.
//        Create your main method. Using Console IO, allow him to ask the user what they want for Christmas.
//        Store the response in a String variable.
//        Bonus: Continue to ask if the user enters an empty String


public class Santa {

    public static void ask() {
        Scanner scan = new Scanner(System.in);
        System.out.println("What would you like for Christmas?");
        String gift = scan.nextLine();
        if (gift.length() == 0) {
            System.out.println("You don't wan't anything!? That can't be right!");
            ask();
        } else {
            System.out.println("Oh... you'd like " + gift);
        }
    }
    public static void main(String[] args) {

        Reindeer dasher = new Reindeer("Dasher");
        Reindeer dancer = new Reindeer("Dancer");
        Reindeer prancer = new Reindeer("Prancer");
        Reindeer vixen = new Reindeer("Vixen");
        Reindeer comet = new Reindeer("Comet");
        Reindeer cupid = new Reindeer("Cupid");
        Reindeer dunder = new Reindeer("Dunder");
        Reindeer blitzen = new Reindeer("Blitzen");
        Reindeer rudolph = new Reindeer("Rudolph");
        Reindeer olive = new Reindeer("Olive");
        ask();


    }

}
