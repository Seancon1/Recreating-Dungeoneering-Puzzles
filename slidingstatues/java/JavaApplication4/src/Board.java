import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sean
 */
public class Board {
    
    private int size;
    private int id;
    private static Statue[] list;
    
    public Board(int id, int size) {
        this.id = id;
        this.size = size;
    }
    
    public void addStatue(Statue item){
    this.list[list.length] = item;
    }
    
<<<<<<< HEAD
    public String inspect() {
        //for debugging
     return  "id: " + this.id + " | size: " + this.size ;
    }
    
=======
    public void inspectStatues() {
    System.out.print("Inspecting statues");
    for(Statue x : this.list){
        System.out.println(x.getCoord("x"));
        System.out.println(x.getCoord("y"));
    }
    }
>>>>>>> 23ac589371ac6dc35d4aa3df56fe7fa7f16ca077
    
}
