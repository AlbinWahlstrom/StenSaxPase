package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class NyData {

    private String name;
    private String dateAndTime;
    private Integer scoreVok;
    private Integer scoreTid;
    private Integer scoreSlump;
    private Integer totalScore;


    public NyData(String name, String dateAndTime, Integer scoreVok, Integer scoreTid, Integer scoreSlump, Integer totalScore) {
        this.name = name;
        this.dateAndTime = dateAndTime;
        this.scoreVok = scoreVok;
        this.scoreTid = scoreTid;
        this.scoreSlump = scoreSlump;
        this.totalScore = totalScore;
    }

    public String getName() {
        return name;
    }

    public String getDateAndTime() {
        return dateAndTime;
    }

    public Integer getScoreVok() {
        return scoreVok;
    }

    public Integer getScoreTid() {
        return scoreTid;
    }

    public Integer getScoreSlump() {
        return scoreSlump;
    }

    public Integer getTotalScore() {
        return totalScore;
    }

    @Override
    public String toString() {
        return
                "Name: " + name +
                        "\nTime of tournament: " + dateAndTime +
                        "\nScore:" + scoreVok +
                        ", " + scoreTid +
                        ", " + scoreSlump +
                        ", totalscore: " + totalScore;
    }

}

public class Spardata extends Meny{

    @Override
    void MenyVal(){
        SpelareFabrik spelareFabrik = new SpelareFabrik();
        Meny menyStart = spelareFabrik.menySkapare(MenyTyp.MENYSTART);

//        Turnering.AddScore.thePlayedMatch.forEach(MenyStart.usernameToUse -> );
//        System.out.println("\n" + Turnering.AddScore.thePlayedMatch + "\n");

        Turnering.AddScore.thePlayedMatch.forEach(System.out::println);



        System.out.println("\nAverage score is: \n" +
                Turnering.AddScore.thePlayedMatch
                        .stream()
                        .filter(name -> name.getName().equals(MenyStart.usernameToUse))
                        .collect(Collectors.averagingInt(NyData::getTotalScore))
        );

        System.out.println("\nHighest score is: \n" +
                Turnering.AddScore.thePlayedMatch
                        .stream()
                        .max(Comparator.comparing(NyData::getTotalScore))
                        .orElseThrow()
        );

        System.out.println("\nLowest score is: \n" +
                Turnering.AddScore.thePlayedMatch
                        .stream()
                        .min(Comparator.comparing(NyData::getTotalScore))
                        .orElseThrow()
        );


        menyStart.MenyVal();
    }

}
