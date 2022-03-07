package com.company;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

class pointCount {
    static int pointCounterVok = 0;
    static int pointCounterTid = 0;
    static int pointCounterSlump = 0;
    static int totalPoints = 0;

    static String dateAndTimeOfMatch;

}

public class Turnering extends Meny{

    @Override
    void MenyVal(){

        SpelareFabrik spelareFabrik = new SpelareFabrik();

        Spelare vokalSpelare = spelareFabrik.spelSkapare(SpelarTyp.VOKALER);
        Spelare tidSpelare = spelareFabrik.spelSkapare(SpelarTyp.TID);
        Spelare slumpSpelare = spelareFabrik.spelSkapare(SpelarTyp.SLUMP);
        Meny menyStart = spelareFabrik.menySkapare(MenyTyp.MENYSTART);

        System.out.println("You are meeting Vokalis!");

        vokalSpelare.spelareVal();


        System.out.println("\nRound 2 will be against Tidisson!");

        tidSpelare.spelareVal();


        System.out.println("\nThe final round will be against Randomess!");

        slumpSpelare.spelareVal();


        LocalDateTime DateAndTimeCheck = LocalDateTime.now();
        DateTimeFormatter formatTimeCheck = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String finalDateAndTime = formatTimeCheck.format(DateAndTimeCheck);
        pointCount.dateAndTimeOfMatch = finalDateAndTime;

        System.out.println(
                "\nThe tournament is over!" +
                        "\n\n(1) is a win, (0) is a loss or tie" +
                        "\nYour score is the following:" +
                        "\n" + pointCount.pointCounterVok + " against Vokalis" +
                        "\n" + pointCount.pointCounterTid + " against Tidisson" +
                        "\n" + pointCount.pointCounterSlump + " against Randomess" +
                        "\nYour total score is " + pointCount.totalPoints +
                        "\nScore recorded on: " + finalDateAndTime);


        final AddScore addScore = new AddScore();
        final NyData scoreToAdd = new NyData(
                MenyStart.usernameToUse,
                pointCount.dateAndTimeOfMatch,
                pointCount.pointCounterVok,
                pointCount.pointCounterTid,
                pointCount.pointCounterSlump,
                pointCount.totalPoints);
        addScore.addPlayedMatch(scoreToAdd);

        menyStart.MenyVal();

    }

    public static class AddScore {

        public static final List<NyData> thePlayedMatch = new ArrayList<>();

        public boolean addPlayedMatch(NyData newPlayedMatch) {
            thePlayedMatch.add(newPlayedMatch);
            return true;
        }

    }
}
