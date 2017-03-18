/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

/**
 *
 * @author slmns
 */
public class Rook extends ChessPiece {
    //    Opret klasserne Rook, Bishop og Knight, der alle extender ChessPiece. Lav constructors,
//    der kaldes med parametrene (color, x , y) og som sender parametrene videre vha. 
//    superklassens constructor.

    public Rook(String color, int PositionX, int PositionY) {
        super("Rook", color, PositionX, PositionY);
    }

    //    Lav en ny metode canMoveTo(int x, int y) i Rook, Bishop og Knight,
//    som returnerer true for alle de felter den pågældende brik kan rykke til. 
    @Override
    public boolean CanMoveTo(int x, int y) {

        if (super.CanMoveTo(x, y)) {
            if (x != PositionX || y != PositionY) {
                return true;
            }

        }
        return false;

    }
}
