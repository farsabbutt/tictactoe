package com.company;

/**
 * Created by Qosmio on 8/22/2017.
 */
public class Human extends Player {


void playTurn(int player, int turn){

    while(Main.buttonClicked == 0){
        System.out.println(".");
        switch(Main.buttonClicked){

            case 1: Main.state[0][0] = player; break;
            case 2: Main.state[0][1] = player; break;
            case 3: Main.state[0][2] = player; break;
            case 4: Main.state[1][0] = player; break;
            case 5: Main.state[1][1] = player; break;
            case 6: Main.state[1][2] = player; break;
            case 7: Main.state[2][0] = player; break;
            case 8: Main.state[2][1] = player; break;
            case 9: Main.state[2][2] = player; break;



        }
    }
    Main.buttonClicked = 0;

}

}
