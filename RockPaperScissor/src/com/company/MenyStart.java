package com.company;

import java.util.Scanner;

public class MenyStart extends Meny {

    static Scanner scanner = new Scanner(System.in);
    static String usernameToUse;

    SpelareFabrik spelareFabrik = new SpelareFabrik();

    Meny turnering = spelareFabrik.menySkapare(MenyTyp.TURNERING);
    Meny spardata = spelareFabrik.menySkapare(MenyTyp.SPARDATA);

    @Override
    void MenyVal(){

        pointCount.pointCounterVok = 0;
        pointCount.pointCounterTid = 0;
        pointCount.pointCounterSlump = 0;
        pointCount.totalPoints = 0;

        System.out.println("Please enter your name");
        usernameToUse = scanner.nextLine();
        System.out.println("Hello " + usernameToUse + ", and welcome to the R.P.S Tournament!"  );

        while (true) {
            System.out.println("Please enter one of the following numbers to access the wanted option.\n" +
                    "1. Play tournament\n" +
                    "2. See played tournaments");
            String menyInput = scanner.nextLine();
            if (menyInput.equals("1")) {
                turnering.MenyVal();
                break;
            }
            else if (menyInput.equals("2")){
                spardata.MenyVal();
                break;
            }
            System.out.println(menyInput + " is not a valid input. Please try again:");
        }
    }

}
