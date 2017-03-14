/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author slmns
 */
public abstract class ChessPiece {
    private String name;
    private String color;
    private int PositionX;
    private int PositionY;
    
    
    

    public ChessPiece(String name, String color, int PositionX, int PositionY) {
        this.name = name;
        this.color = color;
        this.PositionX = PositionX;
        this.PositionY = PositionY;
    }
    
    public boolean CanMoveTo(int x, int y){
        PositionX = x;
        PositionY = y;
        return x<8 && x>-8 && y<8 && y>-8;
    }
    public String positionToField(int x, int y){
        if (x == 1){
            return "a";
        } if (x == 2){
            return "b";
        } if(x == 3){
            return "c";
        }if (x == 4){
            return "d";
        } if (x == 5){
            return "e";
        } if(x == 6){
            return "f";
        } if (x == 7){
            return "g";
        } if(x == 8){
            return "h";
    }if (y == 1){
            return "1";
        } if (x == 2){
            return "2";
        } if(x == 3){
            return "3";
        }if (x == 4){
            return "4";
        } if (x == 5){
            return "5";
        } if(x == 6){
            return "6";
        } if (x == 7){
            return "7";
        } else {
            return "8";
    }
    }

    public ArrayList possibleMoves(){
        
    }
}

