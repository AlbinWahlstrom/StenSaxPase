package com.company;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Tidisson extends Spelare {

        Scanner input = new Scanner(System.in);

        @Override
        void spelareVal() {

            String rock = "Rock";
            String scissor = "Scissor";
            String paper = "Paper";
            String playerMoveTid;
            String tidissonMove = "";
            int minuteCount;


            LocalTime TimeCheck = LocalTime.now();
            DateTimeFormatter formatTimeCheck = DateTimeFormatter.ofPattern("mm");
            String formattedTime = formatTimeCheck.format(TimeCheck);

            minuteCount = Integer.valueOf(formattedTime);

            if (minuteCount == 0 || minuteCount <= 20){
                tidissonMove = rock;
            }
            else if (minuteCount == 21 || minuteCount < 40){
                tidissonMove = paper;
            }
            else if (minuteCount >= 41){
                tidissonMove = scissor;
            }

            while (true) {
                System.out.println("\nPlease enter your move (Rock, Paper, or Scissor)");
                playerMoveTid = input.nextLine();
                if (playerMoveTid.equals(rock) || playerMoveTid.equals(paper) || playerMoveTid.equals(scissor)){
                    break;
                }
                System.out.println(playerMoveTid + " is not a valid input. Please try again:");
            }

            System.out.println(MenyStart.usernameToUse + " played " + playerMoveTid);
            System.out.println("Tidisson played " + tidissonMove);


            if (playerMoveTid.equals(tidissonMove)){
                System.out.println("It is a tie. no winner");
            }

            //If player plays rock
            else if (playerMoveTid.equals(rock)) {
                if (tidissonMove.equals(scissor)){
                    System.out.println("You won");
                    pointCount.pointCounterTid++;
                    pointCount.totalPoints++;
                }
                else if (tidissonMove.equals(paper)){
                    System.out.println("You lost");
                }
            }

            //If player plays paper
            else if (playerMoveTid.equals(paper)) {
                if (tidissonMove.equals(rock)){
                    System.out.println("You won");
                    pointCount.pointCounterTid++;
                    pointCount.totalPoints++;
                }
                else if (tidissonMove.equals(scissor)){
                    System.out.println("You lost");
                }
            }

            //If player plays scissor
            else if (playerMoveTid.equals(scissor)) {
                if (tidissonMove.equals(paper)){
                    System.out.println("You won");
                    pointCount.pointCounterTid++;
                    pointCount.totalPoints++;
                }
                else if (tidissonMove.equals(rock)){
                    System.out.println("You lost");
                }
            }

        }


}



