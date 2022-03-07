package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Vokalis extends Spelare{

    Scanner input = new Scanner(System.in);

    @Override
    void spelareVal() {



        int vowelCount = 0;
        String rock = "Rock";
        String scissor = "Scissor";
        String paper = "Paper";
        String regex = "(?i)[aeiouy]";
        String playerMoveVok;
        String vokalisMove = "";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(MenyStart.usernameToUse);

        while (matcher.find()){
            vowelCount++;
        }

        if (vowelCount == 0 || vowelCount == 1){
            vokalisMove = rock;
        }
        else if (vowelCount == 2 || vowelCount == 3){
            vokalisMove = paper;
        }
        else if (vowelCount == 4 || vowelCount > 4){
            vokalisMove = scissor;
        }

        while (true) {
            System.out.println("\nPlease enter your move (Rock, Paper, or Scissor)");
            playerMoveVok = input.nextLine();
            if (playerMoveVok.equals(rock) || playerMoveVok.equals(paper) || playerMoveVok.equals(scissor)){
                break;
            }
            System.out.println(playerMoveVok + " is not a valid input. Please try again:");
        }

        System.out.println(MenyStart.usernameToUse + " played " + playerMoveVok);
        System.out.println("Vokalis played " + vokalisMove);


        if (playerMoveVok.equals(vokalisMove)){
            System.out.println("It is a tie. no winner");
        }

        //If player plays rock
        else if (playerMoveVok.equals(rock)) {
            if (vokalisMove.equals(scissor)){
                System.out.println("You won");
                pointCount.pointCounterVok++;
                pointCount.totalPoints++;
            }
            else if (vokalisMove.equals(paper)){
                System.out.println("You lost");
            }
        }

        //If player plays paper
        else if (playerMoveVok.equals(paper)) {
            if (vokalisMove.equals(rock)){
                System.out.println("You won");
                pointCount.pointCounterVok++;
                pointCount.totalPoints++;
            }
            else if (vokalisMove.equals(scissor)){
                System.out.println("You lost");
            }
        }

        //If player plays scissor
        else if (playerMoveVok.equals(scissor)) {
            if (vokalisMove.equals(paper)){
                System.out.println("You won");
                pointCount.pointCounterVok++;
                pointCount.totalPoints++;
            }
            else if (vokalisMove.equals(rock)){
                System.out.println("You lost");
            }
        }

    }


}
