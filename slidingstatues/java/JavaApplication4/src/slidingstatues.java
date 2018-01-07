
import java.util.Scanner;

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
    
    public static int tick;
    public static Boolean ticking = true;
    public static Board[] room;
    
    //interface
    
    public static void main(String[] args) {
 
        //Generate board gfx 
        Interface disPlay = new Interface();
            disPlay.init();
            disPlay.start();
            disPlay.setVisible(true);
            
        //run loop
        do{
            print("Window status: " + disPlay.isShowing() +" | "+ disPlay.isVisible());
            askForInput();
           //wait for action from board, 
        } while(ticking);
    }
    
    public static void createBoard() {
        //Create empty instance of a board
        Board board = new Board(0, 5);
        //add to the list a board, there should be 2 mocks and two randomized statues to match
        room[room.length] = board;
        //add a new instance of a statue to the board with coordinates 0,0
        board.addStatue(new Statue(0, 0));
        board.addStatue(new Statue(0, 1));
    }
    
    public static void print(String output) {
         System.out.print(output);
    }
    
    //Using this to get input from a player, this will change
    public static String askForInput() {
            Scanner reader = new Scanner(System.in);  // Reading from System.in      
            String input = reader.nextLine();
            return input;
    }
    
}
