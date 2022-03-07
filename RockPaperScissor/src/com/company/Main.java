package com.company;

//Försökt använda Factory design pattern för detta projekt

public class Main {


    public static void main(String[] args) {

        SpelareFabrik spelareFabrik = new SpelareFabrik();

        Meny menyStart = spelareFabrik.menySkapare(MenyTyp.MENYSTART);

        menyStart.MenyVal();



    }

}
