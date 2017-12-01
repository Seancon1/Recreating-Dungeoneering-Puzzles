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

    /**
     * @param args the command line arguments
     */
    
    public static Board[] room;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
    
    public void createBoard() {
        //Create empty instance of a board
        Board board = new Board(0, 5);
        //add to the list a board, there should be 2 mocks and two randomized statues to match
        room[room.length] = board;
        //add a new instance of a statue to the board with coordinates 0,0
        board.addStatue(new Statue(0, 0));
        board.addStatue(new Statue(0, 1));
    }
    
    public void inspect(){
    
    }
}
