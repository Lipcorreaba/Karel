/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package becker;
import becker.robots.*;
import java.awt.Color;

/**
 *
 * @author Usuario
 */
public class Nuggets {
    private Robot joe;
    private City unal;
    private Thing balon;
    private Thing balon1;
    private Wall a;
    public Nuggets(){
        this.unal=new City(10,10);
        this.joe=new Robot(unal,6,7,Direction.NORTH);
        this.balon=new Thing(unal,2,7);
        this.balon=new Thing(unal,3,5);
        this.balon=new Thing(unal,5,4);
        this.balon1=new Thing(unal,7,4);
        this.balon1.setColor(Color.BLUE);
        for(int i=0;i<4;i++){
            this.a=new Wall(unal,1,i+3,Direction.NORTH);
        }
        for(int i=0;i<2;i++){
            this.a=new Wall(unal,6,i+2,Direction.SOUTH);
            this.a=new Wall(unal,i+4,1,Direction.WEST);
            this.a=new Wall(unal,i+1,3,Direction.WEST);
            this.a=new Wall(unal,1,i+4,Direction.SOUTH);
            this.a=new Wall(unal,i+2,4,Direction.WEST);
            this.a=new Wall(unal,i+4,3,Direction.WEST);
            this.a=new Wall(unal,i+5,7,Direction.WEST);
            this.a=new Wall(unal,i+5,4,Direction.WEST);
            this.a=new Wall(unal,i+3,5,Direction.WEST);
            this.a=new Wall(unal,5,i+6,Direction.NORTH);
        }
        for(int j=0;j<3;j++){
            this.a=new Wall(unal,j+3,9,Direction.WEST);
        }
        this.a=new Wall(unal,3,2,Direction.WEST);
        this.a=new Wall(unal,6,2,Direction.WEST);
        this.a=new Wall(unal,6,5,Direction.WEST);
        this.a=new Wall(unal,5,6,Direction.WEST);
        this.a=new Wall(unal,6,8,Direction.WEST);
        this.a=new Wall(unal,1,7,Direction.WEST);
        this.a=new Wall(unal,2,8,Direction.WEST);
        this.a=new Wall(unal,2,6,Direction.WEST);
        this.a=new Wall(unal,3,7,Direction.WEST);
        this.a=new Wall(unal,6,1,Direction.NORTH);
        this.a=new Wall(unal,4,1,Direction.NORTH);
        this.a=new Wall(unal,3,2,Direction.NORTH);
        this.a=new Wall(unal,5,2,Direction.NORTH);
        this.a=new Wall(unal,5,4,Direction.NORTH);
        this.a=new Wall(unal,6,5,Direction.NORTH);
        this.a=new Wall(unal,7,7,Direction.NORTH);
        this.a=new Wall(unal,2,7,Direction.NORTH);
        this.a=new Wall(unal,3,8,Direction.NORTH);
        this.a=new Wall(unal,6,8,Direction.NORTH);
        this.a=new Wall(unal,4,5,Direction.NORTH);
        this.a=new Wall(unal,4,3,Direction.NORTH);
        this.a=new Wall(unal,3,6,Direction.NORTH);
        this.a=new Wall(unal,4,7,Direction.NORTH);
        
        
        
    }
    public void Left(){
        joe.turnLeft();
        joe.move();
        if(joe.canPickThing()==true){
            joe.pickThing();
        }
    }
    public void Right(){
        for(int i=0;i<=2;i++){
            joe.turnLeft();
        }
        joe.move();
        if(joe.canPickThing()==true){
            joe.pickThing();
        }
    }
    public void Go(){
        joe.move();
        if(joe.canPickThing()==true){
            joe.pickThing();
        }
    }
    public void Round(){
        for(int i=0;i<=1;i++){
            joe.turnLeft();
        }
        joe.move();
    }
}
