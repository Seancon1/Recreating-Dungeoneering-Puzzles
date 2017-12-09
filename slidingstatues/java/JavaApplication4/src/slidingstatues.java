/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sean
 */
public class slidingstatues {

    public static Board[] room;
    
    public static void main(String[] args) {
        System.out.println("Testing this program");
        createBoard();
    }
    
    public static void createBoard() {
        //Create empty instance of a board int ID and int Size of square in this case 5 x 5
        Board board = new Board(0, 5);
        
        //add a board to the list
        room[room.length] = board;
        
        //add a new instance of a statue to the board with coordinates 0,0
        board.addStatue(new Statue(0, 0));
        board.addStatue(new Statue(0, 1));
        
        //Display the coordinates of the statues
        board.inspectStatues();
    }
    
}
