package com.mohit.section4;

public class MethodExamples {


    public static void main(String[] args) {
        disaplayHighScorePosition("Tim",calculateHighScorPosition(1500));
        disaplayHighScorePosition("Bob",calculateHighScorPosition(900));
        disaplayHighScorePosition("Percy",calculateHighScorPosition(400));
        disaplayHighScorePosition("Gilbert",calculateHighScorPosition(50));
        disaplayHighScorePosition("Mohit",calculateHighScorPosition(1000));
        disaplayHighScorePosition("RCarol",calculateHighScorPosition(500));
        disaplayHighScorePosition("Frank",calculateHighScorPosition(100));
    }


    public static void disaplayHighScorePosition(String playerName, int playerPosition){

        System.out.println("Player "+playerName+" managed to the position "+playerPosition+
                " on the high score table");
    }

    public static int calculateHighScorPosition(int playerScore ){

//        if (playerScore>=1000 )
//            return 1;
//
//        Condition 'playerScore<1000' is always 'true' when reached
//        if (playerScore>=500 && playerScore<1000 )
//            return 2;
//        if (playerScore>=100 && playerScore<500 )
//            return 3;
//        return 4;

//        if (playerScore>=1000 )
//            return 1;
//        if (playerScore>=500 )
//            return 2;
//        if (playerScore>=100 )
//            return 3;
//        return 4;


//        other way

    int position=4;
        if (playerScore>=1000 )
            position= 1;
       else if (playerScore>=500 )
            position= 2;
        else if (playerScore>=100 )
            position= 3;
        return position;
    }

}
