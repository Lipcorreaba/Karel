/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package becker;
import becker.robots.*;
import java.awt.Color;
import java.util.*;
/**
 *
 * @author Usuario
 */
public class Limpieza {
    private Robot joe;
    private City unal;
    private Thing balon;
    private Thing balon1;
    private Wall pared;
    public Limpieza(){
        this.unal=new City(13,13);
        this.joe=new Robot(unal,9,6,Direction.NORTH);
        for(int i=0;i<=3;i++){
            this.pared=new Wall(unal,i+1,5,Direction.EAST);
            this.pared=new Wall(unal,i+1,7,Direction.WEST);
            this.pared=new Wall(unal,i+6,5,Direction.EAST);
            this.pared=new Wall(unal,i+6,7,Direction.WEST);
            this.pared=new Wall(unal,4,i+2,Direction.SOUTH);
            this.pared=new Wall(unal,4,i+7,Direction.SOUTH);
            this.pared=new Wall(unal,6,i+2,Direction.NORTH);
            this.pared=new Wall(unal,6,i+7,Direction.NORTH);
        }
        for(int i=0; i<=3;i++){
            for(int j=0;j<=3;j++){
                this.balon=new Thing(unal,i+1,j+2);
                this.balon=new Thing(unal,i+1,j+7);
                this.balon=new Thing(unal,i+6,j+2);
                this.balon=new Thing(unal,i+6,j+7);
            }
        }      
        this.balon1=new Thing(unal,2,6);
        balon1.setColor(Color.BLACK);
        this.balon1=new Thing(unal,5,3);
        balon1.setColor(Color.BLACK);
        this.balon1=new Thing(unal,5,9);
        balon1.setColor(Color.BLACK);
        this.balon1=new Thing(unal,8,6);
        balon1.setColor(Color.BLACK);
    }
    public void Clean(){
        for(int i=0; i<=3;i++){
            for(int j=0;j<=3;j++){
                if (joe.canPickThing()==true){joe.pickThing();}
                if(j<3){joe.move();}
            }
            if(i%2==0){
                for(int k=0;k<=2;k++){
                    joe.turnLeft();
                }
                joe.move();
                for(int k=0;k<=2;k++){
                    joe.turnLeft();
                }
            }else{
                joe.turnLeft();
                joe.move();
                joe.turnLeft();
            }
        }      
    }
    public void Start(){
        joe.turnLeft();
        joe.turnLeft();
        if(joe.getAvenue()!=6){joe.move();}
        joe.move();
        joe.turnLeft();
        joe.move();
        joe.turnLeft();
        joe.move();
    }
    public void Next(){
        for(int j=0;j<5;j++){
            joe.move();
        }
        joe.turnLeft();
        joe.move();
    }
    public void Finish(){
        for(int m=0;m<4;m++){
            joe.move();
        }
        joe.turnLeft();
        joe.move();
    }
}
