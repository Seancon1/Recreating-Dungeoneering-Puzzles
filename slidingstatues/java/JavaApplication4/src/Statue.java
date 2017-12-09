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
    
    public void setType(int inputType) {
    this.type = inputType;
    }
    
    public void moveStatue(int x, int y) {
    this.x = x;
    this.y = y;
    }
    
    public String displayInfo() {
    
        return "";
    }
    
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
    
}
