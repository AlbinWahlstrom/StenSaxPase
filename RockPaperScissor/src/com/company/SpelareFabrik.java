package com.company;

public class SpelareFabrik {

    public Spelare spelSkapare (SpelarTyp spelarTyp){
        return switch (spelarTyp){
            case VOKALER -> new Vokalis();
            case TID -> new Tidisson();
            case SLUMP -> new Randomess();
        };
    }
    public Meny menySkapare (MenyTyp menyTyp){
        return switch (menyTyp){
            case TURNERING -> new Turnering();
            case SPARDATA -> new Spardata();
            case MENYSTART -> new MenyStart();
        };
    }
}
