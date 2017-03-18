/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

import java.util.ArrayList;

/**
 *
 * @author slmns
 */
public class Chess {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//Lav et program, der opretter et array af ChessPiece med 3 pladser.
//Opret et objekt af hver type Rook (på b2), Bishop (på c7) og Knight (på d4) og læg dem ind i arrayet.
//Løb arrayet igennem og udskriv brikkerne vha. show().
//Prøv at flytte Rook til d2, Bishop til h1 og Knight til b3. (Benyt move-metoden.)
//Løb arrayet igennem og udskriv brikkerne vha. show().

        ArrayList<ChessPiece> chess;
        chess = new ArrayList<>();
        Rook rook = new Rook("Black",2,2);
        Bishop bishop = new Bishop("Black",3,7);
       Knight knight = new Knight ("Black",4,4);
       
       chess.add(rook);
       chess.add(bishop);
       chess.add(knight);
       
       rook.Move(4, 2);
       bishop.Move(8, 1);
       knight.Move(2, 3);
       for(ChessPiece cp: chess){
           System.out.println(cp.show());
       }
       
    }
    
}
