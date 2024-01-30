/*
---------------------------------------------------------------------------------
Name: Tanvi Jain
Student #: 220287975
Subject: ITEC 1620 - Object-Based Programming
Date: November 2nd, 2023

Purpose: To create a game in which three players take turns rolling two dice to
reach a sum of 15 or more.
~~Note- this question has a class named 'Player' that runs with it~~
----------------------------------------------------------------------------------
 */
public class Question1_Dice {
    public static void main(String[] args) {
        //initializing each player
        Player one = new Player(1,0);
        Player two = new Player(2, 0);
        Player three = new Player(3, 0);

        //has each player roll on a turn until one reaches 15
        while(one.sum < 15 && two.sum < 15 && three.sum < 15){
            one.roll();
            two.roll();
            three.roll();
        }

        //determines who is first,second, and third place + prints the results
        //for if the first player came first
        if (one.sum > two.sum && one.sum > three.sum){
            System.out.println("\nPlayer 1 wins first place with a total of " + one.sum);
            if (two.sum > three.sum){
                System.out.println("Player 2 wins second place with a total of " + two.sum);
                System.out.println("Player 3 wins third place with a total of " + three.sum);
            }
            else if (three.sum > two.sum){
                System.out.println("Player 3 wins second place with a total of " + three.sum);
                System.out.println("Player 2 wins third place with a total of " + two.sum);
            }
        }
        //if the second player came first
        else if (two.sum > one.sum && two.sum > three.sum){
            System.out.println("\nPlayer 2 wins first place with a total of " + two.sum);
            if (one.sum > three.sum){
                System.out.println("Player 1 wins second place with a total of " + one.sum);
                System.out.println("Player 3 wins third place with a total of " + three.sum);
            }
            else if (three.sum > one.sum){
                System.out.println("Player 3 wins second place with a total of " + three.sum);
                System.out.println("Player 1 wins third place with a total of " + one.sum);
            }
        }
        //if the third player came first
        else if (three.sum > one.sum && three.sum > two.sum){
            System.out.println("\nPlayer 3 wins first place with a total of " + three.sum);
            if (one.sum > two.sum){
                System.out.println("Player 1 wins second place with a total of " + one.sum);
                System.out.println("Player 2 wins third place with a total of " + two.sum);
            }
            else if (two.sum > one.sum){
                System.out.println("Player 2 wins second place with a total of " + two.sum);
                System.out.println("Player 1 wins third place with a total of " + one.sum);
            }
        }
    }
}
