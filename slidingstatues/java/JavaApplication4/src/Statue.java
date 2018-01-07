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

    public Statue(int x, int y) {
    this.x = x;
    this.y = y;    
    }
    
    public int getType() {
    return this.type;
    }
    public int getX() {
    return this.x;
    }
    public int getY() {
    return this.y;
    }
    
    public void setType(int inputType) {
    this.type = inputType;
    }
    
    public void moveStatue(int x, int y) {
    this.x = x;
    this.y = y;
    } 
    
    public String inspect() {
        return "type" + this.type + " ("+this.x+","+this.y+")";
    }
    
<<<<<<< HEAD
=======
    /*
    Gets coordinates for the statue piece from defined value (x or y)
    */
    public int getCoord(String input)
    {
        if((input) == "x") {
          return this.x;  
        } else {
          return this.y;
        }
    } 
    
>>>>>>> 23ac589371ac6dc35d4aa3df56fe7fa7f16ca077
}
