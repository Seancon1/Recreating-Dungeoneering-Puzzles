/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sean
 */
public class Statue {
    
    private int type;
    private int x;    
    private int y;    
    //defined by the game board, 5 for 5x5 board
    private int boundry;

    
    public Statue(int x, int y, int boundry) {
    this.x = x;
    this.y = y;    
    this.boundry = boundry;

    }
    
    public void setType(int inputType) {
    this.type = inputType;
    }
    
    public void moveStatue(int x, int y) {
    //check if it exceeds boundry
    if((x > boundry) && (y > boundry)){
    //do nothing and or print custom msg?
    } else {
    this.x = x;
    this.y = y;
    }
    }
    
}
