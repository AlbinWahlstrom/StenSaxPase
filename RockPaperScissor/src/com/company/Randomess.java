package com.company;

import java.util.Random;
import java.util.Scanner;

public class Randomess extends Spelare{

    Scanner input = new Scanner(System.in);

    @Override
    void spelareVal() {

        int min = 1;
        int max = 2;

        String rock = "Rock";
        String paper = "Paper";
        String scissor = "Scissor";
        String playerMoveRandomess;
        String RandomessMove = "";

        Random randomNumber = new Random();
        int randomCount = randomNumber.nextInt(max + min) + min;

        if (randomCount == 1){
            RandomessMove = rock;
        }
        else if (randomCount == 2){
            RandomessMove = paper;
        }
        else if (randomCount == 3){
            RandomessMove = scissor;
        }

        while (true) {
            System.out.println("\nPlease enter your move (Rock, Paper, or Scissor)");
            playerMoveRandomess = input.nextLine();
            if (playerMoveRandomess.equals(rock) || playerMoveRandomess.equals(paper) || playerMoveRandomess.equals(scissor)){
                break;
            }
            System.out.println(playerMoveRandomess + " is not a valid input. Please try again:");
        }

        System.out.println(MenyStart.usernameToUse + " played " + playerMoveRandomess);
        System.out.println("Randomess played " + RandomessMove);


        if (playerMoveRandomess.equals(RandomessMove)){
            System.out.println("It is a tie. no winner");
        }

        //If player plays rock
        else if (playerMoveRandomess.equals(rock)) {
            if (RandomessMove.equals(scissor)){
                System.out.println("You won");
                pointCount.pointCounterSlump++;
                pointCount.totalPoints++;
            }
            else if (RandomessMove.equals(paper)){
                System.out.println("You lost");
            }
        }

        //If player plays paper
        else if (playerMoveRandomess.equals(paper)) {
            if (RandomessMove.equals(rock)){
                System.out.println("You won");
                pointCount.pointCounterSlump++;
                pointCount.totalPoints++;
            }
            else if (RandomessMove.equals(scissor)){
                System.out.println("You lost");
            }
        }

        //If player plays scissor
        else if (playerMoveRandomess.equals(scissor)) {
            if (RandomessMove.equals(paper)){
                System.out.println("You won");
                pointCount.pointCounterSlump++;
                pointCount.totalPoints++;
            }
            else if (RandomessMove.equals(rock)){
                System.out.println("You lost");
            }
        }

    }
}
