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
//    Opret en abstrakt klasse ChessPiece med variable til name,
//    color (Sort/Hvid) samt xPosition og yPosition.

    private String name;
    private String color;
    public int PositionX;
    public int PositionY;
    private ArrayList<Integer> moves;

    
//Lav en constructor, der kaldes med de fire parametre og sætter variablene.
    public ChessPiece(String name, String color, int PositionX, int PositionY) {
        this.name = name;
        this.color = color;
        this.PositionX = PositionX;
        this.PositionY = PositionY;
        moves = new ArrayList<Integer>();
    }
//    Lav en metode canMoveTo(int x, int y), 
//    som kaldes med positionen på et felt og returnerer true, 

    public boolean CanMoveTo(int x, int y) {
        
        return x <= 8 || x >= 1 || y <= 8 || y >= 1;
    }


//    Lav en metode positionToField(int x, int y), som returnerer navnet på et felt.
    public ArrayList positionToField(int x, int y) {        
        ArrayList<String> a = new ArrayList<>();
        switch (x) {
            case 1:
                a.add("a");
                break;
            case 2:
                a.add("b");
                break;
            case 3:
                a.add("c");
                break;
            case 4:
                 a.add("d");
                break;
            case 5:
                a.add("e");
                break;
            case 6:
                a.add("f");
                break;
            case 7:
                a.add("g");
                break;
            case 8:
                a.add("h");

        }
        switch (y) {
            case 1:
                a.add("1");
                break;
            case 2:
                a.add("2");
                break;
            case 3:
                a.add("3");
                break;
            case 4:
                a.add("4");
                break;
            case 5:
                a.add("5");
                break;
            case 6:
                a.add("6");
                break;
            case 7:
                a.add("7");
                break;
            case 8:
                a.add("8");
                break;
        }
        return a;

    }
//Lav en metode possibleMoves(), som returnerer navnene på alle de felter brikken kan rykke til.

    public ArrayList<Integer> possibleMoves() {      
        
        
        return moves;

    }
//Lav en metode show(), der udskriver color, name og navnet på det felt brikken står på i første linie,
//    og i næste linie udskriver ”Kan rykke til: ” efterfulgt af alle de felter brikken kan rykke til.

    public String show() {
       return "Color: " + color + " Name: " + name + 
                " Position: " +PositionX + " , " + PositionY + " Position now= "
               + positionToField(PositionX, PositionY)+
        "\n Kan rykke til: " + possibleMoves();
    }
    
// Lav en metode move(int x, int y), der flytter brikken til (x,y) hvis det er et lovligt træk.
    
    public void Move(int x, int y){
        
        if(CanMoveTo(x, y)){
        PositionX = x;
        PositionY = y;
        }else{
            System.out.println(name + " Cant move ");
        }
    }
    
//    Lav get- og set-metoder, til alle variable.

    
    public int getPositionX() {
        return PositionX;
    }

    public void setPositionX(int PositionX) {
        this.PositionX = PositionX;
    }

    public int getPositionY() {
        return PositionY;
    }

    public void setPositionY(int PositionY) {
        this.PositionY = PositionY;
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
