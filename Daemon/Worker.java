/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Daemon;

import java.util.Random;

/**
 *
 * @author riyaarora
 */
public class Worker {
    public int randomRoll(){
        return new Random().nextInt(12)+1;
    }
    
    public boolean decideWinner(int playerRoll, int compRoll){
        return playerRoll > compRoll;
    }
    
    public boolean checkGameWinner(int playerScore, int compScore){
        return playerScore >= compScore;
    }
}
